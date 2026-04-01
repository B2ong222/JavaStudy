package Class1;

class MovieReview2 {
    String title;
    String review;
}
public class ClassEx2 {
    static void main() {
        MovieReview2[] movie = new MovieReview2[]{
                new MovieReview2(),
                new MovieReview2()
        };
        movie[0].title = "인셉션";
        movie[0].review = "인생은 무한 루프";

        movie[1].title = "어바웃 타임";
        movie[1].review = "인생 시간 영화!";

        for (MovieReview2 m : movie){
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
    }
}

