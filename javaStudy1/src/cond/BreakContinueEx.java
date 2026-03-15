package cond;

public class BreakContinueEx {
    static void main() {
        for (int i = 0; ; i++){
            if (i%2==1){
                continue;
            }
            if (i > 10){
                break;
            }
            System.out.println(i);
        }
    }
}
