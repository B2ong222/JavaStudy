package ex;

public class ExtendsEx1 {
    static void main() {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("Album1", 15000, "Artist1");
        Movie movie = new Movie("Movie1", 18000, "Director1", "Actor1");

        book.print();
        album.print();
        movie.print();
    }
}
