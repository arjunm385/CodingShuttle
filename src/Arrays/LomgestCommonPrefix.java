package Arrays;

public class LomgestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"coder", "coding", "code"};
        System.out.println("longest common prefix is: " + longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] arr) {
        //You can code here
        int minLength = Integer.MAX_VALUE;
        String word = "";
        for(String i: arr) {
            if(i.length() < minLength) {
                minLength = i.length();
                word = i;
            }
        }

        minLength = Integer.MAX_VALUE;

        for(String curr: arr) {
            int count = 0;
            for(int i=0; i<word.length(); i++) {
                if(curr.charAt(i) != word.charAt(i)) {
                    break;
                }
                count++;
            }
            if(count == 0){
                return "";
            }
            minLength = Math.min(minLength, count);
        }

        return word.substring(0, minLength);
    }
}
