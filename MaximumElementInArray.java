import java.util.ArrayList;
import java.util.List;


import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class MaximumElementInArray {

        public static void main(String args[]) {

            String myArray = "23 92 56 39 93";
            Scanner in = new Scanner(myArray);
            int n = in.nextInt();

            List<Integer> numbers = new ArrayList<>();
            List<Integer> operations = new ArrayList<>();
            for (String arr: myArray.split(" ")) {
                numbers.add(Integer.parseInt(arr));
            }

            Integer minimum = numbers.get(0);
            Integer maximum = numbers.get(0);
            for ( Integer number: numbers){
                if (number < minimum)
                    minimum = number;
                if (number > maximum)
                    maximum = number;
            }
            System.out.println(minimum);
            System.out.println(maximum);
        }
    }
