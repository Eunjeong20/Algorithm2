import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
        int tc = scan.nextInt();
        int num;
        int min=1000001;
        int max=-1000001;
        
        for (int i=0; i<tc; i++) {
        	num = scan.nextInt();
        	if (num > max) max = num;
        	if (num < min) min = num;
        }
        
		System.out.println(min + " " + max);
	}
}
