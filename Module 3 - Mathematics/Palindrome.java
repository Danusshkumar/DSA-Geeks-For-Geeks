import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int input = x;
        int rev = 0;
        while(x > 0){
            int lastDigit = x%10;
            rev = rev*10 + lastDigit;
            x /= 10;
        }
        if(input == rev)
            System.out.println("It's a palindrome");
        else 
            System.out.println("It's not a palindrome");

    }
}

// If an number must change it's digit from 1's place to 10's place (move to left)
// we have to multiply it by 10
// If an number must change it's digit from 10's placed to 1's place (move to right)
// we have to divide it by 10

//Time complexity:
// Time complexity of this program is θ(d) where d is the number of digits
