public class LongestEvenOddSubArray {

    public static int longestEvenOddSubArray(int[] arr){
        int length = 1;
        int n = arr.length;
        Boolean isOdd = (arr[0]%2 == 1);
        int curr = 1;
        for(int i = 1;i<n;i++){
            Boolean tempIsOdd = (arr[i]%2 == 1);
            if(tempIsOdd != isOdd){
                isOdd = tempIsOdd;
                curr++;
            }
            else {
                curr = 1;
            }
            length = (curr > length) ? curr : length;
        }

        /*
         * for (int i = 1;i<n;i++){
         * if( (arr[i]%2 == 0 && arr[i-1]%2 != 0) && (arr[i]%2 != 0 && arr[i - 1]%2 == 0) ){
         *  curr++;
         *  length = (curr > length) ? curr : length;
         * }
         * else {
         *  cur = 1;
         * }
         *  // We can use both of this logic.
         */
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {10,12,8,4};
        System.out.println(longestEvenOddSubArray(arr));
    }
}
