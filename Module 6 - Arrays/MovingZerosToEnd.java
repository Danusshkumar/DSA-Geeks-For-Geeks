public class MovingZerosToEnd {

    /*
     * My approach : When we are found the element zero, we have to move that zero
     * right most side and moving all other element left side. This is my solution which 
     * is not good at time complexity.
     * 
     * Naive approach or brute force approach:
     * On this when first zero is encountered, I will swap that element with firt non zero element found.
     * by this way, I will make sure that the order of array is not disturbed.
     * This solution takes bigO(n^2) time complexity. 
     * 
     * Efficient approach :
     * This idea is to move all non-zero element to the starting position. By this, 
     * when we are seeing aith element, we will swap it with first zero element. We can find the first 
     * zero element by counting the number of non-zero element
     */

     public static int[] naiveApproach(int[] arr){
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                for(int j = i+1;j<arr.length;j++){
                    if(arr[j] != 0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
        
        return arr;
     }


     public static int[] efficientApproach(int[] arr){
        
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;

                count++;
            }
        }
        
        return arr;
     }

    public static void main(String[] args) {
        int arr[] = {1,2,0,0,4,0,0,0,0,4};
        //arr = naiveApproach(arr);
        arr = efficientApproach(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
