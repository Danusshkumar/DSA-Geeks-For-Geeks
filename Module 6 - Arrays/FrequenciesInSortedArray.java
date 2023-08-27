public class FrequenciesInSortedArray {

    public static void findFrequency(int[] arr){

    int n = arr.length;
    int lastSeen = arr[0];
    int count = 1;

    for(int i = 1;i<n;i++){
        if(arr[i] == lastSeen)
            count++;
        else{

            System.out.println(lastSeen + " " + count);

            count = 1;
            lastSeen = arr[i];
        }
    }

    System.out.println(lastSeen + " " + count);

    }


    public static void main(String[] args) {
        int[] arr = {40,50,50,50};

        findFrequency(arr);
    }
}
