
import java.util.Scanner;

    /*\
    Write a class called PigLatin. There will be two methods...


    String encode(String sentence)
        this method will encode an entire string and turn it into piglatin.

    String decode(String pigLatSentence)
        this method will decode an entire pig latin string and convert it to a normal sentence.

    Note: leave punctuations at the end of the sentence untouched

    Example input encode("Is this in pig latin?")
    Example output: "sIay histay niay igpay atinlay?"

    SAMPLE:
    Hello
        Ellohay
        Please
        Leasepay
        What time is it?
        Hatway imetay ishay ithay?
        How is the weather?
        Owhay ishay hetay eatherway?
        How are you?
        Owhay arehay ouyay?
        What is your name?
        Hatway ishay ouryay amenay?
        Thank you
        Hanktay ouyay
        You are welcome
        Ouyay arehay elcomeway
        Good night
        Oodgay ightnay
        Who is that?
        Howay ishay hattay?
        Where are you going?
        Hereway arehay ouyay oinggay?
        I donâ€™t want to
        Ihay onâ€™tday antway otay
        Do you understand?
        Oday ouyay underway tandsay?
        Where do you come from?
        Hereway oday ouyay omecay romfay?
        Whisper it to me
        Hisperway ithay otay emay
        Can you speak Pig Latin?
        Ancay ouyay peaksay igpay atinlay?
        What are you talking about?
        Hatway arehay ouyay alkingtay aboutway?
        What is the password?
        Hatway ishay hetay asspay ordway?
        What is the answer for...?
        Hatway ishay hetay answerway orfay...?
        Why are you doing that?
        Hyway arehay ouyay oingday hattay?
        Iâ€™m in trouble
        Iâ€™mhay inhay roubletay
        Hide the gift now
        Idehay hetay iftgay ownay
        Wait until she leaves
        Aitway untilway hesay eaveslay
        Bring it tomorrow
        Ringbay ithay omorrowtay
        Follow me
        Ollowfay emay
        Donâ€™t leave
        Onâ€™tday eavelay
        Go now
        Ogay ownay
        I donâ€™t like this
        Iay onâ€™tday ikelay histay
        Why is he here?
        Hyway ishay ehay erehay?
        What is her name?
        Hatway ishay erhay amenay?
        Do you have the homework?
        Oday ouyay avehay hetay omehay orkway?
        He is so cute
        Ehay ishay osay utecay
        Call me
        Allcay emay
        Here is my number
        Erehay ishay ymay umbernay
        Donâ€™t tell them
        Onâ€™tday elltay hemtay
        This is a secret
        Histay ishay ayay ecretsay
        Please remind me
        Leasepay emindray emay
        No way
        Onay ayway
     =======================================
     WIKIPEDIA

     For words that begin with consonant sounds, all letters before the initial vowel are placed at the end of the word sequence. Then, "ay" is added, as in the following examples:[2][3]

    "pig" = "igpay"
    "latin" = "atinlay"
    "banana" = "ananabay"
    "will" = "illway"
    "butler" = "utlerbay"
    "happy" = "appyhay"
    "duck" = "uckday"
    "me" = "emay"
    "bagel" = "agelbay"
    When words begin with consonant clusters (multiple consonants that form one sound), the whole sound is added to the end when speaking or writing.[4]

    "smile" = "ilesmay"
    "string" = "ingstray"
    "stupid" = "upidstay"
    "glove" = "oveglay"
    "trash" = "ashtray"
    "floor"= "oorflay"
    "store"= "orestay"
    For words that begin with vowel sounds, the vowel is left alone, and most commonly 'yay' is added to the end. But in different parts of the world, there are different 'dialects' of sorts. Some people may add 'way' or 'hay' or other endings. Examples are:

    "eat" = "eatyay" or "eatay"
    "omelet" = "omeletyay" or "omeletay"
    "are" = "areyay" or "areay"
    "egg" = "eggyay" or "eggay"
    "explain" = "explainyay"
    "always" = "alwaysyay" or "alwaysay"
    "ends" = "endsyay" or "endsay"
    "honest" = "honestyay"
    "I"= "Iyay"
    An alternative convention for words beginning with vowel sounds, one removes the initial vowel(s) along with the first consonant or consonant cluster.[citation needed] This usually only works for words with more than one syllable and offers a variant of the words in keeping with the mysterious, unrecognizable sounds of the converted words. Examples are:

    "every" = "eryevay"
    "another" = "otheranay"
    "under" = "erunday"
    "island" = "andislay"
    "elegant" = "egantelay"

    write your tests first!
     */
    public class Piglatin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input sentence:" );

            //String output = scanner.nextLine();
            //System.out.println(encode(output));

            System.out.println(encode("What time is it?"));
        }

        public static String encode(String sentence) {
            String encodedOutput = "";
            String tempWord = "";
            //Split the sentence into words
            String[] words = sentence.split(" ");
            for (String word : words) {
                // get the length of each word
                int strLength = word.length();
                for (int i = 0; i< word.length(); i++){
                    if ( String.valueOf(word.charAt(i)) == "a"){

                    }
                }
                // Substring the first character and add to the last character
                String letter1st = String.valueOf(word.charAt(0));
                // Substring the second character and add to the last character
                String letter2nd = String.valueOf(word.charAt(1));
                tempWord = word.substring(1, word.length());
                System.out.println(tempWord);

                String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};

                switch (letter1st) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U": {
                        encodedOutput += tempWord + letter1st + "hay ";
                    }
                    default: {
                        encodedOutput += tempWord + letter1st + "ay ";
                    }
                }
            }
            return encodedOutput;
        }
    }
