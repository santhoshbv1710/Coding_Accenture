package exc;

import java.util.*;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       String s = sc.next();
       int n = s.length();
       
       int r = Integer.valueOf(s.charAt(0));
      
       for(int i=1;i<n;i+=2) {
       char p = s.charAt(i);
    	   if(p == 'A') {
    		   r &= Integer.valueOf(s.charAt(i+1));
    		 
    	   }
    	   else if(p == 'B') {
    		   r |= Integer.valueOf(s.charAt(i+1));
    	   }  
    	   else if(p == 'C') {
    		   r ^= Integer.valueOf(s.charAt(i+1));
    	   }
	}
      System.out.print((char)r);
  }
}
