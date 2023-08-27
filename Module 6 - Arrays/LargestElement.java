public class LargestElement {

    public static int largestElement(int arr[]){
        int largestIndex = 0;

        for(int i = 0;i<arr.length;i++)
            if(arr[i] > arr[largestIndex])
                largestIndex = i;

        return largestIndex;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,23,6,7,7,8,9,10};
        System.out.println(largestElement(arr));
    }
}
