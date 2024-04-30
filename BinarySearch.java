package gr.aueb.cf.ch10;

public class BinarySearch {

    public static void main(String[] args) {
        int[] ages = {3, 18, 40,  50, 64, 74};
        int n = binarySearch(ages, 50, 0, ages.length -1);
        if (n != -1) {
            System.out.printf("Η ηλικία %d βρίσκεται στη θέση %d", ages[n], n);
        } else {
            System.out.println("Η ηλικία δεν βρέθηκε στον πίνακα");
        }
    }

    /*
    * Βρίσκει το ελάχιστον στοιχείο ενός πίνακα με
    * δυαδική αναζήτηση.
    * @param array ο προς έλεγχο πίνακας.
    * @param value η τιμή αναζήτησης
    * @param low ο μικρότερος δείκτης του πίνακα
    * @param high ο μεγαλύτερος δείκτης του πίνακα
    * @return τη θέση του μικρότερου στοιχείου ή -1 αν βρεθεί
    *
    * */


    public static int binarySearch(int[] array, int value, int low, int high){
        if (high < low) return -1; // not found

        int median = (low+ high);

        if (value == array[median]) return median; //found

        if (value < array[median]) {
            return binarySearch(array, value, low, median - 1);
        } else {
            return binarySearch(array, value, median + 1, high);
        }

    }

}