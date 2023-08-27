public class MaxSubArraySum {

    public static int maxSubArraySum(int[] arr){
        int max = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int curr = 0;
            for(int j = i;j<n;j++){
                curr += arr[j];
                max = (curr > max) ? curr : max;
            }
        }
                
        return max;
    }

    public static int maxSubArraySumEfficient(int[] arr){
        int max = arr[0];
        int maxEnding = arr[0];
        int n = arr.length;
        for(int i = 1;i<n;i++){
            maxEnding = (maxEnding + arr[i] > arr[i]) ? maxEnding + arr[i] : arr[i];
            max = (max > maxEnding) ? max : maxEnding;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,-2,3,-1,2,-2};
        System.out.println(maxSubArraySumEfficient(arr));
    }
}
