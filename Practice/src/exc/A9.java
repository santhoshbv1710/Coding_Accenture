package exc;

import java.util.*;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		String res = "";
		int n = s.length();
		  for (int i = 0; i < n; i++)
	        {
	            if (s.charAt (i) == '-')
	                res = s.charAt (i) + res;
	    	    else
	                res = res + s.charAt (i);
	        }
		  
		  System.out.print(res);
	}

}
