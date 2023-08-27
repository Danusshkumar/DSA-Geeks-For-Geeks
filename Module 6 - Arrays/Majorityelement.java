public class Majorityelement {
    
    //majority element is the element whose count is more than n/2 where n is the array length
    /*
     * the naive approach is to use nested for loops, counting the frequency
     * of the elements by comparing it with all other elements whether they are equal to current
     * element. At the end of counting frequency of current element, we will check if it is greater than
     * n/2 and if it is so, then return the element else continue till last. till last nothing is returned
     * then finally retun -1.
     */

     /*
      * But this algorithm works in certain logic. Moore's voting algorithm
      */
    public static int majority(int[] arr){
        int majorityIndex = 0;
        int count = 1;
        int n = arr.length;
        for(int i = 1;i<n;i++){
            if(arr[majorityIndex] == arr[i]){
                count++;
            }
            else {
                count--;
            }

            if(count == 0){
                majorityIndex = i;
                count = 1;
            }
        }

        int majorityCount = 0;
        for(int i = 0;i<n;i++){
            if(arr[majorityIndex] == arr[i]){
                majorityCount++;
            }
        }
        if(majorityCount > n/2)
            return arr[majorityIndex];
        else 
            return -1;

    }

    public static void main(String[] args) {
        int[] arr = {6,8,4,8,8};
        System.out.println(majority(arr));
    }
}
