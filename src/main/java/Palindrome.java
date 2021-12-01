/*
(I have had this coding challenge in an actual interview)

You have to write a method Integer palindromeCount(String str) which will receive a string as parameter
and return an integer representing the amount of palindromes found in the string.

NOTE: Assume that the string is one word (no spaces)



Example Input: palindromeCount('aaa');
Example Output: 6
    Reasoning: ('a', 'a', 'a', 'aa', 'aa', 'aaa')

Example Input: palindromeCount('abccba');
Example Output: 9
    Reasoning: ('a', 'a', 'b', 'b', 'c', 'c', 'cc', 'bccb', 'abccba')
 */
public class Palindrome {
    public static void main(String[] args) {
        palindromeCount("131");
    }

    public static Integer palindromeCount(String word){
        String temp = "";
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            System.out.print(String.valueOf(word.charAt(i)));
//            for ( int x=0; x<i; x++){
//                System.out.println(String.valueOf(word.charAt(x)));
//                //temp += String.valueOf(word.charAt(i))+String.valueOf(word.charAt(x));
//                //System.out.print(" " + temp);
//            }

            System.out.println();

        }
        return count;
    }
}
