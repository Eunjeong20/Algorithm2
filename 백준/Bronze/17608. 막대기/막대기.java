import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sca = new Scanner(System.in);
	    int N = sca.nextInt();
	    int[] arr = new int[N];
	    for (int i=0; i<N; i++) {
	        arr[i] = sca.nextInt();
	    }
	    
	    int max = 0;
	    int cnt = 0;
	    for (int i=(N-1); i>=0; i--) {
	        if(max < arr[i]) {
	            cnt++;
	            max = arr[i];
	        }
	    }
	    System.out.println(cnt);
	}
}