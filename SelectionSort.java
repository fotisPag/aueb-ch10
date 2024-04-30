package gr.aueb.cf.ch10;

public class SelectionSort {

    public static void main(String[] args) {
        int[] marks = {3, 5, 1, 8, 9};

        selectionSort(marks);

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }

    /*
    * Ταξινομεί τον πίνακα array με τη μέθοδο ταξινόμησης SelectionSort
    *
    * @param array ο προς ταξινόμηση πίνακας
    * */
    public static void selectionSort(int[] array) {
        int tmp, minPosition;

        for (int i = 0; i < array.length - 1; i++) {
            minPosition = i;


            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }

            // swap marks[i] <-> marks[minPosition]
            tmp = array[i];
            array[i] = array[minPosition];
            array[minPosition] = tmp;
        }


    }
}