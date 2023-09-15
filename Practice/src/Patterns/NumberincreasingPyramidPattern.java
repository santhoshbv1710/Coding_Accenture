package Patterns;

import java.util.*;

public class NumberincreasingPyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
         int t=2;
		while(n>0) {
			for(int i=1;i<t;i++)
				System.out.print(i);
			System.out.println();
			t++;
			n--;
		}
	}
}
