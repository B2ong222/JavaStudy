package Scanner;

import java.util.Scanner;

public class ScannerEx9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int allM = 0;
        while (true){
            System.out.print("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = sc.nextInt();
            sc.nextLine();
            if (option == 1){
                System.out.print("상품명을 입력하세요: ");
                String pName = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int num = sc.nextInt();

                System.out.println("상품명: "+pName + ", 가격: " +price + ", 합계: " + (price * num));
                allM += price*num;
            } else if (option == 2){
                System.out.println("합계: "+allM);
                allM = 0;
            } else if (option == 3){
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("없는 옵션입니다.");
            }
        }

    }
}
