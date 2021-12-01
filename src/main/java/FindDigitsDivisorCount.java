
import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class FindDigitsDivisorCount {

        public static void main(String args[]) {

            String input = "1012";
            Scanner in = new Scanner(input);
            int n = in.nextInt();

            int counter = 0;
            for (int i = 0; i < String.valueOf(n).length(); i++){
                try {
                    if (n % Character.getNumericValue(String.valueOf(n).charAt(i)) == 0) {
                        counter++;
                    }
                }catch(Exception ex) {
                }
            }
            System.out.println(counter);
        }
    }

