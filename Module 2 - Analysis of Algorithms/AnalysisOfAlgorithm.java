/**
 * AnalysisOfAlgorithm
 */

import java.util.Scanner;

public class AnalysisOfAlgorithm {

    public static void main(String[] args){
        //sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Your input:");
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

// for algorithm 1 return n(n+1)/2; ==> time taken : C1;
// single for loop ==> time taken : C2n + C3;
// nested loop ==> time taken : C4n2 + C5n + C6;