package exc;


import java.util.*;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n];
		int p;
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		if(n<2 || a==null)
			System.out.print(-1);
		else {
		Arrays.sort(a);
		int k = a[0] + a[1];
		if(k<s)
		System.out.print(a[0]*a[1]);
		else
			System.out.print(0);
		}

	}

}

