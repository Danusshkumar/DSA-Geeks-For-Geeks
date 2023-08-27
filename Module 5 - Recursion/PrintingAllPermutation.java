public class PrintingAllPermutation {

    public static void permute(String str, int i){
        if( i == str.length()){
            System.out.println(str);
            return;
        }

        for(int j = i;j<str.length();j++){
            // swap i and j

            char char1 = str.charAt(i);
            char char2 = str.charAt(j);

            StringBuffer string = new StringBuffer(str);
            string.setCharAt(i,char2);
            string.setCharAt(j,char1);

            str = string.toString();

            permute(str,i+1);
            
            string.setCharAt(i,char1);
            string.setCharAt(j,char2);
            str = string.toString();
        }
    }

    public static void main(String[] args) {

        permute("ABCD",0);
    }
}
