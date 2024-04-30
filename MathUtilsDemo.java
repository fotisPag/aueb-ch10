package gr.aueb.cf.ch10;

public class MathUtilsDemo {

    public static void main(String[] args) {
       int a = 12;
       int b = 4;

       int add = MathUtils.add(a, b);
       int add2 = MathUtils.add2(a, b,5,6,7,9);
       int sub = MathUtils.sub(a, b);
       int div = MathUtils.div(a, b);
       int mul = MathUtils.mul(a, b);

       System.out.printf("add: %d, add2:%d, sub: %d, div: %d, mul:%d", add, add2, sub, div, mul);
    }

}
