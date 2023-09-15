package exc;


import java.util.*;
public class A17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();
        int n;
        int r;
        int d;
        for (int i = f; i <= l; i++)
        {
            r = 0;
            n = i;
            while (n != 0)
    	{
    	        d = n % 10;
    	        r= r* 10 + d;
    	        n = n / 10;
    	}
            if (i == r)
    	        System.out.print(i+" ");;
        }
	}
}
