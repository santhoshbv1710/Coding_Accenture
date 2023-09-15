package exc;

import java.util.*;
public class FLAMES {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        String f = sc.nextLine();
        String b = m.replaceAll(" ","");
        String g = f.replaceAll(" ","");
        int c=0;
        char x[] = b.toCharArray();
        char y[] = g.toCharArray();
        for(int i=0;i<x.length;i++) {
        	char t = x[i];
        	for(int j=0;j<y.length;j++) {
         		if(t==y[j]) {
        		  x[i]=y[j]='0';
        			c++;
        			break;
        		}
        	}
        }
        int n = (b.length()+g.length())-(c*2); 
        StringBuilder sb = new StringBuilder("FLAMES");
        
        int k = sb.length();
        int p=0;
        while(k>1) {
        	int d = (p+n-1)%k;
        	sb.deleteCharAt(d);
        	p = d%k;
        	k = sb.length();
        }
        System.out.print(sb.toString()); 
	}
}
