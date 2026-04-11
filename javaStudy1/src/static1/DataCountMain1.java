package static1;

public class DataCountMain1 {
    static void main() {
        Data1 data1 = new Data1("A");
        System.out.println("A c= " + data1.count);
        Data1 data2 = new Data1("B");
        System.out.println("B c= " + data2.count);
        Data1 data3 = new Data1("B");
        System.out.println("C c= " + data3.count);
    }
}
