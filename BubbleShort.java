package gr.aueb.cf.ch10;

public class BubbleShort {

    public static void main(String[] args) {
        int[] marks = {3,5,1,8,11,9};

        bubbleSort(marks);

        for (int mark : marks) {
            System.out.print(mark +  " ");
        }


    }


    /*
    * Ταξινομεί τον πίνακα array με τη
    * μέθοδο ταξινόμησης BubbleSort.
    *
    * @param array ο προς ταξινόμηση πίνακας
    *
    * */
    public static void bubbleSort(int[] array) {
        int tmp;

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j <= i -1; j++){
                if (array[j] > array[j+1]) {
                    //swap array[i] <-> array[j + 1]
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

}
