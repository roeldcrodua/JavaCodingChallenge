
import java.util.*;
        import java.io.*;
        import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class ReverseWord {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String FIRST = in.nextLine();
        String SECOND = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if (FIRST.length() == 3){
            System.out.print(FIRST);
            System.out.print(SECOND.substring(3));
        } else if (FIRST.length() > 3){
            System.out.print(FIRST);
        }
    }
}