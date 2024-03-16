public class Book <T> {
    private T title;
    private String author;

    public Book(T title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    public T getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + title +
                ", author: '" + author + '\'' +
                '}';
    }
}
