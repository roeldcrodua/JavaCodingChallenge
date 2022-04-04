import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.*;

/*
Write a method that takes a positive integer and returns the next smaller positive integer
containing the same digits.

Expected Input: nextSmaller(21)
Expected Output: 12

Expected Input: nextSmaller(531)
Expected Output: 513

Expected Input: nextSmaller(907)
Expected Output: 790

Expected Input: nextSmaller(2071)
Expected Output: 2017

If there is no smaller number that contains the same digits, return -1
 */
public class SmallerInteger {
    public static void main(String[] args) {
        nextSmaller(907);
    }

    public static Integer shuffle(Integer number){
        List<Character> chars = new ArrayList<Character>();
        for ( char c : number.toString().toCharArray() ) {
            chars.add(c);
        }
        Collections.shuffle(chars);

        char[] shuffled = new char[chars.size()];
        for ( int i = 0; i < shuffled.length; i++ ) {
            shuffled[i] = chars.get(i);
        }
        String shuffledNumber = new String(shuffled);
        System.out.println(shuffledNumber);
        return  Integer.parseInt(shuffledNumber);
    }

    public static Integer nextSmaller(Integer number){
        Set<Integer> smaller = new HashSet<Integer>();
        boolean bigger = true;
        int small = -1;
        int big = 0;
        while (bigger) {
            int num = shuffle(number);
            if( num < number){
                if ( num > small){
                    big = num;
                }
                small = num;
            }
        }
        return small;
    }
}
