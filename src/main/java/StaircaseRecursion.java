public class StaircaseRecursion {
    public static void main(String[] args) {
        System.out.println("RETURNS: " + waysToClimb(0)); // returns 1
        System.out.println("RETURNS: " + waysToClimb(1)); // returns 1
        System.out.println("RETURNS: " + waysToClimb(2)); // returns 2
        System.out.println("RETURNS: " + waysToClimb(4)); // returns 5
        System.out.println("RETURNS: " + waysToClimb(5)); // returns 8
    }

    public static Integer waysToClimb(Integer number){
        System.out.println();
        System.out.println("INPUT: " + number);
        Integer counter =0;
        StringBuilder len = new StringBuilder();
        int numLength ;
        if (number == 0){
            numLength=1;
        }else {
            numLength=number;
        }
        for (int l=0; l<numLength; l++){
            //set the maximum value as 1111 for 4.
            len.append("1");
        }
        int maxLength = Integer.parseInt(String.valueOf(len));
        for (int i=1; i<=maxLength; i++){
            int sum=0;
            for (String x: String.valueOf(i).split("")){
                if (x.equals("1") || x.equals("2")){
                    sum += Integer.parseInt(x);
                } else {
                    sum=0;
                    break;
                }
            }
            if (sum==numLength){
                System.out.println(i);
                counter++;
            }
        }
        return counter;
    }
}
