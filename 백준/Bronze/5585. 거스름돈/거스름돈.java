import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

        int[] coins = {500, 100, 50, 10, 5, 1};
        
        Scanner sca = new Scanner(System.in);
        int change = 1000 - sca.nextInt();
        int cnt=0;
        
        for (int coin : coins) {
            cnt += (change / coin);
            change %= coin;
        }
        
        System.out.println(cnt);
	}
}
