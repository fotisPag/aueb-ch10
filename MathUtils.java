package gr.aueb.cf.ch10;

/*
* Προσφέρει μαθηματικές λειτουργίες πρόσθεσης,
* αφαίρεσης, πολλαπλασιασμού και διαίρεσης
*
* @author fotsPag
*
*
*
* */
public class MathUtils {

    public static void main(String[] args) {

    }
    public static int add2(int... numbers){
        int result = 0;
        for (int num : numbers){
            result += num;
        }
        return result;
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        if (b!=0) {
            return a/b;
        } else {
            System.out.println("Λάθος διαίρεση από το μηδέν");
            return 0;
        }
    }

    public static int mul(int a, int b) {
        return a * b;
    }


}
