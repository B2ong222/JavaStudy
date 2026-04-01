package Class1;

class MovieReview3 {
    private String title;
    private String review;

    public MovieReview3(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void showMovieReview() {
        System.out.println("영화 제목: " + title + ", 리뷰: " + review);
    }
}

public class ClassEx3 {
    static void main(String[] args) {
        MovieReview3[] movies = new MovieReview3[] {
                new MovieReview3("인셉션", "인생은 무한 루프"),
                new MovieReview3("어바웃 타임", "인생 시간 영화!")
        };

        for (MovieReview3 m : movies) {
            m.showMovieReview();
        }
    }
}