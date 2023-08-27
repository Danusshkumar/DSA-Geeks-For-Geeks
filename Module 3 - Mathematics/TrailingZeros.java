import java.util.Scanner;

public class TrailingZeros {

    public static int approach1(int n){
        int fact = 1;

        for(int i = 2;i<=n;i++){
            fact *= i;
        }

        int count = 0;
        while(fact%10 == 0){
            fact /= 10;
            count++;
        }

        return count;
    }

    public static int approach2(int n){
        int count = 0;
        for(int i = 5;i <= n ;i *= 5){
            count += n/i;
        }
        return count;
    }
    //sum of trailing zeros = floor(n/5) + floor(n/25) + ... 
    // this approach has the time complexity of theta(logn) and it solves the major issue of overflow

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(approach1(n));
        System.out.println(approach2(n));
    }
}