import java.io.*;
import java.util.*;

public class WhereKangarooMeet {
    /*
    An experiment was conducted using two pet kangaroos.
    The kangaroos were made to compete in a 1000 meter race track
    by making them start at points that are at different distances from the start line.
    Kangaroo A goes three meters in one jump whereas Kangaroo B covers seven meters.

    Write a program that accepts two positive numbers X and Y, comma separated. X and Y denotes the distance
    from the starting point for kangaroos A and B respectively. Print the distance from the start line where
    they may land at the same location(The start line itself doesn't count as a match).
            Print -1, if they don't meet in the course of the race track.

    Input and Output Format:

    Read the comma-separated numbers from standard input stream and print the output to the standard output stream.

        Sample Input	Sample Output	Explanation
           400,325	    -1	            Kangaroo A and B will never meet within in race track
           200,100	    275	            Kangaroo A and B will meet 275 meters away from the start line

    */



    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for(String n: s.nextLine().split(",")){
            numbers.add(Integer.parseInt(n));
        }
        int A = numbers.get(0);
        int B = numbers.get(1);
        Integer meetUp = -1;
        while (A<=1000 || B<=1000){
            if (A==B){
                meetUp = A;
                break;
            }
            A+=3;
            B+=7;
        }
        System.out.println(meetUp);
    }
}

