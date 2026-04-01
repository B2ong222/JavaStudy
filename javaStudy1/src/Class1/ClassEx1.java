package Class1;

class MovieReview1 {
    String title;
    String review;
}
public class ClassEx1 {
    static void main() {
        MovieReview1 inception = new MovieReview1();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview1 aboutTime = new MovieReview1();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
    }
}

