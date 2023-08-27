public class TrappingRainWater {

    public static int computeCapacity(int[] arr){

        int res = 0;
        int n = arr.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = arr[0];
        for(int i = 1;i<n;i++)
            lMax[i] = (arr[i] > lMax[i - 1]) ? arr[i] : lMax[i - 1];
        
        rMax[n - 1] = arr[n - 1];
        for(int i = n - 2;i>=0;i--)
            rMax[i] = (arr[i] > rMax[i + 1]) ? arr[i] : rMax[i + 1];
        

        // storing  = min(lmax,rmax) - arr[i]
        for(int i = 0;i<n;i++)
            res += ( (lMax[i] < rMax[i]) ? lMax[i] : rMax[i] ) - arr[i];


        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,5};
        System.out.println(computeCapacity(arr));


    }
}