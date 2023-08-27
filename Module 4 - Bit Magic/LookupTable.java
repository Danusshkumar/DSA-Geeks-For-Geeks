import java.util.Scanner;

public class LookupTable {
    public static void main(String[] args) {
        int lookUpTable[]=new int[256];
        lookUpTable[0] = 0;
        for(int i = 1;i<=255;i++){
            int x = i;
            int count = 0;
            // while(x>0){
            //     x = x & (x - 1);
            //     count++;
               
            // }
             count = ( x & (x - 1) ) + 1;
            lookUpTable[i] = count;
            //System.out.println("Array value of " + i + " is " + a[i]);
        }
        //lookup table created

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int setBitCount = 0;
        while(n > 0){
            int val = n&255;
            //Seperating the values into 8 bits and calculating set bits for each
            // finally adding their values
            setBitCount += lookUpTable[val];
            n = n>>8;
        }

        System.out.println(setBitCount);
    }
}
