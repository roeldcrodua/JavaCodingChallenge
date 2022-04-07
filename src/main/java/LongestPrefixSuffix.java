import java.util.*;

    /*
        Given an input string, write a program to print the length of the longest prefix which is also the suffix of the given string. The prefix and suffix should not overlap. Print 0 if no such suffix and prefix exists.

        Input Format

        First line contains the input string. Read the input from standard input.

        Output Format

        Print the output to standard output.

        Sample Input	Sample Output	Explanation
        aabcdaabc	4	The sub-string "aabc" is the longest prefix which is also suffix
        aaftaaft	4
        aab	0
     */
public class LongestPrefixSuffix {

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine().replace(" ", "");

        List<String> part1 = new ArrayList<>();
        List<String> part2 = new ArrayList<>();
        for (int i=inputString.length()/2; i>0; i--){
            if (inputString.length()%2==0){
                part1.add(String.valueOf(inputString.charAt((inputString.length()/2)-i)));
                part2.add(String.valueOf(inputString.charAt(inputString.length()-i)));
            } else {
                part1.add(String.valueOf(inputString.charAt((inputString.length()/2) - i)));
                part2.add(String.valueOf(inputString.charAt(inputString.length()-i)));
            }
        }
        int counter =0;
        int i = 0;
        for (String str: part1){
            if (str.equals(part2.get(i))){
                counter++;
            }
            i++;
        }
        System.out.println(counter > 0 ? counter : 0);
    }
}
