public class PermutationForLock
{
    static int countPermutation = 0;

    public static void printCombinationNumber(int n, int value){
        if(n == 0){
            countPermutation++;
            System.out.println(value);
            return;
        }

        for(int i = 1;i<10;i++){
            value = value * i * 10;
            printCombinationNumber(n - 1,value);
        }

    }
    
    public static void printCombination(int n,String value){
        if( n == 0){
            countPermutation++;
            System.out.println(value);
            return;
        }
        
        for(int i = 0;i<10;i++)
            printCombination(n - 1,value + i);
    }
    
	public static void main(String[] args) {
		printCombination(4,"");
        //printCombinationNumber(4,1);
		System.out.println("The number of permutation possible are " + countPermutation);
	}
}
