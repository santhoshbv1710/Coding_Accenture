package exc;

import java.util.*;
public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String r="";
		for(int i=n;i<=k;i++) {
			if(i%2 == 0) {
				for(int j=0;j<100;i++) {
				      if(Math.pow(2, j) == i) {
				    	  r += String.valueOf(j);
				    	  break;
				      } 
				}
				
			}
		}
		
 
	}

}
