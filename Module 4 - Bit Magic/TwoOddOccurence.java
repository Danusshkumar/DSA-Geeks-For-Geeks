import java.util.Scanner;
public class TwoOddOccurence {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++)arr[i] = sc.nextInt();
    System.out.println("Input completed");

    int x = 0;
    for(int i = 0;i<n;i++) x ^= arr[i];
    int k = x & ( ~(x-1) );
    int a = 0;
    int b = 0;

    for(int i = 0;i<n;i++){
        if( (arr[i] & k) != 0)
            a ^= arr[i];
        else 
            b ^= arr[i];
    }
    System.out.println("First number is " + a + " and the second number is " + b);

    }
}
