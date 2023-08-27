
public class SubsetsUsingRecursion {

    public static void solution(String str,int n,String empty){

        if(n == str.length()){
            System.out.println("\"" + empty + "\"");
            return;
        }
        
        solution(str,n+1,empty);
        //empty = str.substring(0,n+1);
        solution(str,n+1,empty + str.charAt(n));
    }

    public static void main(String[] args) {
        solution("ABC",0,"");
    }
}
