package exc;

import java.util.*;
public class equalbirium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String a=sc.next();
		String b=sc.next();
		
		s=s.replaceAll(a,"0");
		s=s.replaceAll(b, a);
		s=s.replaceAll("0",b);
		System.out.print(s);
		
		
                
	}

}
