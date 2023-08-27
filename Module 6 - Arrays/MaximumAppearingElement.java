public class MaximumAppearingElement {

    public static int myNaive(int left[],int[] right){
        int[] freq = new int[100];
        int n = left.length;
        for(int i = 0;i<n;i++){
            for(int j = left[i];j<=right[i];j++)
                freq[j] += 1;
        }

        int res = 0;
        for(int i = 1;i<freq.length;i++){
            if(freq[i] > freq[res]){
                res = i;
            }
        }

        return res;
    }


    //my efficient solution
    public static int maxAppearingElement(int[] left, int[] right){
        int[] freq = new int[101];
        for(int i = 0;i<left.length;i++){
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }

        int res = 0;
        for(int i = 1;i<freq.length;i++){
            freq[i] = freq[i - 1] + freq[i];
            if(freq[i] > freq[res])
                res = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] left = {1,2,4};
        int[] right = {4,5,7};
        System.out.println(myNaive(left, right));
        System.out.println(maxAppearingElement(left, right));
    }   
}
