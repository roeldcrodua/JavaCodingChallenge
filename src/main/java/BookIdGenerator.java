import java.util.Scanner;

public class BookIdGenerator {
    /*
    Mat manages Livingston Library. He uses a unique numbering pattern for books gifted by the members. Each book will have a unique alphabet sequence followed by a 4-digit numeric sequence.

    Alphabet sequence: A,B…Z, AA, AB…ZZ, AAA…ZZZ…

    Number Sequence: 0001 to 9999
    Sample Book ID: A0001, A0002,…..,A9999, B0001,….Z9999,AA0001....ZZ9999,...

    Given the last generated book ID and the number of new books gifted by the members, write a program to print the book IDs.

    Input format:
    The first line contains the last generated book ID and the second line contains the number of new books. Read the input from standard input stream.

    Output format:
    Print the generated book IDs separated by comma to the standard output stream

    Sample Input	Sample Output	                            Explanation
    A0001
    5	            A0002,A0003,A0004,A0005,A0006	            undefined
    Z9998
    5	            Z9999,AA0000,AA0001,AA0002,AA0003	        undefined
    ZZZ9998
    5	            ZZZ9999,AAAA0000,AAAA0001,AAAA0002,AAAA0003	undefined
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
    }

    public static void generateBookId(String input, Integer count){

    }
}
