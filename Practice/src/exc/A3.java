package exc;

import java.util.*;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if(n<4)
        	System.out.print("0");
        	
        if(s.charAt(0) >= '0' && s.charAt(0) <= '9')
        	System.out.print("0");
        
        int c=0;
        int t=0;
        for(int i=0;i<n;i++) {
        	if(s.charAt(i)==' ' || s.charAt(i) == '/')
        		System.out.print("0");	
        	if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
        		c++;
        	if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        		t++;
        		
        }
        if(c>0 && t>0)
        	System.out.print("1");
        else
        	System.out.print("0");
	}

}
