package Patterns;

import java.util.*;
public class NumberchangingPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
          int t=1;
          int p=1;
		  int k=1;
		  int c=1;
		//  System.out.print("1");
         while(n>0) { 
        	 for(int i=p;i<t+1;i++)
        		 System.out.print(i+" ");
       
        	 System.out.println();
        	 p+=k;
             t = p+c;
             c++;
        	 k++;
        	 n--;
         }
	}
}
