import java.util.Scanner;

public class KthBitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        //int andNum = (int)Math.pow(2,k-1);
        int andNum = 1<<k-1;
        if( (n&andNum) != 0){
            System.out.println("Kth bit set");
        }
        else {
            System.out.println("Kth bit is not set");
        }

        // we can also do the same by this method
        /*
         * for(int i = 0;i<k-1;i++) n /= 2;
         * Now the kth bit will be the least significant (right most bit) and now
         * we can do n&1 !=0 to check whether the kth bit is set or not
         * n/Math.pow(2,k-1)
         */

         /*
          * Efficient method 2:
          n = n>>(k-1);
          Now n&1 != 0 then set else not set.
          */
    }
}