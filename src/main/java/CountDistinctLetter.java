
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Collectors;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class CountDistinctLetter {

        public static void main(String args[]) {
            String words = "We can use it in the control structure to produce the search-based result";
            Scanner in = new Scanner(words.replace(" ","").toLowerCase(Locale.ROOT));
            String W = in.next();

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            char[] letters = W.toCharArray();
            System.out.println(letters);
            int counter = 0;
            List<String> list = new ArrayList<>();
            for (char letter: letters){
                list.add(String.valueOf(letter));
            }
            List<String> distinctList =  list
                    .stream()
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(distinctList);
            System.out.println(distinctList.size());
        }
    }