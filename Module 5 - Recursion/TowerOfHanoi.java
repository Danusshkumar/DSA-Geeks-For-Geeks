public class TowerOfHanoi {

    public static void solution(int n,char a,char b,char c){
        if(n == 1){
            System.out.println("Move 1 from "+ a + " to " + c);
            return;
        }
        solution(n-1,'A','C','B');
        System.out.println("Move "+n+" from " + a + " to " + c);
        solution(n-1,'B','A','C');
    }
    public static void main(String[] args){
        solution(2,'A','B','C');
    }
}