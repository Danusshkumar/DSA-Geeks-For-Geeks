public class RemoveDuplicatedFromArray {

    public static int[] removeDuplicates(int[] arr){
        
        int res = 1;

        for(int i = 1;i<arr.length;i++){
            if(arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,5,5,6};

        arr = removeDuplicates(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
