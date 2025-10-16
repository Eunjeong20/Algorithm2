import java.util.Scanner;
public class Main
{
    static int[] d = new int[1000000];
    public static int sub(int n) {
        if (n == 1) return 0;
        
        if (d[n] > 0) return d[n];
        
        for (int i=2; i<=n; i++) {
            
            d[i] = d[i-1] +1;
            
            if (i%2 == 0 && d[i] > d[i/2]+1) d[i] = d[i/2]+1;
            if (i%3 == 0 && d[i] > d[i/3]+1) d[i] = d[i/3]+1;
        }
        
        
        return d[n];
    }
	    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

        d = new int[n+1];
		System.out.println(sub(n));
	}
}