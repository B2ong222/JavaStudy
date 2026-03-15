package cond;

public class LoopEx12 {
    static void main() {
        int count = 0;
        char ch = 'A';
        int n = 0;

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                if (count < 6){
                    System.out.print(ch + " ");
                    ch++;
                } else {
                    System.out.print(n + " ");
                    n++;
                }
                count++;
            }
            System.out.println();
        }
    }
}
