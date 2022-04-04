class Palindrome{
    public static boolean checkPalindrome(String str){
        //Implement your code here and change the return value accordingly

        boolean isPalindrome = true;

        for (int i=str.length()/2; i>0; i--){
            if (str.length()%2==0){
                System.out.println(str.charAt(i-1) + " " + str.charAt(str.length()-i));
                if (str.charAt(i-1) != str.charAt(str.length()-i)) {
                    isPalindrome = false;
                    break;
                }
            } else {
                System.out.println(str.charAt(i-1) + " " + str.charAt(str.length()-i));
                if (str.charAt(i-1) != str.charAt(str.length()-i)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

    public static void main(String args[]){
        String str = "123456654321";
        if(checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}