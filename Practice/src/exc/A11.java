package exc;


import java.util.*;
public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r ="";
        String a = sc.next();
        String b = sc.next();
        
       s = s.replaceAll(a,"0");
       String t = s.replaceAll(b, a);
       String k = t.replaceAll("0",b);
        
    /*    for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) == a)
        		r+=b;
        	else if(s.charAt(i) == b)
        		r+=a;
        	else
        		r+=s.charAt(i);
        }*/ 
        System.out.print(k); 
	}

}
