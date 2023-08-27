import java.util.Scanner;

public class Nto1 {

    public static void solution(int n){
        if(n == 0) return;
        System.out.println(n);
        solution(n-1);
    }

    public static void solution1toN(int n){
        if(n == 0) return;
        solution1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solution1toN(n);
    }
}