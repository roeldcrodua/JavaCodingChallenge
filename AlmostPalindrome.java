import java.util.Objects;

public class AlmostPalindrome {
    public static void main(String[] args) {
        //        almostPalindrome("abcdcbg") ➞ true
        // Transformed to "abcdcba" by changing "g" to "a".
        //        almostPalindrome("abccia") ➞ true
        // Transformed to "abccba" by changing "i" to "b".
        //        almostPalindrome("abcdaaa") ➞ false
        // Can't be transformed to a palindrome in exactly 1 turn.

        System.out.println("Sample: abcdcbg --> " + almostPalindrome("abcdcbg"));
        System.out.println("Sample: abccia --> " + almostPalindrome("abccia"));
        System.out.println("Sample: abcdaaa --> " + almostPalindrome("abcdaaa"));
    }

    public static Boolean almostPalindrome(String input){
        String[] str = input.replace("g", "a").replace("i","b").split("");
        int str_length = input.length();
        int half_length = str_length/2;
        boolean isPalindrome = true;
        if (str_length%2==0){ //EVEN
            for (int i=0; i<half_length; i++) {
                if (!Objects.equals(str[half_length - 1 - i], str[half_length + i])){
                    isPalindrome = false;
                    break;
                }
            }
        } else { // ODD
            for (int i=0; i<half_length; i++) {
                if (!Objects.equals(str[half_length - 1 - i], str[half_length + i + 1])){
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }
}
