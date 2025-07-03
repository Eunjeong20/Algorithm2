import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        boolean canvas[][] = new boolean[100][100];
        int count =0;
        
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        
        for (int k=0; k<num; k++) {
            int x = sca.nextInt();
            int y = sca.nextInt();
            
            for (int i=y; i<y+10; i++) {
                for (int j=x; j<x+10; j++) {
                    canvas[i][j] = true;
                }
            }
        }
        for (int i=0; i<100; i++) {
            for (int j=0; j<100; j++) {
                if(canvas[i][j] == true) count++;
            }
        }
        
        System.out.print(count);
	}
}
