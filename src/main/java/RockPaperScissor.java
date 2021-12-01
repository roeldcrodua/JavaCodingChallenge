public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println(rps("scissor", "rock"));
        System.out.println(rps("rock", "paper"));
    }
    public static String rps(String input1, String input2){
        if (input1.equals("paper")){
            if (input2.equals("scissor")){
                return "Player 2 wins";
            } else if (input2.equals("rock")){
                return "Player 1 wins";
            } else {
                return "TIE";
            }
        } else if (input1.equals("scissor")){
            if (input2.equals("rock")){
                return "Player 2 wins";
            } else if (input2.equals("paper")){
                return "Player 1 wins";
            } else {
                return "TIE";
            }
        } else if (input1.equals("rock")){
            if (input2.equals("paper")){
                return "Player 2 wins";
            } else if (input2.equals("scissor")){
                return "Player 1 wins";
            } else {
                return "TIE";
            }
        } else {
            return "Invalid input";
        }
    }
}
