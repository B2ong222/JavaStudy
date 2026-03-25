package Method;

public class Method2 {
    static void main() {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: "+sum1);
        int sum2 = add(15, 210);
        System.out.println("결과1 출력: "+sum2);
    }

    public static int add(int a, int b){
        System.out.println(a+"+"+b+ " 연산");
        return a + b;
    }
}
