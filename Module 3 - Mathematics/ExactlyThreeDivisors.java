import java.util.Scanner;
import java.lang.Math;

public class ExactlyThreeDivisors {


    public static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if( (n%2 == 0 || n%3 == 0 ) && (n != 4 && n != 9)) return false;

        for(int i = 5;i<=Math.sqrt(n);i+=6){
            if( ( n%i == 0 || n%(i+2) == 0 ) && (i != Math.sqrt(n) && (i+2) != Math.sqrt(n)) ) 
            {
                System.out.println("inside prime loop : " + i);
                return false;
            }
        }
        return true;

    }

    public static void exactlyThreeDivisors(int n){
        //the concept behind exactly three divisors.
        //you know that divisors always appears in pairs
        //(1,n) where n is the number itself is a inevitable pair of divisor
        //then if the number have exactly only one extra divisor will be the answer for this problem
        // we know that divisor always appear in pair, then how exactly one divisor will be found.
        // it will be found if both the numbers are same like (2,2). In this case the number n itself is 
        // a perfect square which means its square root is a integer. 
        // So the number of perfect square within that number is a number which has exactly three divisors
        // Another important thing is that it can't be divided by another number meaning that it is a prime number
        // We know that perfect squares can't be the prime number, but here we must check for prime except for
        // the number's square root. sqrt(n) is a exceptional case for this special prime checking algorithm
        // let's start the game
        
        //int count = 0;
        // for(int i = 1;i*i<=n;i++){
        //     for(int j = 1;j<=i;j++){
        //         if(i%j == j) {
        //             count++;
        //             System.out.println(i);
        //         }
        //     }
        // }
        int boundaryNumber = (int)Math.floor(Math.sqrt(n));
        System.out.println(boundaryNumber);
        int count = 0;
        for(int i = 2;i<=boundaryNumber;i++){
            int perfectSquare = i*i;
            System.out.print("Numbers :" + perfectSquare + " ");
            if(isPrime(perfectSquare)){
                System.out.print(perfectSquare + ", ");
                count++;
            }
        }
        System.out.println("\n" + count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        exactlyThreeDivisors(n);
    }
}
