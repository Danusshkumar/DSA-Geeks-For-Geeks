import java.util.Scanner;

public class JosephusProblem {

    public static void solution(int n,int k,int leftCount){
        if(leftCount == 1){
            System.out.println(k);
            return;
        }

        solution(n-k,k,leftCount - 1);
    }
    // til not completed

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        solution(n,k,n);
    }
}
