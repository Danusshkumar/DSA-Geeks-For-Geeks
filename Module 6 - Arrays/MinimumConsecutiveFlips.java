public class MinimumConsecutiveFlips {

    public static void myMinConsecFlips(int[] arr){
        int oneChunks = 0;
        int zeroChunks = 0;
        int n = arr.length;

        if(arr[0] == 0) 
            zeroChunks++;
        else 
            oneChunks++;

        for(int i = 1;i<n;i++){
            if(arr[i] != arr[i - 1])
                if(arr[i] == 1)
                    oneChunks++;
                else if(arr[i] == 0)
                    zeroChunks++;
        }

        System.out.println(oneChunks + " " + zeroChunks);

        if(oneChunks < zeroChunks){
            
            Boolean isInTheConsec = false;
            
            for(int i = 0;i<n;i++){

                if(arr[i] == 1 && (isInTheConsec == false)){
                    System.out.print("From " + i + " to ");
                    isInTheConsec = true;
                }
                else if( isInTheConsec && arr[i] != arr[i - 1]){
                    System.out.println(i - 1);
                    isInTheConsec = false;
                }
            }
        }
        else{
            //print about zero chunks
            Boolean isInTheConsec = false;
            
            for(int i = 0;i<n;i++){

                if(arr[i] == 0 && (isInTheConsec == false)){
                    System.out.print("From " + i + " to ");
                    isInTheConsec = true;
                }
                else if( isInTheConsec && arr[i] != arr[i - 1]){
                    System.out.println(i - 1);
                    isInTheConsec = false;
                }
            }
        }
        
    }

    public static void minConsecFlips(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++)
            if(arr[i] != arr[i - 1])
                if(arr[i] != arr[0])
                    System.out.print("From " + i + " to ");
                else
                    System.out.println(i-1);
        if(arr[n - 1] != arr[0])
            System.out.println(n-1);
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,0};
        minConsecFlips(arr);
    }
}
