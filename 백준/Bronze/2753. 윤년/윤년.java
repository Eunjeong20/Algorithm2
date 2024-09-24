import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int a = sca.nextInt();
		
		if ((a%4 == 0 && a%100 != 0) || a%400==0) {
		    System.out.print("1");
		}
		else {
		    System.out.print("0");
		}
	}
}
