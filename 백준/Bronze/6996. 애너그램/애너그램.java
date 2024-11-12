import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    for (int i=0; i<n; i++) {
	        String s1 = sc.next();
	        String s2 = sc.next();
	        char[] a1 = s1.toCharArray();
	        char[] a2 = s2.toCharArray();
	        
	        Arrays.sort(a1);
	        Arrays.sort(a2);
	        
	        if (Arrays.equals(a1, a2)==true) 
	            System.out.println(s1 + " & " + s2 + " are anagrams.");
	        else
	        	System.out.println(s1 + " & " + s2 + " are NOT anagrams.");
	    }
	}
}
