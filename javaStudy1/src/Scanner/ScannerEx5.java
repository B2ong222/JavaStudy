package Scanner;

import java.util.Scanner;

public class ScannerEx5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            int sc1 = scanner.nextInt();

            if (sc1 == 0){
                break;
            }

            sum += sc1;
        }
        System.out.println(sum);
    }
}
