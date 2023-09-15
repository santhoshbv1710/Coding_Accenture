package exc;

import java.util.*;

public class Work {
	
	public static void Exp(ArrayList<String> r, String c, String ip, int t,int p,int cv, int l ) {
		
		if(p == ip.length()) {
			if(cv == t)
				r.add(c);
			return;
		}
		
		for(int i=p;i<ip.length();i++) {
			if(i != p && ip.charAt(p) == '0' )
				break;
			String pt  = ip.substring(p,i+1);
			int cur = Integer.parseInt(pt);
			
			if(p==0)
				Exp(r,c+pt,ip,t,i+1,cur,cur);
			else {
				Exp(r,c+"+"+pt,ip,t,i+1,cv+cur,cur);
				Exp(r,c+"-"+pt,ip,t,i+1,cv-cur,-cur);
				Exp(r,c+"*"+pt,ip,t,i+1,cv-l+l*cur,l*cur);
			}
		}
		
	}
	
	static ArrayList<String> gExp(String ip,int t){
		
		ArrayList <String> r = new ArrayList<String>();
		Exp(r,"",ip,t,0,0,0);
		return r;
	}
    
	static int pr(ArrayList<String>r) {
		
		for(int i=0;i<r.size();i++)
			System.out.print(r.get(i)+" ");
		    System.out.println();
		    
		    return 0;
			
	}
	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	int t = sc.nextInt();
	
	ArrayList<String> r = gExp(s,t);
	
	pr(r);
	
	}

}
