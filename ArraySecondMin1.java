package gr.aueb.cf.ch10;

public class ArraySecondMin1 {

    public static void main(String[] args) {

        int[] marks = {14,13};

        int secondPosition = arraySecondMin(marks);

        System.out.printf("Second MinValue = %d & SecondMinPosition = %d",
                marks[secondPosition], secondPosition);


    }

    public static int arraySecondMin(int[] array){
        int minPosition = 0, secondMinPosition = 0;

        if ((array == null) || (array.length <2)){
            System.out.println("Το μέγεθος του πίνακα πρέπει να είναι τουλάχιστον δύο");
            System.exit(1);
        }

        //Στο 1ο for βρίσκουμε το min position
        for (int i = 1; i< array.length; i++){
            if (array[i] < array[minPosition]) {
                minPosition = i;
            }
        }

        /*
        * Αν το min position είναι στη θέση 0,
        * ξεκινάμε την αναζήτηση για το 2nd min
        * από τη θέση 1
        * */

        if (minPosition == 0) secondMinPosition =1;

        for (int i = 0; i < array.length; i++) {
            if (i == minPosition) continue;

            if (array[i] < array[secondMinPosition]){
                secondMinPosition = i;
            }
        }
        return secondMinPosition;

    }

}
