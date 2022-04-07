import java.util.*;

/*
A group of balls are kept in a box where each ball has a unique whole number written on it.
Ball A can smash ball B only if the number written on the ball B is divisible by the number written on the ball A.

Given an array of positive numbers which represents the number written on each ball,
write a program to print the number on the ball, which can smash all other balls. Print -1 if such ball cannot be found

Input Format

First line contains the number of balls and the second line contains the numbers written on each ball separated by space.
Read the input from standard input

Output Format

Print the number on the ball that can smash all other balls.
Print -1 if no such ball can be found. Print the output to standard output.

Sample Input	    Sample Output	Explanation
5
25 5 15 20 10 50	5	            5 is that number which completely divides all other numbers present in the array.
 */
public class FindBallBeater {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for(String n: s.nextLine().split(" ")){
            numbers.add(Integer.parseInt(n));
        }
        boolean canBeat = true;
        Integer beater = 0;
        try{
            for (Integer d: numbers){
                for (Integer num: numbers){

                    if (num%d>0){
                        canBeat=false;
                        break;
                    }else {
                        beater = d;
                        canBeat = true;
                    }
                }
            }
        }catch (Exception ex){}
        System.out.println(beater>0 ? beater : -1);
    }
}
