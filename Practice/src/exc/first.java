package exc;

import java.util.*;

public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				count++;
			}
		
				
			
		
			
		}
		if(count==2) {
			System.out.print("prime");
		}
		else {
			System.out.println("not prime");
		}
		
			
		}

	}


