package gr.aueb.cf.ch10;

/*
* Ελέγχει αν μια πρόταση είναι παλινδρομική
*
* @author A.Androutsos
* */


public class Palindrome {

    public static void main(String[] args) {
        final int LEN = 100;
        int high = 0;
        char[] sentence = new char[LEN];
        char ch;
        boolean isPal;

        try {
            System.out.println("Δώστε μια πρόταση προς έλεγχος αν είναι παλίνδρομη");

            do {
                ch = (char) System.in.read();
                if ((ch >= 'A') && (ch <= 'Z')) {
                    sentence[high++] = ch;
                }
            } while ((ch != '.') && (high < LEN));

            isPal = isPalindrome(sentence, 0, high - 1);
            System.out.printf("Η πρόταση%s είναι παλίνδρομη", (isPal) ? "" : "δεν");

        }catch (java.io.IOException e){
            System.out.println("Σφάλμα I/O");
        }
    }


    /*
     * Ελέγχει αν μια πρόταση είναι παλινδρομική.
     *
     * @param sentence η προς έλεγχο πρόταση σε μορφή char[]
     * @param low το index του πίνακα του 1ου γράμματος (συνήθως το 0).
     * @param hight το index του πίνακα του τελευταίου γράμματος.
     * @return true, αν η πρόταση είναι παλινδρομική, αλλιώς false.
     *
     * */

    public static boolean isPalindrome(char[] sentence, int low, int high){
        int i = low, j = high;
        boolean isPal = true;

        if (sentence == null) {
            return false;
        }

        while ((i < j) && (isPal)) {
//            if (sentence[i++] != sentence[j--])
//                isPal = false;

                isPal = (sentence[i++] != sentence[j--]);
        }
        return isPal;
    }

}