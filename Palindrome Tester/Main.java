public class Main {

    public static int charValue;
    public static char charLetter;
    public static int length;
    public static String newstringen;
    public static String newerstringen;


    public static void main(String[] args) {
        System.out.println("A Palindrome is a word, phrase, or sentence that is spelled identically forward or backward. For example, the words\nkayak and madam is you reversed the order of the letters, would spell out the same word.\n");
    validLettersOnly("Palindrome");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Civic");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Radar");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Level");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Eva, can I stab bats in a cave?");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("A man, a plan, a canal, Panama");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Mr. Owl ate my metal worm");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Never odd or even");
        newstringen = "";
        newerstringen ="";
    validLettersOnly("Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.");
        newstringen = "";
        newerstringen ="";



    }

    public static void validLettersOnly(String stringenzie){
        length = stringenzie.length();
        for(int i =0; i<length; i++) {
            charValue = stringenzie.charAt(i);
            charLetter = stringenzie.charAt(i);
            if((charValue>=65)&&(charValue<=90)||(charValue>=97)&&(charValue<=122)){
                newstringen = newstringen + charLetter;
            }
        }
        for(int i =0; i<length; i++){
            charValue = stringenzie.charAt((length-1)-i);
            charLetter = stringenzie.charAt((length-1)-i);
            if((charValue>=65)&&(charValue<=90)||(charValue>=97)&&(charValue<=122)){
                newerstringen = newerstringen + charLetter;
            }
        }

        boolean isItEqual = newstringen.equalsIgnoreCase(newerstringen);
        System.out.println("The word/phrase in question is ''"+stringenzie+"''. After ignoring the punctuation, capitalization, and spaces, the \ntest results in a "+isItEqual+" palindrome word/phrase.\n");


    }

}
