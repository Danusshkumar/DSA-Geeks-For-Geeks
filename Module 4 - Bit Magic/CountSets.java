import java.util.Scanner;

public class CountSets {

    public static int efficientCountSets(int n){
        int count = 0;
        while(n>0){
            //if( (n & 1) == 1) count++; // we can also use n%2 == 1
            // Instead above we can use
            count += n&1;
            n = n>>1; // we can also use n /= 2 here
        
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(efficientCountSets(n));
    }
}
