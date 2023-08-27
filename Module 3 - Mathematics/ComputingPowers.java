import java.sql.Time;
import java.util.Scanner;


class ComputingPowers {

    public static int naiveComputePower(int a,int b){
        int n = 1;
        for(int i = 1;i<=b;i++){
            n *= a;
        }
        return n;
    }

    public static int computingPower(int a,int b){
        if(b == 0) return 1;
        int temp = computingPower(a,b/2);
        temp *= temp;
        if(b%2 == 0)
            return temp;
        else
            return temp * a;
    }
    //Time Complexity: O(log n)
    //Auxiliary Space: O(log n), for recursive call stack

    public static long iterativePower(int a,int b){
       long res = 1;
       int temp;
       while(b > 0){
        // if(b%2 == 0){
        //     temp = 0;
        // }
        // else {
        //     temp = 1;
        //     res *= a;
        // }
        if(b%2 == 1){
            res *= a;
        }
        a = a * a;
        b /= 2; 
        }
       return res; 
    }
    // when we are generating binary representation with temp,
    // it'll be in reverse order and that's what we want.
    // In reverse order we may give it as x^1, x^2, x^4, x^8 ...
    // The time complexity of this solution is O(logn)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(iterativePower(a,b));
    }
}