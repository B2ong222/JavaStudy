package Array;

import java.util.Scanner;

public class ArrayEx10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] listName = new String[10];
        int[] listPrice = new int[10];
        int count = 0;
        while (true){
            System.out.println("1. 상품🛍️입력 | 2. 목록💰| 3. 종료");
            System.out.print("메뉴를 선택해~~:");
            int option = sc.nextInt();

            if (option == 1){
                if (count <= 10){
                    System.out.print("상품 이름.");
                    String pName = sc.next();

                    System.out.print("상품 가격.");
                    int pPrice = sc.nextInt();

                    listName[count] = pName;
                    listPrice[count] = pPrice;
                    count++;
                }


            } else if (option == 2){
                for (int i = 0; i < count; i++){
                    System.out.println(listName[i] + ": " + listPrice[i]);
                }
            } else if (option == 3){
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("없는 옵션입니다.");
            }
        }
    }
}
