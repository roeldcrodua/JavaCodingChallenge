public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(6547));
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        for (String n: String.valueOf(num).split("")){
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}
