public class EquilibriumPoint {

    static int[] ls;
    static int[] rs;

    public static void precompute(int[] arr){
        int n = arr.length;
        ls = new int[n];
        rs = new int[n];
        // for ls
        ls[0] = arr[0];
        for(int i = 1;i<n;i++)
            ls[i] = ls[i - 1] + arr[i];
        //for rs
        rs[n - 1] = arr[n - 1];
        for(int i = n - 2;i>=0;i--)
            rs[i] = rs[i+1] + arr[i];
        
    }

    public static int myNaive(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){

            if(i != 0 && i != (n - 1))
                if(ls[i - 1] == rs[i+1])
                    return i;
                else continue;
            else
                if(i == 0)
                    if(rs[i+1] == 0)
                        return i;
                    else continue;
                else
                    if(ls[i -1] == 0)
                        return i;
                    else continue;
            }
        return -1;
    }

    public static int equilibriumPoint(int[] arr){
        int n = arr.length;
        int rs = 0;
        for(int i = 0;i<n;i++)
            rs+= arr[i];
        int ls = 0;
        for(int i = 0;i<n;i++){
            rs -= arr[i];
            if(ls == rs)
                return i;
            ls += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,-2};
        precompute(arr);
        System.out.println(equilibriumPoint(arr));
    }
}
