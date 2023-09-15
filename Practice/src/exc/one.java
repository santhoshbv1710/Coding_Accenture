package exc;

import java.util.*;
public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
		int c=n;
		String s = sc.next();
		int l = (2*n)-1;
		int p = l/2;
		int k=1;
		int a=p;
		while(n>0) {
			for(int i=p;i>-1;i--) {
				System.out.print(" ");
			}
			for(int i=0;i<k;i++)
				System.out.print(s);
			System.out.println();
			p--;
			k+=2;
			n--;
		}
		
		 
	}

}
