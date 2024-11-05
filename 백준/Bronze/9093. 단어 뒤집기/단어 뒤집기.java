import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int nline = Integer.parseInt(str);
	    
	    for(int i=0; i<nline; i++) {
	        String str1 = br.readLine();
	        String[] arr = str1.split(" ");
	        for(int j=0; j<arr.length; j++) {
	            System.out.print(new StringBuilder(arr[j]).reverse()+" ");
	        }
	        System.out.println();
	    }
	}
}