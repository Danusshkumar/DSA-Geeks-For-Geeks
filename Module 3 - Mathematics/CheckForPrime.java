import java.util.Scanner;
import java.lang.Math;


public class CheckForPrime {
    // prime numbers are the numbers that are divided by one and itself and not by others
    // all non-prime numbers are called as composite numbers except 1.
    // Because number 1 is considered to be neither prime nor composite number

    public static boolean naiveCheckForPrime(int n){

        if(n == 1) return false;

        for(int i = 2;i<n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public static boolean efficientCheckForPrime(int n){
        if(n == 1) return false;

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    } // refer note for explanation

    public static boolean veryEfficientCheckForPrime(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;

        for(int i = 5;i<Math.sqrt(n);i+=6){
            if(n%i == 0 || n%(i+2) == 0) return false; 
        }
        return true;

    }
    //time complexity ==> bigO(sqrt(n))



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(veryEfficientCheckForPrime(n));
    }
}
