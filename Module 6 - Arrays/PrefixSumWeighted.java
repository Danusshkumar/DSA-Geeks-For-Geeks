public class PrefixSumWeighted {

    static int[] p;
    static int[] wp;

    public static void preCompute(int[] arr){
        int n = arr.length;
        p = new int[n];
        p[0] = arr[0];
        for(int i = 1;i<n;i++)
            p[i] = p[i - 1] + arr[i];
        
        wp = new int[n];
        wp[0] = 0;
        for(int i  = 1;i<n;i++)
            wp[i] = wp[i - 1] + i * arr[i];
    }

    public static int prefixSumWeighter(int[] arr,int s,int e){
        int term1 = (s != 0) ? (wp[e] - wp[s - 1]) : wp[e];
        int term2 = (s - 1) * ( (s != 0) ? (p[e] - p[s - 1]) : p[e] );
        return term1 - term2;
        
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,1};
        preCompute(arr);
        System.out.println(prefixSumWeighter(arr,0,2));
    }
}
