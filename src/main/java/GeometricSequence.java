public class GeometricSequence {
    public static void main(String[] args) {
        sequence(5);
        System.out.println();
        sequence(8);
    }

    // Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
    //
    //1, 2, 4, 8, 16, 32, 64, ......, 1024
    private static void sequence(int num) {
        String output = "1, ";
        int total =1;
        int i =0;
        while (i < num){
            total = (int) Math.pow(2, i);
            System.out.print(total);
            System.out.print(i==num-1 ? "" : ", ");
            i++;
        }
    }
}
