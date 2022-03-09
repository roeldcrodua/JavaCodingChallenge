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
public class PalindromeCount {
    public static void main(String[] args) {
        palindromeCount("cbaabbb");
    }

    public static Integer palindromeCount(String word){
        StringBuilder temp = new StringBuilder();

        int count = 0;
        for (int i = 0; i < word.length(); i++){
            temp.append(" " + String.valueOf(word.charAt(i)));
            for ( int x=0; x<word.length(); x++){
                if (i != x) {
                    temp.append(String.valueOf(word.charAt(x)));
                }
            }
            System.out.print(temp);
            System.out.println();
            int len = temp.length();
            //temp.delete(0,len);
        }
        return count;
    }
}
/*
Given a string, you keep swapping any two characters in the string randomly till the string becomes a palindrome. What is the expected number of swaps you will make? There will always be at least one palindrome which can be formed with the letters of the given string.

Input:
The first line contains the number of test cases T. Each of the next T lines contains a string each.

Output:
Output T lines containing the answer for the corresponding test case. Print the answer correct to 4 decimal places.

Constraints:
T <= 10000
The length of the string will be at most 8 characters.
The string will consist of only lower-case letters 'a'-'z'.

Sample Input:
4
b
bb
abb
cbaabbb

Sample Output:
0.0000
0.0000
3.0000
59.3380


Explanation:

For the first two cases, the string is already a palindrome so no swaps are needed.

For the third case, there are 3 possible swaps. The string will become "bab","bba" or remain "abb" with 1/3rd probability each. It's easy to see that the expected number of swaps needed is 3.0000

For the last case, the answer is 59.337962..., which should be printed as 59.3380
 */