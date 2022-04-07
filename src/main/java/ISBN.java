import java.util.Scanner;

public class ISBN {
    /*
    An ISBN-13 is an International Standard Book Number used by publishers, libraries, retailers etc. f
    or managing books. This number is calculated using a mathematical formula and includes a check digit
    to validate the number. It is a 13 digit number : d1d2d3d4d5d6d7d8d9d10d11d12d13.
    The last digit d13 is a check digit which is calculated from the other 12 digits as follows:

    d13  = 10 - (d1 + 3*d2 + d3 + 3*d4 + d5 + 3*d6 + d7 + 3*d8 + d9 + 3*d10 + d11 + 3*d12)%10

    The digit in the unit place is considered where ever generated check digit has more than one digit.
    Given a 12 digit number, write a program that calculates and prints the 13-digit ISBN number.

    Input format:
    Read the 12 digit positive number from the standard input.

    Output format:
    Print the 13 digit ISBN number to the standard output.

    Sample Input	Sample Output	Explanation
    978013213080	9780132130806
    978013213079	9780132130790
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println(number + getLastDigit(number));
    }

    public static Integer getLastDigit(String n){
        int total = 10 - ((Integer.parseInt(String.valueOf(n.charAt(0)))) +
                            3*(Integer.parseInt(String.valueOf(n.charAt(1)))) +
                            (Integer.parseInt(String.valueOf(n.charAt(2)))) +
                            3*(Integer.parseInt(String.valueOf(n.charAt(3)))) + (Integer.parseInt(String.valueOf(n.charAt(4)))) +
                            3*(Integer.parseInt(String.valueOf(n.charAt(5)))) +
                            (Integer.parseInt(String.valueOf(n.charAt(6)))) +
                            3*(Integer.parseInt(String.valueOf(n.charAt(7)))) +
                            (Integer.parseInt(String.valueOf(n.charAt(8)))) +
                            3*(Integer.parseInt(String.valueOf(n.charAt(9)))) +
                            (Integer.parseInt(String.valueOf(n.charAt(10)))) + 3*(Integer.parseInt(String.valueOf(n.charAt(11))))) % 10;
        if (total>=10){
            return total % 10;
        } else {
            return total;
        }
    }
}
