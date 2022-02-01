public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }

    //Implement a program to calculate the factorial of a given number.
    public static int factorial(int num){
        int output = 1;
        for (int i=1; i<=num ; i++){
            output *= i;
        }
        return output;
    }
}
