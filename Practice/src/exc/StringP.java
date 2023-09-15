package exc;

import java.util.*;
public class StringP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         String p = sc.next();
         int n = p.length();
         int t=1;
         while(n>0) {
        	 for(int i=0;i<t;i++)
        		 System.out.print(p.charAt(i));
        	 System.out.println();
        	 t++;
        	 n--;
         }
         
	}

}
