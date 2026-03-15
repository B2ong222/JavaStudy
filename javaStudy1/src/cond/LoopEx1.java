package cond;

public class LoopEx1 {
     static void main() {
        int n = 1;
        int sum1 = 0;
        System.out.println("while 문");
        while (n <= 3){
            sum1 = sum1 + n;
            System.out.println("i=" + n + " sum=" + sum1);
            n++;
        }
        int sum2 = 0;
        System.out.println("for 문");
        for (int i = 1; i <= 3; i++){
            sum2 = sum2 + i;
            System.out.println("i=" + i + " sum=" + sum2);
        }

    }
}
