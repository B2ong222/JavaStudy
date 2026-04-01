import Class1.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("책 제목을 입력하세요: ");
        String title = sc.nextLine();

        System.out.print("저자를 입력하세요: ");
        String author = sc.nextLine();

        System.out.print("가격을 입력하세요: ");
        int price = sc.nextInt();

        // 입력받은 값으로 객체 생성
        Book b = new Book(title, author, price);
        b.info();
    }
}