package exc;


import java.util.*;
public class A16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n*10;
        int s=0;
        for(int i=n;i<=k;i+=n) {
        s += i;
        }
        System.out.print(s);
	}

}
