/**
 * countDigits
 */
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int x = sc.nextInt();
        int count = 0;
        while(x > 0){
            x /= 10;
            count++;
        }
        System.out.println(count);
    }
}

//Time complexity:
// Time complexity of this program is θ(d) where d is the number of digits