package exc;

import java.util.*;
public class A8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        String r ="";
        while(k>0) 
        {
        	int q = k/l;
        	int b = k%l;
        	if(b>=10 && b<=35) {
        		char c = (char)('A' + b-10);
        		r += c;
        	}
        	else {
        		String h = String.valueOf(b);
        		r += h;
        	}
        	if(q==0) {
        		for(int i=r.length()-1;i>-1;i--)
        			System.out.print(r.charAt(i));		
        	}
        	k = q;
        }
	}
}
