import java.util.*;

    /*
        Given a sentence S and a non-zero encoding key N, write a program to print the encoded string using Caesar Cipher. This technique involves the following conditions:

        Consider alphabet in cyclic order A, B, C....X,Y,Z,A,B.... where ever applicable
        Replace each character of S by a character at Nth position to the right, for N > 0
        Replace each character of S by a character at Nth position to the left, for N < 0
        Retain all the non alphabets of S
        Input Format:

        First line of the input contains the sentence S and the second line contains the encoding key N. Read the input from standard input stream

        Output Format:

        Print the encoded sentence to the standard output stream

        Sample Input	    Sample Output	Explanation
        Attack at dawn!
        5	                Fyyfhp fy ifbs!
        Attack at dawn!
        -5	                Voovxf vo yvri!
     */

public class CipherTextWithKeyN {

    public static void main (String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int count = s.nextInt();
        getCipherTextValue(inputString, count);
    }

    public static void getCipherTextValue(String inputString, Integer count){
        List<String> ascii = new ArrayList<>();
        for (char c: inputString.toCharArray()){
            int asciiValue = c;
            //System.out.print("ASCII: " + asciiValue + "\t\t");
            if ((asciiValue >=65 && asciiValue <=90) || (asciiValue >=97 && asciiValue <=122)){
                int newAscii = asciiValue + count;
                //System.out.println("NEWASCCI: " + newAscii);
                int diff =0;
                if (newAscii > 122) {
                    diff = newAscii - 122;
                    if (asciiValue >=65 && asciiValue <=90){
                        newAscii = 64 + diff;
                    }
                    if (asciiValue >=97 && asciiValue <=122) {
                        newAscii = 96 + diff;
                    }
                }
                if (newAscii < 65 || (newAscii < 97 && newAscii > 90)){
                    if (newAscii < 65){
                        diff = 65 - newAscii;
                    }
                    if (newAscii < 97 && newAscii > 90){
                        diff = 97 - newAscii;
                    }
                    //System.out.println("DIFF: " + diff + " = " + " 65" + " - " + newAscii );
                    if (asciiValue >=65 && asciiValue <=90){
                        newAscii = 91 - diff;
                        //System.out.println("COUNT-DIFF: " + Math.abs(count-diff));
                    }
                    if (asciiValue >=97 && asciiValue <=122) {
                        newAscii = 123 - diff;
                    }
                    //System.out.println("NEWASCCI_AFTER: " + newAscii);
                }

                ascii.add(String.valueOf(newAscii));
            } else {
                ascii.add(String.valueOf(asciiValue));
            }

        }
        //System.out.println(ascii);
        char c;
        StringBuilder sb = new StringBuilder();
        for (String i: ascii){
            try{
                c = (char)Integer.parseInt(i);
                if (i.equals("32")){
                    sb.append(" ");
                }else {
                    sb.append(c);
                }
            } catch (Exception ex) {
            }
        }
        System.out.println(sb.toString());
    }
}
