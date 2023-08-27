class InsertAtPosition {

    public static void insert(int[] arr, int n, int x, int cap, int pos){

        if(n == cap)
            System.out.println("Can't insert the element");
        else {
            for(int i = cap-1;i>=pos;i--){
                arr[i] = arr[i - 1];
            }
            arr[pos - 1] = x;

            /*
             * for( int i = n - 1; i>= idx; i--)
             *  arr[i+1] = arr[i];
             *  ** suggested implementation
             */

            for(int i = 0;i<cap;i++){
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        insert(arr,3,10,5,2);
    }
}