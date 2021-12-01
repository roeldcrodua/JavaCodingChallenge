import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        String queenPosition = String.valueOf(r_q) + String.valueOf(c_q);

        System.out.println("Queen Position: " + queenPosition);
        System.out.println();
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= n; col++) {
                System.out.print("[" + row + col + "]");
            }
            System.out.println();
        }
        System.out.println();

        List<String> obst = new ArrayList<>();
        for (List<Integer> l : obstacles) {
            obst.add(String.valueOf(l.get(0)) + String.valueOf(l.get(1)));
        }

        System.out.println("List of obstacle index: " + obst);
        System.out.println();

        // Displaying the table with obstacles
        List<Integer> vacantCells = new ArrayList<>();
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= n; col++) {
                if (r_q == row && c_q == col) {
                    System.out.print("[**]");
                } else if (obst.contains(String.valueOf(row) + String.valueOf(col))) {
                    System.out.print("[  ]");
                    vacantCells.add(Integer.parseInt(String.valueOf(row) + String.valueOf(col)));
                } else {
                    System.out.print("[" + row + col + "]");
                    vacantCells.add(Integer.parseInt(String.valueOf(row) + String.valueOf(col)));
                }
            }
            System.out.println();
        }
        System.out.println();

        return counter(n, queenPosition, vacantCells, obst);
    }

    public static int counter(Integer n, String queenPosition, List<Integer> vacantCells, List<String> obst){

        //Counting the possible moves
        int count =0;
        int rowsL = 1;
        int rowsR = 1;
        int columnU =10;
        int columnD =10;
        int diagonalX1 =11;
        int diagonalY1 =11;
        int diagonalX2 =9;
        int diagonalY2 =9;
        boolean rowX = false;
        boolean rowY = false;
        boolean colX = false;
        boolean colY = false;
        boolean diagX1 = false;
        boolean diagY1 = false;
        boolean diagX2 = false;
        boolean diagY2 = false;
        int currentPosition = Integer.parseInt(queenPosition);

        //filter out only the cells belongs to rows, columns and diagonal line where queen position intersect
        int n1 =n;
        while (n1>0) {
            // rows + 1
            if (vacantCells.contains(currentPosition + rowsL)) {
                if (obst.contains(String.valueOf(currentPosition + rowsL))) {
                    rowX = true;
                }
                if (!rowX) {
                    System.out.println("COUNTED1: " + (currentPosition + rowsL));
                    count++;
                }
            }
            rowsL++;
            n1--;
        }
        int n2 =n;
        while (n2>0) {
            // rows -1
            if (vacantCells.contains(currentPosition - rowsR)) {
                if (obst.contains(String.valueOf(currentPosition - rowsR))) {
                    rowY = true;
                }
                if (!rowY) {
                    System.out.println("COUNTED2: " + (currentPosition - rowsR));
                    count++;
                }
            }
            rowsR++;
            n2--;
        }
        int n3 =n;
        while (n3>0) {
            // column + 10
            if (vacantCells.contains(currentPosition + columnU)) {
                if (obst.contains(String.valueOf(currentPosition + columnU))) {
                    colX = true;
                }
                if (!colX) {
                    System.out.println("COUNTED3: " + (currentPosition + columnU));
                    count++;
                }
            }
            columnU+=10;
            n3--;
        }
        int n4 =n;
        while (n4>0) {
            // column - 10
            if (vacantCells.contains(currentPosition - columnD)) {
                if (obst.contains(String.valueOf(currentPosition - columnD))) {
                    colY = true;
                }
                if (!colY) {
                    System.out.println("COUNTED4: " + (currentPosition - columnD));
                    count++;
                }
            }
            columnD+=10;
            n4--;
        }
        int n5 =n;
        while (n5>0) {
            // diagonal + 10
            if (vacantCells.contains(currentPosition + diagonalX1)) {
                if (obst.contains(String.valueOf(currentPosition + diagonalX1))) {
                    diagX1 = true;
                }
                if (!diagX1) {
                    System.out.println("COUNTED5: " + (currentPosition + diagonalX1));
                    count++;
                }
            }
            diagonalX1+=11;
            n5--;
        }
        int n6 =n;
        while (n6>0){
            // diagonal - 10
            if  (vacantCells.contains(currentPosition - diagonalY1)){
                if (obst.contains(String.valueOf(currentPosition - diagonalY1))) {
                    diagY1= true;
                }
                if (!diagY1){
                    System.out.println("COUNTED6: " + (currentPosition - diagonalY1));
                    count++;
                }
            }
            diagonalY1+=11;
            n6--;
        }

        int n7 =n;
        while (n7>0) {
            // diagonal + 10
            if (vacantCells.contains(currentPosition + diagonalX2)) {
                if (obst.contains(String.valueOf(currentPosition + diagonalX2))) {
                    diagX2 = true;
                }
                if (!diagX2) {
                    System.out.println("COUNTED5: " + (currentPosition + diagonalX2));
                    count++;
                }
            }
            diagonalX2+=9;
            n7--;
        }
        int n8 =n;
        while (n8>0){
            // diagonal - 10
            if  (vacantCells.contains(currentPosition - diagonalY2)){
                if (obst.contains(String.valueOf(currentPosition - diagonalY2))) {
                    diagY2= true;
                }
                if (!diagY2){
                    System.out.println("COUNTED6: " + (currentPosition - diagonalY2));
                    count++;
                }
            }
            diagonalY2+=9;
            n8--;
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String input = "20 3\n" +
                "15 12\n" +
                "5 5\n" +
                "14 11\n" +
                "15 15";
        Scanner bufferedReader = new Scanner(input);
        String[] firstMultipleInput = bufferedReader.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.nextLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                        Stream.of(bufferedReader.nextLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println(result);
    }
}
