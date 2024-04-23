package gr.aueb.cf.ch10;

/*
* Ανταλλάσει αμοιβαία το 1ο με το ελάχιστο
* στοιχείο ενός πίνακα με τη χρήση των arrayMin
* και της swap από την κλάση ArraySwap
*
* @author fotisPag
* @see #arrayMin(int[])
* @see ArraySwap #swap(int[], int, int)
* */

public class ArraySwapMin {

    public static void main(String[] args) {

        int[] ages = {50, 44, 33, 25, 18};

        int min = arrayMin(ages);
        System.out.printf("Το ελάχιστο στοιχείο είναι το %d%n", ages[min], min);

        System.out.printf("Ανταλλαγή 1ου στοιχείου του πίνακα με το μικρότερο");
        ArraySwap.swap(ages, 0, arrayMin(ages));
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    /*
    * Θέτουμε αρχικά ως minPosition τη θέση 0.
    * */

    public static int arrayMin(int[] array){

        int minPosition = 0;

        for (int i = 1; i < array.length; i++){
            if( array[i] < array[minPosition] ) {
                minPosition = i;
            }
        }
        return minPosition;
    }
}