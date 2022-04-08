import java.util.*;

public class HourGlassPattern {
    /*
    Given a natural number N, write a program to print the hour-glass pattern as shown in the example

    For N=4

    1 0 2 0 3 0 4

    0 2 0 3 0 4 0

    0 0 3 0 4 0 0

    0 0 0 4 0 0 0

    0 0 3 0 4 0 0

    0 2 0 3 0 4 0

    1 0 2 0 3 0 4

    Input Format

    Read the input from the standard input stream.

    Output Format

    Each element in a row should be separated by a space. Print the output to standard output stream.

    Sample Input	Sample Output	Explanation

    10
    1 0 2 0 3 0 4 0 5 0 6 0 7 0 8 0 9 0 10
    0 2 0 3 0 4 0 5 0 6 0 7 0 8 0 9 0 10 0
    0 0 3 0 4 0 5 0 6 0 7 0 8 0 9 0 10 0 0
    0 0 0 4 0 5 0 6 0 7 0 8 0 9 0 10 0 0 0
    0 0 0 0 5 0 6 0 7 0 8 0 9 0 10 0 0 0 0
    0 0 0 0 0 6 0 7 0 8 0 9 0 10 0 0 0 0 0
    0 0 0 0 0 0 7 0 8 0 9 0 10 0 0 0 0 0 0
    0 0 0 0 0 0 0 8 0 9 0 10 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0 9 0 10 0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0 0 10 0 0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 0 9 0 10 0 0 0 0 0 0 0 0
    0 0 0 0 0 0 0 8 0 9 0 10 0 0 0 0 0 0 0
    0 0 0 0 0 0 7 0 8 0 9 0 10 0 0 0 0 0 0
    0 0 0 0 0 6 0 7 0 8 0 9 0 10 0 0 0 0 0
    0 0 0 0 5 0 6 0 7 0 8 0 9 0 10 0 0 0 0
    0 0 0 4 0 5 0 6 0 7 0 8 0 9 0 10 0 0 0
    0 0 3 0 4 0 5 0 6 0 7 0 8 0 9 0 10 0 0
    0 2 0 3 0 4 0 5 0 6 0 7 0 8 0 9 0 10 0
    1 0 2 0 3 0 4 0 5 0 6 0 7 0 8 0 9 0 10

    3
    1 0 2 0 3
    0 2 0 3 0
    0 0 3 0 0
    0 2 0 3 0
    1 0 2 0 3
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int input_number = input.nextInt();


        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=input_number; i++){
            //System.out.print(i==input_number ? i : i + " 0 ");
            sb.append(i==input_number ? i : i + " 0 ");
        }

        //System.out.println("\n");
        List<Integer> numbers = new ArrayList<>();
        for (String n: sb.toString().split(" ")){
            numbers.add(Integer.parseInt(n));
        }

        for (int index=0; index<input_number; index++){
            for (int x=index; x< numbers.size(); x++){
                System.out.print(numbers.get(x) + " ");
            }
            System.out.println();
        }

    }
}
