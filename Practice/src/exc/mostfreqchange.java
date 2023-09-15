package exc;

import java.util.*;

public class mostfreqchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int c=0;
        int m=0;
        String t="";
        for(int i=0;i<n;i++){
        	c=0;
        	for(int j=i+1;j<n;j++) {
        		if(s.charAt(i)==s.charAt(j))
        			c++;
        		if(c>m) {
        			m=c;
        			t = String.valueOf(s.charAt(i));
        		}
        	}
        }
        System.out.print(s.replaceAll(t,"x"));
	}
}
