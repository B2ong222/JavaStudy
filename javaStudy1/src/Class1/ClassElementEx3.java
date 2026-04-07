package Class1;

public class ClassElementEx3 {
    static void main() {
        Book1 b = new Book1();
        b.displayInfo();
        Book1 b2 = new Book1("Hello Java", "Seo");
        b2.displayInfo();
        Book1 b3 = new Book1("JPA 프로그래밍", "kin", 700);
        b3.displayInfo();
    }
}

class Book1 {
    private String title;
    private  String author;
    private int page;
    public Book1(){
        this("", "", 0);
    }
    public Book1(String title, String author) {
        this(title, author, 0);
    }
    public Book1(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
