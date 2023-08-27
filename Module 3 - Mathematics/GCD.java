import java.util.Scanner;
import java.math.*;

public class GCD {

    public static int gcdNaive(int a,int b){
        int n = Math.min(a, b);
        while(n > 0){
            if(a%n == 0 && b%n == 0)
                break; // return n;
            else 
                n--;
        }
        return n; //return 1;
    }
    // the worst time complexity of this algorithm is min(a,b) where 1 is the GCD.
    // bigO(min(a,b))

    //efficient solution : Euclidean algorithm
    public static int gcdGeneralEuclid(int a, b){
        while(a != b){

        if(b>a)
            b = b - a;
        else 
            a = a - b;
        }
        return a;
    } 

    public static int gcdModuloEuclid(int a,int b){

        return b == 0 ? a : gcdModuloEuclid(a,a%b);
        // if(b == 0)
        //     return a;
        // else 
        //     return gcdModuloEuclid(b, a%b);
    }
    // gcd(12,15) (initially, it get swapped) gcd(15,12) ==> gcd(12,3) ==> gcd(3,0)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdNaive(a,b));
    }
}
