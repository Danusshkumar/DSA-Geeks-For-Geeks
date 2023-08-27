public class MaximumConsecutive1s {

    /*
     * In the first approach, we have to consider one such condition when there is
     * no zero encountered at last. We have to handle it specifically.
     * 
     * But in the efficient method, we are considering only 1 then trailing zero, doesn't make any
     * sense so that we can leave that. Also make sure to use ternary operator so that the code will
     * be more readable in such cases. 
     */

    public static void consecutive1(int arr[]){

        int count = 0;
        int tempCount = 0;
        int n = arr.length;

        for(int i = 0;i < n;i++){
            if(arr[i] == 1){
                tempCount++;
            }
            else {
                if(tempCount > count)
                    count = tempCount;
                
                tempCount = 0;
            }
        }

        if(arr[n-1] == 1 && tempCount > count)
            count = tempCount;
        
        System.out.println(count);

    }

    public static void consecutive1BetterApproach(int[] arr){
        int count = 0;
        int tempCount = 0;
        for(int i = 0;i<arr.length;i++)
            if(arr[i] == 0)
                tempCount = 0;
            else
            {
                tempCount++;
                count = (tempCount > count) ? tempCount : count;
            }
    }

    public static void main(String[] args) {

        int[] arr = {0,1,1,0,1,0};
        consecutive1(arr);
    }
}
