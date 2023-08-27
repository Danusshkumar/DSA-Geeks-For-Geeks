import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = ( n & (n-1) ) + 1; // no of set bits
        if(count == 1 && n != 0) System.out.println("Yes"); // if no of set bits are 1 then it's a power of 2
        // the exception for the above case occurs when n = 0
        else System.out.println("No");
    }
}
