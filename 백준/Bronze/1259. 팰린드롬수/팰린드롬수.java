import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String str;
      while(true) {
         str = sc.next();
         if (str.equals("0")) break;
         boolean isPalindrome = true;
         for (int i = 0; i < str.length()/2; i++) {
             if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                 isPalindrome = false;
                 break;
             }
         }
         System.out.println(isPalindrome?"yes":"no");
     }
  }
}