package exc;

import java.util.*;
public class A10{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int k = sc.nextInt();
	    int c=0;
	    int r=0;
	    while(n>0 || k>0) {
	    	int t = n%10;
	    	int p = k%10;
	    	int s = t+p+r;
	        r = s/10;
	    	if(s>9) {
	    		c++;
	    	}
	    	n /=10;
	    	k /=10;
	    }
         System.out.print(c);
	}
}
