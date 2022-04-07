import java.util.*;

public class LargestWord2DMatrix {
    /*
    Given a message containing words, write a program to print the encoded message according to the below rules:

    Write the words one below the other to form a 2D matrix and identify the largest word
    Fill the empty places with the sum of ASCII values of the characters in the current and previous column of the largest word
    Generate the encoded message by combining the elements column wise
    Note: There will be only one largest word in the message

    Example :
    Input Message :  "I AM A SPY"
    Largest Word : SPY
    Matrix Representation :

    I
    A	M
    A
    S	P	Y
    Fill the empty cells:

    I	ASCII(S)+ASCII(P) = 163	ASCII(P)+ASCII(Y) = 169
    A	M	ASCII(P)+ASCII(Y) = 169
    A	ASCII(S)+ASCII(P) = 163	ASCII(P)+ASCII(Y) = 169
    S	P	Y
    Final Matrix:

    I	163	169
    A	M	169
    A	163	169
    S	P	Y
    Encoded Message : IAAS163M163P169169169Y

    Input Format:
    Read the message from standard input stream

    Output Format:
    Print the encoded message to standard output stream


    Sample Input	Sample Output	Explanation
    I AM A SPY	IAAS163M163P169169169Y	NA
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        // Get the largest value and store the values into list
        int max =0 ;
        String maxValue = "";
        List<String> group = new ArrayList<>();
        for (String str: sentence.split(" ")){
            if (str.length() > max){
                max = str.length();
                maxValue = str;
            }
            group.add(str);
        }

        // Create another list according to the column group
        List<List<String>> groupColumn = new ArrayList<>();
        for (String val: group) {
            int len = val.length();
            List<String> groupInColumn= new ArrayList<>();
            int asciiValue = 0;
            for (int i=0; i<max; i++){
                char ch = maxValue.charAt(i);
                asciiValue += ch;
                if (len>0){
                    groupInColumn.add(String.valueOf(val.charAt(i)));
                } else {
                    groupInColumn.add(String.valueOf(asciiValue));
                }
                len--;
                if (i>0) {
                    asciiValue -= maxValue.charAt(i - 1);
                }
            }
            groupColumn.add(groupInColumn);
        }

        // Combine the column group by ascending order as what is sortedset is.
        StringBuilder output = new StringBuilder();
        for (int i=0; i<max; i++){
            for (List<String> s: groupColumn){
                output.append(s.get(i));
            }
        }
        System.out.println(output);
    }

}
