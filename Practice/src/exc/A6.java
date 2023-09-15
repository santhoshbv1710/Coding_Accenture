package exc;

import java.util.Scanner;

import java.util.*;
public class A6 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		if(n%2==0) {
			int k=n/2;
			int b[] = new int[k];
			int c[] = new int[k];
			int t=0,p=0;
		for(int i=0;i<n;i+=2) {
			b[t++] = a[i];
		}
		for(int j=1;j<n;j+=2) {
			c[p++] = a[j];
		}
		Arrays.sort(b);
		Arrays.sort(c);
		System.out.print(b[k-2]+c[k-2]);
		}
		if(n%2!=0) {
			int k=(n/2)+1;
			int m = n/2;
			int b[] = new int[k];
			int c[] = new int[m];
			int t=0,p=0;
		for(int i=0;i<n;i+=2) {
			b[t++] = a[i];
		}
		for(int j=1;j<n;j+=2) {
			c[p++] = a[j];
		}
		Arrays.sort(b);
		Arrays.sort(c);;
		
		System.out.print(b[1]+c[1]);
		}
	}
}
