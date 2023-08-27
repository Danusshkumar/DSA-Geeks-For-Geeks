import java.util.Scanner;
import java.lang.Math;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = str.length();

        for(int i = 0;i<(1<<n);i++){
            //traverse from LSB to n times and print the corresponding letter
            int lengthOfString = n;
            int j = i;
            System.out.print("\"");
            while(lengthOfString > 0){
                
                if((j&1) == 1) // j%2 == 1
                    System.out.print(str.charAt(n - lengthOfString));// print it
                j >>= 1;//  j = j >> 1; or j /= 2;
                lengthOfString--;
            }
            System.out.println("\"");
        }
        
    }
}
