package exc;


import java.util.*;

public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}		
		
		for(int i=0;i<n;i++) {
			int j;
			for( j=0;j<i;j++) {
				if(a[i] == a[j])
					break;
			}
			if(i==j)
				System.out.print(a[j]+" ");
			
		}
	    }
		
	}

