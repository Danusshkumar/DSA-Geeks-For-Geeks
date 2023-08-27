public class SecondLargestElement {

    public static int secondLargestElement(int[] arr){
        int largestIndex = 0, secondLargestIndex = -1;
        if(arr.length == 0) return -1;

        for(int i = 0;i<arr.length;i++){

            if(arr[i] > arr[largestIndex]){
                secondLargestIndex = largestIndex;
                largestIndex = i;
            }
            else if(arr[i] <= arr[largestIndex]){
                if(secondLargestIndex == -1 || arr[i] > arr[secondLargestIndex]){
                    secondLargestIndex = i;
                }
            }
    
        }
        return secondLargestIndex;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,9,6,7,8,10,8};
        System.out.println(secondLargestElement(arr));
    }

    // logic for second larger element
    // If the traversing element is larger than first large element(fle) then that element
    // become fle and the original fle becomes sle(second largest element)
    
}
