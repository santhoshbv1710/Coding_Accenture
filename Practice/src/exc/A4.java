package exc;

import java.util.*;
public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
 
		int k = sc.nextInt ();
	    int d = sc.nextInt ();
	    int c=0;
	    
	    for(int i=0;i<n;i++) {
			if(Math.abs(k-a[i]) <= d)
				c++;
		}
	    if(c>0)
			System.out.print(c);
		else
			System.out.print("-1");
	   
	}

}
