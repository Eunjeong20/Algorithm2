import java.util.*;

public class Main{	
    public static void main(String[] args) {        
        Scanner sca = new Scanner(System.in);    
        Stack<String> stk = new Stack<String>();
        
        // N에 testcase의 개수를 입력받는다.
        int N = Integer.parseInt(sca.nextLine());

        // testcase의 수만큼 반복한다.
        for(int i = 0 ; i < N; i++ ) { 
            String line = sca.nextLine();
            String[] arr = line.split(" ");
            
            for(int j = 0 ; j < arr.length; j++) {
                stk.push(arr[j]);
            }
            
            System.out.print("Case #" + (i+1) + ": ");
            
            for(int j = 0 ; j < arr.length; j++) {
                System.out.print(stk.pop() + " ");
            }
            System.out.println();
        }
    }
}
