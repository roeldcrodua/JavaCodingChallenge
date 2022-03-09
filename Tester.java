class Demo {

    public static void main(String[] args) {
        int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
        for (int index1 = 0; index1 < 3; index1++) {
            for (int index2 = 0; index2 < 3; index2++) {
                if (index1 == 6)
                    break;
                System.out.println(arr[index2][index1] + arr[0][0]);
            }
        }
    }
}