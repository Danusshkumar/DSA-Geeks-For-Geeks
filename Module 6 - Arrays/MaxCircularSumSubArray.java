public class MaxCircularSumSubArray {
    
    public static int maxCircSumSubArray(int[] arr){
        int res = arr[0];
        int n = arr.length;

        for(int i = 0;i<n;i++){
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for(int j = 1;j<n;j++){
                int index = (i + j)%n;
                curr_sum += arr[index];
                curr_max = (curr_max > curr_sum) ? curr_max : curr_sum;
            }
            res = (res > curr_max) ? res : curr_max;
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5,-2,3,4};
        System.out.println(maxCircSumSubArray(arr));
    }
}
