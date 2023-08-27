public class SubArrayWithGivenSum {

    public static Boolean subArrayWithGivenSum(int[] arr,int k){
        int s = 0, curr = 0;
        for(int e = 0;e<arr.length;e++){
            curr += arr[e];
            while(curr > k){
                curr -= arr[s];
                s++;
            }
            if(curr == k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        System.out.println(subArrayWithGivenSum(arr,17));
    }
}
