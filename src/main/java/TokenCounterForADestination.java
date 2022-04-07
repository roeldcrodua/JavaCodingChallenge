import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TokenCounterForADestination {
    /*
    Assume the tokens available are 10, 6, 11, 4, 2, 3.

    Tokens bought to reach the first checkpoint: 10 (0 – 10)
    Tokens bought to reach the second checkpoint: 0 , he gained 4 (10-6)
    Tokens bought to reach the third checkpoint: 1 (6 – 11 + 4)
    Tokens bought to reach the fourth checkpoint: 0, he gained 7 and he reach the destination without buying any more Tokens. Hence the number of tokens bought is 11

    Sample Input	                        Sample Output	        Explanation
    1, 9, 33, 2, 17, 15, 10, 15, 22, 25	    33
    5,10,15	                                15

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String[] tokens = inputString.replaceAll(" ", "").split(",");

        List<Integer> numbers = new ArrayList<>();
        for (String n: tokens){
            numbers.add(Integer.parseInt(n));
        }
        System.out.println(Collections.max(numbers));
    }
}
