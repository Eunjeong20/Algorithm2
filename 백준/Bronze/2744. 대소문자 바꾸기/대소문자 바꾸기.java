import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException  {
       
	    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	    String str = buf.readLine();
	    StringBuilder rslt = new StringBuilder();
	    char ch;
	    
	    for (int i = 0; i<str.length(); i++) {
	        ch = str.charAt(i);
	        if (Character.isUpperCase(ch)) {
	            rslt.append(Character.toLowerCase(ch));
	        }
	        else if (Character.isLowerCase(ch)) {
	            rslt.append(Character.toUpperCase(ch));
	        }
	    }
		System.out.println(rslt);
	}
}

