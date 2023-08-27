public class MaxDifference {

    /*
     * Naive solution:
     * Anyone can find this naive solution as it is very easy. We are finding the 
     * difference between every two element using nested loops
     * 
     * My naive solution will not work for the corner case where array is sorted. In this case,
     * the difference will be negative but this solution will keep track of both bigger value and smaller 
     * value so that on negative result, it gives us 0
     * 
     * The efficient solution is that we are only keep tracking min value and difference value, if the
     * current min value - current value (arr[i]) is greater than difference value, then difference value
     * get updated, if the current value is less than min value than min value get updated
     */


    public static void maxDifferenceInNaive(int[] arr){
        int maxDifference = arr[1] - arr[0];
        int n = arr.length;

        for(int i = 0;i<n;i++)
            for(int j = i + 1;j<n;j++)
                if(arr[j] - arr[i] > maxDifference)
                    maxDifference = arr[j] - arr[i];
        
        System.out.println(maxDifference);
        
        
    }

    public static void myMaxDifferenceMine(int[] arr){
        int minIndex = 0;
        int maxIndex = 0;
        int n = arr.length;

        for(int i = 0;i<n;i++){
            if(arr[i] > arr[maxIndex])
                maxIndex = i;
            
            if(arr[i] < arr[minIndex] && i < maxIndex)
                minIndex = i;
            
        }

        int maxDifference = arr[maxIndex] - arr[minIndex];

        System.out.println(maxDifference);
            
    }

    public static void maxDifference(int[] arr){
        int minValue = arr[0];
        int maxDifference = arr[1] - arr[0];
        int n = arr.length;

        for(int i = 1;i<n;i++){
            
            if(arr[i] - minValue > maxDifference)
                maxDifference = arr[i] - minValue;

            if(arr[i] < minValue)
                minValue = arr[i];
        }

        System.out.println(maxDifference);

    }

    public static void main(String[] args) {
        int arr[] = {30,10,8,2};
        //maxDifference(arr);
        //maxDifferenceInNaive(arr);
        myMaxDifferenceMine(arr);
    }
}
