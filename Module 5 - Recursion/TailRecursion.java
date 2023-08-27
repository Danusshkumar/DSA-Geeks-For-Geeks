import java.util.Scanner;

public class TailRecursion {

    public static int fact(int n,int k){
        if(n == 0 || n == 1) return k;
        return fact(n - 1, k*n);
    }

    public static void toN(int n, int k){
        if(n == 0) return;
        System.out.println(k);
        toN(n-1,k+1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toN(n,1);
        System.out.println();
        System.out.println(fact(n,1));
    }
}
