public class SumOfnNaturalNumbers {

    public static int solution(int n){
        if(n == 0) return 0;
        return n + solution(n - 1);

    }
    // time complexity theta(n + 1) => theta(n)
    // auxiliary space theta(n + 1) => theta(n)


    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
