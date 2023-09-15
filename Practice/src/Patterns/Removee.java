package Patterns;

import java.util.Scanner;

public class Removee {

		static  int remov(int a[],int n) {
			int t[]= new int[n];
			int j=0;
			for(int i=0;i<n-1;i++) 
			 if(a[i] != a[i+1])
				 t[j++] = a[i];
			 t[j++] = a[n-1];	
			
			for(int i=0;i<j;i++)
				a[i]=t[i];
			
			return j;
			
			}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			
			n = remov(a,n);
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
		}
		
	}
		
}


