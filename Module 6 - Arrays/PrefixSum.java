public class PrefixSum {

    public static int getSum(int[] arr,int s,int e){
        int sum = 0;
        for(int i = s;i<=e;i++){
            sum+= arr[i];
        }
        return sum;
    }

    //efficient approach
    public static int prefixSum(int[] arr,int s,int e){
        int n = arr.length;
        int[] p = new int[n];
        p[0] = arr[0];
        for(int i = 1;i<n;i++)
            p[i] = p[i - 1] + arr[i];

        return (s != 0) ? p[e] - p[s - 1] : p[e];

    }

    public static void main(String[] args) {
        int[] arr = {2,8,3,9,6,5,4};
        System.out.println(prefixSum(arr,0,2));
    }
}
