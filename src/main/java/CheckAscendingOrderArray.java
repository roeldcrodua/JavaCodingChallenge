import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*

Given an array of integers, write a program to perform the following:

Print 0 if the entire array is sorted in ascending order
Print 1 if atleast half but not the entire array is sorted in ascending order
Print 2 Otherwise
Note: Use ceil value of half in case if it is a decimal number

Input and Ouput Format:

Input contains array elements seperated by comma. Read the input from standard input stream.

Print the output to standard output stream

Sample Input			Sample Output	Explanation
1,2,3,4,5,6			0		All the elements are in sorted order and hence 0
11, 15, 66, 75, 5		1		15,66 and 75 are in ascending order which is at least half of the total number of elements.
11, 31, 15, 66, 75, 5, 55, 34	2		number of sorted elements are less than half of the total number of elements

 */
public class CheckAscendingOrderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine().replace(" ","");
        checkAscendingOrder(number);
    }

    public static void checkAscendingOrder(String n){
        String input = "";
        if (n.matches("\\.")){
            input = String.valueOf(Math.ceil(Double.parseDouble(n)));
        } else {
            input = n;
        }
        List<String> numbers = Arrays.asList(input.split(","));
        int counter=0;
        int max =0;
        for (int i=0; i<numbers.size(); i++){
            if (i==0){
                continue;
            }else{
                if (Integer.parseInt(numbers.get(i)) > Integer.parseInt(numbers.get(i-1))){
                    counter++;
                } else{
                    counter=0;
                }
            }
            if (counter > max){
                max = counter;
            }
        }
        if (max == numbers.size() -1) {
            System.out.println(0);
        } else if (max >= (numbers.size()%2==0 ? numbers.size()/2 : numbers.size()/2+1)){
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
