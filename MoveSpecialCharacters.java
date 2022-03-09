public class MoveSpecialCharacters {
        public static String moveSpecialCharacters(String str){
            //Implement your code here and change the return value accordingly
            String word = "";
            String symbol = "";
            for (String s: str.split("")){
                if (s.matches("[a-zA-Z0-9]")){
                    word += s;
                } else {
                    symbol += s;
                }
            }
            return word + symbol;
        }

        public static void main(String args[]){
            String str = "He@#$llo!*&";
            System.out.println(moveSpecialCharacters(str));
        }

}
