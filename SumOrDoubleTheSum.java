public class SumOrDoubleTheSum {
    public static void main(String[] args) {
        System.out.println(sumOrDoubleTheSum(6, 5));
        System.out.println(sumOrDoubleTheSum(5, 5));
    }

    //Implement a program to display the sum of two given numbers if the numbers are same.
    // If the numbers are not same, display the double of the sum.
    private static int sumOrDoubleTheSum(int num1, int num2) {
        return num1 == num2 ? num1+num2 : (num1+num2)*2;
    }
}
