import java.util.Scanner;

public class ParenthesisCounter {

    /*
    Given an arithmetic expression with parentheses, write a program to print the sequence of opening and closing of parentheses.

    For example, consider the following expression:
    (a + b)*(5*(c - d))

    Paranthesis 1 opens
    Paranthesis 1 closes
    Paranthesis 2 opens
    Paranthesis 3 opens
    Paranthesis 3 closes
    Paranthesis 2 closes

    Hence, the sequence will be: 112332

    Input Format
    A single line contains an arithmetic expression having at least one parenthesis. Read the input from standard input.

    Output Format
    Print the sequence of the opening and closing of parentheses to standard output.

    Sample Input	Sample Output	Explanation
    (5+(t * (10 - 6))) + (8 + f)	12332144	In the sample input first parentheses starts at the first index before 5, so print 1. Second parentheses start before t, so print 2. Third parentheses start before 10, so print 3. Third parentheses end after 6, so print 3. Second parentheses end after the end of third parentheses, so print 2, and so on.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        getParenthesisCount(inputString);
    }

    public static void getParenthesisCount(String input){
        StringBuilder sb = new StringBuilder();
        int open =0;
        int lastOpen = 0;
        int lastClose =0;
        int diff =0;
        for (String s: input.replace(" ", "").split("")){
            if (s.matches("\\(")){
                System.out.print("( ");
                open = lastOpen;
                open++;
                System.out.println(open);
                sb.append(open);
                if (open > lastOpen){
                    lastOpen=open;
                }
            }
            if (s.matches("\\)")){
                System.out.print(") ");
                if (lastOpen > lastClose){
                    lastClose = lastOpen;
                }
                System.out.println(open);
                sb.append(open);
                open--;
            }
        }
        System.out.println(sb);
    }
}
