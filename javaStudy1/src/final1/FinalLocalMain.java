package final1;

public class FinalLocalMain {
    static void main() {
        final int data1;
        data1 = 10;
        System.out.println(data1);
        final int data2 = 10;
        System.out.println(data2);
        method(10);
    }
    static void method(final int parameter){
        System.out.println(parameter);
    }
}
