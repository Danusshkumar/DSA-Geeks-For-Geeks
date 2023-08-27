import java.util.Scanner;

public class OneOddOccurence {

    public static int naiveSolution(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j]) count++;
            }
            if(count%2 != 0) return arr[i];
        }
        return 0;
    }

    public static int efficientSolution(int[] arr){
    int number = 0;
    for(int i = 0;i<arr.length;i++) number ^= arr[i];
    // this efficient solution uses the property of XOR to find the one odd occurence number
    return number;
    }
    // time complexity is theta(n) and auxiliary space is O(1)

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++)arr[i] = sc.nextInt();
    System.out.println("Input completed");
    System.out.println(naiveSolution(arr));
    System.out.println(efficientSolution(arr));
    }
}
