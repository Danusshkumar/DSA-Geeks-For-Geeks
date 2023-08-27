import java.util.*;
import java.lang.*;

public class Modulo {

    public static long sumUnderModulo(long a, long b){
        
        long denom = (long)( Math.pow(10,9) + 7 );
        long modA = a%denom;
        long modB = b%denom;
        long modRes = (modA + modB)%denom;
        
        return modRes;
    }   
    /*
     * Modulo arithmetic makes addition easier because it allows us to work with smaller numbers and avoid carrying over digits. For example, if we want to add 123456789 and 987654321 modulo 10, we can simply add the last digits of each number and find the remainder when divided by 10. That is, (123456789 + 987654321) mod 10 = (9 + 1) mod 10 = 0. We don't need to worry about the other digits or the sum exceeding the maximum limit of the integer type.

Modulo arithmetic prevents overflow by reducing the result of an arithmetic operation to a fixed range of values. For example, if we are using unsigned integers of size N bits, then the maximum value that can be represented is 2^N - 1. If we perform an arithmetic operation that produces a result larger than this value, then an overflow occurs and the result is incorrect. However, if we perform the same operation modulo 2^N, then the result will always be in the range [0, 2^N - 1] and no overflow will occur. This is because any result that cannot be represented by the resulting unsigned integer type is reduced modulo 2^N, retaining only the least significant bits of the result and effectively causing a wrap around⁶ [^10^]. For example, if we are using unsigned integers of size 8 bits, then the maximum value that can be represented is 255. If we add 200 and 100, then the result is 300, which is larger than 255 and causes an overflow. However, if we add 200 and 100 modulo 256, then the result is 44, which is in the range [0, 255] and does not cause an overflow. This is because 300 mod 256 = (200 mod 256 + 100 mod 256) mod 256 = (200 + 100) mod 256 = 44⁷⁵.
     */

    public static void main(String[] args) {
        
    }
}
