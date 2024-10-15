import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sca = new Scanner(System.in);
	    String str = sca.next();
	    int count = 0;
	    
	    for(int i=0; i<str.length(); i++) {
	        switch (str.charAt(i)) {
	            case 'a':
	            case 'e':
	            case 'o':
	            case 'i':
	            case 'u':
	                count++;
	                break;
	        }
	    }
	    
		System.out.println(count);
	}
}