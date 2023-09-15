package Patterns;

import java.util.*;
public class PalindromeTrianglePattern {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 System.out.println("1");
	 int t=2;
	 int e=3;
	 while(n-1>0) {		 
		 for(int i=t;i>0;i--)
			 System.out.print(i);
		 for(int i=2;i<e;i++)
			 System.out.print(i); 
		 System.out.println();
		 n--;
		 t++;
		 e++;
	 }
	}
}
