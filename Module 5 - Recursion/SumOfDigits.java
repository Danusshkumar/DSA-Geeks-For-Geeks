public class SumOfDigits {

    public static int solution(int n){
        if(n == 0) return 0;
        return n%10 + solution(n/10);
    }
    //time complexity theta(log(n) base 10)
    //auxiliary space theta(log(n) base 10)

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
