import java.util.*;

public class BouncyNumber {
    /*Bouncy number is a positive integer which has its digits un-ordered. 14752 is a bouncy number where 95321 is not a bouncy number.

    Given a positive number N, write a program to print the total number of bouncy numbers that exists from 0 to N (including N).

    Input and Output Format :

    Read the number from standard input stream and print the output to the standard output.

    Sample Input	Sample Output	Explanation
    110	            9	            Bouncy Numbers are 101,102,103…109
    121	            11	            Bouncy Numbers are 101,102,103…109 and 120,121

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int counter = 0;
        for (int num=sc.nextInt() ;num>99; num--){
            boolean isBouncy = false;
            List<String> origDigits = new ArrayList<>();
            List<String> sortedDigits = new ArrayList<>();
            List<String> reverseDigits = new ArrayList<>();
            for (String n: String.valueOf(num).split("")){
                sortedDigits.add(n);
                reverseDigits.add(n);
                origDigits.add(n);
            }

            StringBuilder sbSorted = new StringBuilder();
            Collections.sort(sortedDigits);
            for (String n: sortedDigits){
                sbSorted.append(n);
            }

            StringBuilder sbReverse = new StringBuilder();
            Collections.sort(reverseDigits, Collections.reverseOrder());
            for (String n: reverseDigits){
                sbReverse.append(n);
            }

            StringBuilder sbOrig = new StringBuilder();
            Collections.sort(origDigits);
            for (String n: origDigits){
                sbOrig.append(n);
            }

            if (sbOrig.toString().equals(sbSorted.toString())) {
                if (!String.valueOf(num).equals(sbSorted.toString()) && !String.valueOf(num).equals(sbReverse.toString())) {
                    counter++;
                }
            }
        }
        System.out.println("COUNT: " +counter);
    }
}
