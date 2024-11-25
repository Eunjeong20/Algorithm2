import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sca = new Scanner(System.in);
	    int n = sca.nextInt();
	    int m = sca.nextInt();
	    int a, b, temp, sum;
	    int[] arr = new int[n+1];
	    
	    for (int i = 1; i <= n; i++) {
	        arr[i] = i;
	    }
	    for (int i = 0; i < m; i++) {
	        a = sca.nextInt();
	        b = sca.nextInt();
	        sum = a+b;
	        for (int j=a; j<=a+((b-a)/2); j++) {
	            temp = arr[j];
	            arr[j] = arr[sum-j] ;
	            arr[sum-j] = temp;
	        }
	    }
	   for (int j = 1; j <= n; j++) {
            System.out.print(arr[j] + " ");	   
        }
	}
}
