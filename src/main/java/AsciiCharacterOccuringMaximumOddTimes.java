import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class AsciiCharacterOccuringMaximumOddTimes {
    /*
    Given a string S, write a program to print the ASCII value of the character occurring maximum odd number of times.

    Input and output format: Read the input string from the standard input stream and print the output to the standard output stream.

    Sample Input	Sample Output	Explanation
    AABccdE	        66
    AAcAbbbbCACC	67

     */


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int output=findASCIIValue(input);
        System.out.println(output);
        sc.close();
    }

    public static int findASCIIValue(String string) {
        List<Character> characters = new ArrayList<>();
        Set<Character> chars =new HashSet<>();
        for (char c: string.toCharArray()){
            chars.add(c);
            characters.add(c);
        }
        int max =0;
        int ascii =0;
        for (char charSet: chars){
            if(Collections.frequency(characters, charSet) > max){
                if (Collections.frequency(characters, charSet)%2>0){
                    max = Collections.frequency(characters, charSet);
                    ascii = charSet;
                }
            }
        }
        return ascii;
    }
}