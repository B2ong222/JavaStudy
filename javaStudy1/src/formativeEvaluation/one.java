package formativeEvaluation;

import java.util.Scanner;

public class one {
    static void main() {
        System.out.println("1. 삽입");
        System.out.println("2. 삭제");
        System.out.println("3. 수정");
        System.out.print("숫자를 선택하세요.");
        int input = new Scanner(System.in).nextInt();

        if (input == 1){
            System.out.println("삽입 선택");
        } else if (input == 2){
            System.out.println("삭제 선택");
        } else if (input == 3) {
            System.out.println("수정 선택");
        }
    }
}
