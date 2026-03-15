package cond;

public class LoopEx13 {
    static void main() {
        for (int i = 1; i <= 5; i++){
            int n = (i <= 3) ? i : 6 - i;
            for (int j = 1; j <= n; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
