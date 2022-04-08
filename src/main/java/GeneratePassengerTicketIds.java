    /*

Given a list of strings, each string containing the ticket information of passengers, write a program to print the ticket ID of all the passengers.

        Input Format:

        Ticket information of all the passengers are given in a single line, comma-separated. Ticket information of a passenger will be in the below format:

        <source>:<destination>:<mobile number>

        Read the input from the standard input.

        Output format:

        Print the comma-separated ticket IDs of all the passenger to the standard output. Ticket ID follows the below format:

        <first two characters of source><last two characters of destination><sum of the numbers present in even indices (including 0) of the mobile number><sequence number of the passenger in the input list starting with 1>

        Sample Input	Sample Output	Explanation
        Paris:Delhi:9945672345,Berlin:Brussels:9456723456	Pahi251,Bels292

        */
import java.util.Scanner;

public class GeneratePassengerTicketIds {
    public static String getTicketIDs(String inputString) {
        StringBuilder output = new StringBuilder();

        int counter =1;
        for (String s: inputString.split(",")){
            StringBuilder source = new StringBuilder();
            StringBuilder destination = new StringBuilder();
            StringBuilder numbers = new StringBuilder();

            int a =0;
            for (String d: s.split(":")){
                if (a==0){
                    //System.out.println("SOURCE: " + d);
                    source.append(d.substring(0,2));
                }
                if (a==1){
                    //System.out.println("DEST: " + d);
                    destination.append(d.substring(d.length()-2));
                }
                if (a==2){
                    int sum=0;
                    //System.out.println("MOBILE: " + d);
                    int i =0;
                    for (String n: d.split("")){
                        if (i==0 || i%2==0){
                            sum += Integer.parseInt(n);
                        }
                        i++;
                    }
                    numbers.append(sum + "" + counter);
                }
                a++;
            }
            if (counter>1){
                output.append(",");
            }
            output.append(source);
            output.append(destination);
            output.append(numbers);
            counter++;
        }
        return output.toString();
    }

    public static void main(String a[]) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        System.out.println(getTicketIDs(inputString));

    }
}