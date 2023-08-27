import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String str,int start,int end){
        if(start >= end) return true;

        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str,start + 1, end - 1);
        //if the first condition itself false, the recursion won't be called and further recursion calls
        // stops. This recursion call stops on the compiler design of working with & operator

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str,0,str.length() - 1));
    }
}
