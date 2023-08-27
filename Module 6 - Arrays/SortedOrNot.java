public class SortedOrNot {

    public static Boolean isSorted(int[] arr){
        Boolean isSorted = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < arr[i - 1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,10};
        System.out.println(isSorted(arr));
    }
}
