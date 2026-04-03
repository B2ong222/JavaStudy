package Field;

public class Field1 {
    private int m = 3;
    private int n = 4;

    public void work1() {
        int k = 5;
        System.out.println(k);
        work2(3);
    }

    public void work2(int i) {
        int j = 4;
        System.out.println(i + j);
    }
}