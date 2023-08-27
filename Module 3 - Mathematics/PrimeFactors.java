import java.util.Scanner;

public class PrimeFactors {

    public static boolean isPrime(int n){

        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;

        for(int i = 5;i<Math.sqrt(n);i+=6){
            if(n%i == 0 || n%(i+2) == 0) return false; 
        }
        return true;
    }

    public static void naivePrimeFactor(int n){

        int i = 2;
        while(n != 1){
            while(n%i == 0){
                n /= i;
                System.out.print(i + ", ");
            }
            i++;
        }
    }
    //this solution doesn't checks the number as it is prime or not
    // this algorithm runs in a believe that all non-prime numbers fail to divide the number n
    // this non-prime numbers are divided by the lower numbers which are prime (2,3,5,7,13).
    // so there is no need to check whether the number is prime or not
    // in simple form, non-prime number 4 can't be allowed to divide n
    // as prime number 2 divides n two times

    // Fact :
    // We can write any numbers as the form of multiplication of its prime factors

    
    public static void anotherNaivePrimeFactor(int n){
        
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                int x = i;
                while(n%x == 0){
                    System.out.print(i + ", ");
                    x *= i;
                }
            }
        }
    }
    //time complexity ==> bigO(nlogn)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        anotherNaivePrimeFactor(n);
    }
}
