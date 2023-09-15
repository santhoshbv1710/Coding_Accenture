package exc;

import java.util.*;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int u = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		if(a==null)
			System.out.print("-1");
		
		int k = r*u;
		int s=0;
		int c=0;
		for(int i=0;i<n;i++) {
			
			s += a[i];
			c++;
			if(s>=k) 
				break;
			}
		if(s<k)
			System.out.print("0");
		

		System.out.print(c); 
	}

}
