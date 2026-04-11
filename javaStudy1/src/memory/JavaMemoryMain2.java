package memory;

public class JavaMemoryMain2 {
    static void main() {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    static void method1() {
        System.out.println("m1 start");
        Data1 data1 = new Data1(10);
        method2(data1);
        System.out.println("m1 end");
    }
    static void method2(Data1 data1){
        System.out.println("m2 start");
        System.out.println("data value= " + data1.getValue());
        System.out.println("m2 end");
    }
}