import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int straightN = n;
        int revN = 0;
        while(n > 0){
            revN *= 10;
            int temp = n%10;
            n /= 10;
            revN = (revN + temp);
        }
        if(straightN == revN) System.out.println("It's a palindrome");
        else System.out.println("It's not a palindrome");
    }   
}
