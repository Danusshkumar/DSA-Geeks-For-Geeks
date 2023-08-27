public class SlidingWindow {

    public static int maximumSumOfKElements(int[] arr,int k){
        int sum = Integer.MIN_VALUE;
        int n = arr.length;
        int sp = 0;
        int ep = k - 1;
        for(int i = ep;i<n;i++){
            int tempSum = 0;
            for(int j = sp;j<=ep;j++)
                tempSum+= arr[j];
            sum = (tempSum > sum) ? tempSum : sum;
            sp++;
            ep++;
        }

        return sum;
    }

    //sliding window technique
    //computing first sliding window sum
    // with this, subtract the first element of prev window and add the last element of current window

    //making k as k+1 th element
    public static int maxSum(int[] arr, int k){
        int n = arr.length;
        int curr = 0;
        for(int i = 0;i<k;i++)
            curr += arr[i];
        
        int res = curr;
        for(int i = k;i<n;i++){
            curr += arr[i] - arr[i - k];
            res = (curr > res) ? curr : res;
        } 
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        System.out.println(maxSum(arr,4));
    }
}
