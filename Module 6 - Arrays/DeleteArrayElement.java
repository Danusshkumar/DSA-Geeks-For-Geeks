public class DeleteArrayElement {

    public static int[] deleteElement(int[] arr, int size, int element){

        int idx = 0;
        for(int i = 0;i<size;i++){
            if(arr[i] == element){
                idx = i;
                break;
            }
        }

        if( idx == size)
            return arr; // if the element is not found

        for(int i = idx;i<(size-1);i++){
            arr[i] = arr[i+1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        arr = deleteElement(arr, 10, 3 );

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
