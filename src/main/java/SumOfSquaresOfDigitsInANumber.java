public class SumOfSquaresOfDigitsInANumber {
    public static void main(String[] args) {

        System.out.println(happy(203));
        System.out.println();
        System.out.println(happy(11));
        System.out.println();
        System.out.println(happy(107));

    }

    public static boolean happy(Integer num){
        boolean happy = true;
        int sum = num;
        while(sum >1) {
            if (sum > num) {
                happy = false;
                break;
            }
            sum = add(sum);
        }
        return happy;
    }

    public static Integer add(Integer num){
        int sum=0;
        for (String n: String.valueOf(num).split("")){
            System.out.println("DIGIT: " + n + " * " + n + " = " + (Integer.parseInt(n) * Integer.parseInt(n)));
            sum+= Integer.parseInt(n) * Integer.parseInt(n);
        }
        System.out.println("  SUM: " + sum);
        return sum;
    }
}
