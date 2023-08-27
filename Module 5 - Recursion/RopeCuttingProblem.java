public class RopeCuttingProblem {

    public static boolean solution(int n,int a,int b,int c){
        if(n == 0) return true;
        if(n < 0) return false;
        return a;
    }
    public static void main(String[] args) {
        int n = 23, a = 11, b = 14, c = 11;
        System.out.println(solution(n,a,b,c));
    }
}
