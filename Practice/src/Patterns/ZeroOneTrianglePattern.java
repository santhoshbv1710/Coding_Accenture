package Patterns;

import java.util.*;
public class ZeroOneTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=1;
       int k=0;
         while(n>0) {

        	 for(int i=0;i<t;i++) {
        		 if(t%2 != 0) {
        		  if(i%2 == 0)
        		  System.out.print("1");
        		  else
        			  System.out.print("0");
        		 }
        		  if(t%2==0) {
        			  if(i%2 == 0)
        				  System.out.print("0");
            		  else
            			  System.out.print("1");
        		  }
        	 }
        	 System.out.println();
        	 n--;
        	 t++;
         }  
	}
}
