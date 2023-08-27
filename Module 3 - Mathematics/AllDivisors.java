import java.util.Scanner;

public class AllDivisors {

    public static void naiveAllDivisors(int n){
        for(int i = 1;i<=n;i++)
            if(n%i == 0)
                System.out.print(i + ", ");
    }

    public static void efficientAllDivisors(int n){

        int i;
        for(i = 1;i*i < n;i++){
            if(n%i == 0) System.out.print(i + ", ");
        }

        for(;i*i >= 1;i++){
            if(n%i == 0) System.out.print(i + ", ");
        }
    }
    //printing all the paired divisors in sorted order
    //first loop prints the divisors in the interval [1,sqrt(n))
    //second loop prints the divisors in the interval [sqrt(n),n]
    //time complexity theta(sqrt(n)) + theta(sqrt(n)) = theta(sqrt(n))
    // and it requires theta(1) auxilary space. 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        efficientAllDivisors(n);
    }
}
