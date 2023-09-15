package exc;

import java.util.*;
public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int m = sc.nextInt ();
        int s=0;
        int t=0;
        for(int i=1;i<=m;i++){
        	if(i%n==0)
        		s+=i;
        	else
        		t+=i;
        }
        System.out.print(Math.abs(s-t));
	}

}
