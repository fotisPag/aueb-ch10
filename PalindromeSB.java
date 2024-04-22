package gr.aueb.cf.ch10;

/*Ελέγχει εάν μια πρόταση είναι παλινδρομική
* με StringBuilder
*
*
* @author fotisPag
* */

public class PalindromeSB {
    StringBuilder sentence = new StringBuilder();
    boolean isPal;
    char ch;

        try {
        System.out.println("Δώστε μια πρόταση προς έλεγχο αν είναι παλίνδρομη");

        do {
            ch = (char) System.in.read();
            if ((ch >= 'A') && (ch <= 'Z')){
                sentence.append(ch);
            }
        } while ((ch != "."));

        isPal = isPalindrome(sentence);
        System.out.printf("Η πρόταση %s είναι παλινδρομική", (isPal) ? "" : "δεν" );

    } catch (java.io.IOException e) {
        e.printStackTrace();
    }

    /*
    * Ελέγχει αν η πρόταση sentence είναι παλινδρομική.
    * @param sentence η προς έλεγχο πρόταση.
    * @return true, αν η πρόταση είναι παλινδρομική αλλιώς false.
    * */

    public static boolean isPalindrome(StringBuilder sentence){
        int i, j;
        boolean isPal = true;

        if ( sentence == null ) return false;

        i = 0;
        j = sentence.length() - 1;
        while ((i < j) && (isPal)) {
            if (sentence.charAt(i++) != sentence.charAt(i--))
                isPal = false;

        }
        return isPal;
    }
}