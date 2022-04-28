    /*
    Matt works as a security officer in Milton golf links. He tracks the entry and exit of all the vehicles at the main gate. The management has requested him to track the vehicles with special registration number as they might get a chance to win goodies. The registration numbers that have unique digits which are ordered are considered to be special.

        E.g, KA-09-AB-4589 is eligible for a goodie as 4589 is in arranged in ascending order where KA-09-AB-3124 is not eligible.

        Given a string S containing the registration number of all the vehicles tracked by Matt, write a program to print the number of vehicle owners who have the chance to win goodies.

        Input and Output Format :

        Read the comma separated vehicle registration number from standard input stream. Print the output to the standard output stream

        Sample Input	Sample Output	Explanation
        KA-09-HF-4352, OR-02-AG-5824, MP-01-RE-4321, TN-04-KA-4566, KA-09-HF-9844	3	Owners of MP-01-RE-4321, TN-04-KA-4566, KA-09-HF-9844 stand a chance to win goodies
        KA-09-HF-4352, OR-02-AG-5824, MP-01-RE-4323, TN-04-KA-4566, KA-09-HF-9844, KA-09-HF-4352, OR-05-AG-5880, MP-03-FR-0199	3	Owners of TN-04-KA-4566, MP-03-FR-0199, KA-09-HF-9844 stand a chance to win goodie
    */

import java.util.*;

public class VehicleRegistrationSpecialGoodies {
        public static void main (String[]args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            try {
                String input = sc.nextLine();
                if (input.length() < 1) {
                    System.out.println(0);
                } else {
                    List<String> reg = Arrays.asList(input.trim().replace(" ", "").split(","));
                    int counter = 0;
                    for (String str : reg) {
                        int num = Integer.parseInt(str.substring(str.length() - 4));

                        List<String> origDigits = new ArrayList<>();
                        List<String> sortedDigits = new ArrayList<>();
                        List<String> reverseDigits = new ArrayList<>();
                        for (String n : String.valueOf(num).split("")) {
                            sortedDigits.add(n);
                            reverseDigits.add(n);
                            origDigits.add(n);
                        }

                        StringBuilder sbSorted = new StringBuilder();
                        Collections.sort(sortedDigits);
                        for (String n : sortedDigits) {
                            sbSorted.append(n);
                        }

                        StringBuilder sbReverse = new StringBuilder();
                        Collections.sort(reverseDigits, Collections.reverseOrder());
                        for (String n : reverseDigits) {
                            sbReverse.append(n);
                        }

                        StringBuilder sbOrig = new StringBuilder();
                        Collections.sort(origDigits);
                        for (String n : origDigits) {
                            sbOrig.append(n);
                        }

                        if (sbOrig.toString().equals(sbSorted.toString())) {
                            if (String.valueOf(num).equals(sbSorted.toString()) || String.valueOf(num).equals(sbReverse.toString())) {
                                counter++;
                            }
                        }
                    }
                    System.out.println(counter);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println(0);
                throw new Exception();
            }
        }
    }