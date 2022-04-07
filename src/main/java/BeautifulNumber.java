//        Given an array of L integers and a number N, write a program to check whether the array is beautiful or not. An array is said to be beautiful if it satisfies the following conditions:
//
//        All elements of array must lie between 1 and N (inclusive of 1 and N).
//        Array must be unordered
//        The array elements are unique.
//        Print True if array is beautiful, False otherwise..
//
//        Input Format
//
//        First line of input contains N.
//        Second line of input contains L.
//        Third line of input contains L elements of array separated by spaces. Read the input from standard input.
//
//        Constraints
//
//        0 < N < 10000.
//        0 < L < 10000.
//        Output Format
//
//        Print True, if array is beautiful, False otherwise. Print the output to standard output
//
//        Sample Input	Sample Output	Explanation
//        5
//        4
//        1 2 3 4	    False	        Array is in ascending order
//        8
//        5
//        4 7 2 5 6	    True	        True, because array satisfies all the required conditions
//


import java.util.*;

class BeautifulNumber
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        String N = s.nextLine();
        String L = s.nextLine();
        String inputNum = s.nextLine();
        String[] nums = inputNum.split(" ");
        System.out.println(isBeautifulNumber(nums, N, L) ? "True" : "False");
    }

    public static boolean isBeautifulNumber(String[] nums, String N, String L)    {
        boolean isBeautiful = true;

        // Array must be unordered
        StringBuilder sbOrig = new StringBuilder();
        List<String> orig = Arrays.asList(nums);
        for (String org: orig){
            sbOrig.append(org);
        }
        StringBuilder sbSorted = new StringBuilder();
        StringBuilder sbReverse = new StringBuilder();
        List<String> sorted = Arrays.asList(nums);
        Collections.sort(sorted);
        for (String so: sorted){
            sbSorted.append(so);
        }
        Collections.sort(sorted, Collections.reverseOrder());
        for (String so: sorted){
            sbReverse.append(so);
        }

        System.out.println("LIST: " + sbOrig);
        System.out.println("SORTED: " + sbSorted);
        System.out.println("REVERSE: " + sbReverse);
        System.out.println(sbSorted.toString().equals(sbOrig.toString()));
        if (sbSorted.toString().equals(sbOrig.toString()) || sbReverse.equals(sbOrig.toString())){
            isBeautiful = false;
            System.out.print("NUM3: " + " == ");
            System.out.println(isBeautiful ? "True" : "False");
            return isBeautiful;
        }

        for (int i=0; i<Integer.parseInt(L); i++){
            try {
                int num = Integer.parseInt(nums[i]);
                // All elements of array must lie between 1 and N (inclusive of 1 and N)
                if (num > Integer.parseInt(N) || num < 1){
                    isBeautiful = false;
                    System.out.print("NUM1: " + num + " == ");
                    System.out.println(isBeautiful ? "True" : "False");
                    break;
                }
                // The array elements are unique.
                if (Collections.frequency(orig, nums[i]) > 1) {
                    isBeautiful = false;
                    System.out.print("NUM2: " + num + " == ");
                    System.out.println(isBeautiful ? "True" : "False");
                    break;
                }
                return isBeautiful;
            } catch (Exception ex) {}
        }
        return isBeautiful;
    }
}