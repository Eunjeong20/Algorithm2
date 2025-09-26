import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {

        int[] button = {300, 60, 10};
        int[] cnt = new int[3];
        
        Scanner sca = new Scanner(System.in);
        int time = sca.nextInt();

        for (int i=0; i<3; i++) {
            cnt[i] = (time / button[i]);
            time %= button[i];
        }
        
        if (time != 0) {
            System.out.println(-1);
        }
        else {
            for (int c : cnt) 
                System.out.print(c + " ");
        }
	}
}
