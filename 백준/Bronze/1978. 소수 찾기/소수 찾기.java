import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        int cnt = 0;
        for(int i=0; i<tc; i++) {
            boolean is_prime = true;
            int num = scan.nextInt();
            
            if (num == 1) {
            	is_prime = false;
            	continue;
            }
            for(int j=2; j<=(num/2); j++) {
            	if (num%j==0) {
                	is_prime = false;
                	break;
                }
            }
            if (is_prime == true) cnt++;
		}
		System.out.println(cnt);
		
	}
}