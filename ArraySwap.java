package gr.aueb.cf.ch10;

/*
* Επιδεικνύει την ανταλλαγή δύο στοιχείων ενός
* πίνακα καλώντας την swap
*
* @author fotisPag
* @see #swap(int[], int, int)
* */
public class ArraySwap {

    public static void main(String[] args) {
        int[]  ages = {18, 40, 22, 25,35, 88};

        swap(ages, 0, ages.length -1);

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    /*Ανταλλάσει αμοιβαία τα στοιχεία του πίνακα array
    * στις θέσεις e1 και e2
    *
    * @param array ο πίνακας με στοιχεία των ακεραίων
    * @param e1 η θέση index του 1ου στοιχείου
    * @param e2 η θέση index του 2ου στοιχείου
    *
    *
    * */


    public static void swap(int[] array, int e1, int e2){
        if ( (array == null) || ((e1 < 0) || (e1 >= array.length)) || ((e2 < 0) || (e2 >= array.length)) ) {
            System.out.println("Ο πίνακας είναι κενός ή οι δείκτες του πίνακα πρς ανταλλαγή" +
                    "δεν είναι μέσα στα όρια του πίνακα.");
            return;
        }
        int tmp = array[e1];
        array[e1] = array[e2];
        array[e2] = tmp;

    }


}