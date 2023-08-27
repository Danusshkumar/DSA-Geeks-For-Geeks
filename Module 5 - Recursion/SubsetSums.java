import java.util.Scanner;
import java.lang.Math;

public class SubsetSums {

    public static int solution(int n,int[] arr,int sum){
        if(n == 0)
            return (sum == 0) ? 1  : 0;
        
        return solution(n - 1,arr,sum) + solution(n - 1,arr, sum - arr[n-1]); 
        // arr[n-1] refers to last element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        int result = solution(arr.length,arr,0);
        System.out.println(result);
    }
}
