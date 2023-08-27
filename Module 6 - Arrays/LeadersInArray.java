public class LeadersInArray {

    /*
     * 
     */

    public static void printLeadersInSquareOfN(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            Boolean flag = false;
            for(int j = i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    flag = true;
                }
            }

            if(flag == false) System.out.println(arr[i]);
        }
    }

    public static void printLeaders(int[] arr){
        int n = arr.length;
        int currentLeader = arr[n - 1];
        System.out.println(currentLeader);

        for(int i = n - 2;i>=0;i--){
            if(arr[i] > currentLeader){
                currentLeader = arr[i];
                System.out.println(currentLeader);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,10,5,6,3,4,2};
        printLeaders(arr);
        System.out.println("Print leaders in bigO(n^2) time complexity : ");
        printLeadersInSquareOfN(arr);
    }
}
