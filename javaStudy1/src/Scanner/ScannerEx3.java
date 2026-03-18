package Scanner;

import java.util.Scanner;

public class ScannerEx3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String sc1 = scanner.nextLine();

            if (sc1.equals("exit")){
                break;
            }
            System.out.println(sc1);
        }
    }
}
