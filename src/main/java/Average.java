public class Average {
    public static void main(String[] args) {
        System.out.println(averageNum(12, 8, 15));
        System.out.println(averageNum(10, 20, 30));
    }

    private static String averageNum(int ... num){
        int sum = 0;
        for (int n: num){
            sum += n;
        }
        return String.format("%.2f", (double) sum/num.length);
    }
}
