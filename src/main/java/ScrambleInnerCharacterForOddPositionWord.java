import java.util.*;

public class ScrambleInnerCharacterForOddPositionWord {
    /*
    Given a sentence, write a program to scramble the words as per the below conditions:

    The position of words should not be changed.
    If the word appears at even position in the sentence, rearrange the characters of the word in lexicographical order leaving first and last character.
    If the word appears at odd position in the sentence, rearrange the characters of the word in reverse lexicographical order leaving first and last character.
    Note:

    The positions of the words start from 1

    Each word contains only alphabets

    The sentence can have maximum of 150 characters.

    Input Format

    A single line containing words, each word separated by a space. Read the input from standard input

    Output Format

    Print the sentence with scrambled words to standard output.

    Sample Input	Sample Output	Explanation
    Hello to my world	Hlleo to my wlord	Hello is translated to Hlleo keeping H and o as it is. Since Hello appears at odd position in the string, ell will be sorted in reverse lexicographical order. Similarly other words are scrambled based on the problem statement.
         */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        scrambleWord(inputString);
    }

    public static void scrambleWord(String input){
        List<String> words = new ArrayList<>();
        String[] w = input.split(" ");

        for (int i=0; i<w.length; i++){
            String word = w[i];
            if (word.length()>3) {
                List<String> letters = new ArrayList<>();
                letters.addAll(Arrays.asList(word.substring(1, word.length() - 1).split("")));
                if (i % 2 == 0) {
                    letters.sort(Collections.reverseOrder());
                    StringBuilder reverse = new StringBuilder();
                    for (String r : letters) {
                        reverse.append(r);
                    }
                    words.add(word.charAt(0) + reverse.toString() + word.charAt(word.length() - 1));
                }else {
                    Collections.sort(letters);
                    StringBuilder sorted = new StringBuilder();
                    for (String r : letters) {
                        sorted.append(r);
                    }
                    words.add(word.charAt(0) + sorted.toString() + word.charAt(word.length() - 1));
                }
            }else{
                words.add(word);
            }
        }
        StringBuilder temp = new StringBuilder();
        for (String word: words){
            temp.append(word + " ");
        }
        System.out.println(temp);
    }
}
