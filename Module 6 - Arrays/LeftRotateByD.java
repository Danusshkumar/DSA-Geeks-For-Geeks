public class LeftRotateByD {

    /*
     * For first solution the time required will be theta(n * d) as the loop runs
     * n times for every one rotation and d rotations happens. Aux space is theta(1)
     * 
     * Second solution:
     * It copies first d elements to temp, so theta(d)
     * It moves n-d elements to left, so theta(n - d)
     * It copies d elements from temp to remaining trailing places of array, so theta(d)
     * theta( d + n - d + d) ==> theta(n + d).
     * d will be number of rotation so it'll be less than n. If it is greater than n means we will
     * simply do the operation for d - n times. Because rotation 6 elements in 5 element array is
     * equivalent to rotating 1 time, right. So clearly, d will be less than or equal to n.
     * In worst case, if it is equal to n, then theta(n + d) ==> theta(2n) which is equal to theta(n)
     * Aux space required here is theta(d)
     * 
     * Third solution:
     * we are reversing the array from 0 to d ==> theta(d).
     * then we are reversing the array from d to n ==> theta(n - d)
     * then we are rotating the whole array from 0 to n ==> theta(n)
     * theta(d + n - d + n) ==> theta(n + n) ==> theta(2n) ==> theta(n)
     * But aux space required here is theta(1)
     */

    public static int[] rotateDTimes(int[] arr,int d){
        while( d > 0){
            int temp = arr[0];
            for(int i = 1;i<arr.length;i++){
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            d--;
        }
        return arr;
    }

    public static int[] rotate1TimeWithDSpace(int[] arr,int d){

        int[] temp = new int[d];
        for(int i = 0;i<d;i++)
            temp[i] = arr[i];

        for(int i = d;i<arr.length;i++)
            arr[i - d] = arr[i];
        
        for(int i = 0;i<d;i++)
            arr[arr.length - d + i] = temp[i];
        return arr;
    }

    public static int[] rotate1TimeWith1Space(int[] arr,int d){

        arr = reverse(arr,0,d);
        arr = reverse(arr,d,arr.length);
        arr = reverse(arr,0,arr.length);
        return arr;
    }


    public static int[] reverse(int[] arr,int startPos, int endPos){

        endPos = endPos - 1;

        while(startPos < endPos){

            int temp = arr[startPos];
            arr[startPos] = arr[endPos];
            arr[endPos] = temp;

            startPos++;
            endPos--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;

        // Comment out the remaining methods to verify the correct working of particular method
        arr = rotateDTimes(arr,d);
        arr = rotate1TimeWithDSpace(arr,d);
        arr = rotate1TimeWith1Space(arr,d);

        for(int i = 0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
