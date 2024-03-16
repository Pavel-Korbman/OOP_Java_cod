
public class LibraryCard <K, V> extends Book{
    private K iD;
    private V bookInfo;

    private Book book;

    /**
     *
     * @param iD - Номер карты
     * @param bookInfo - Выдана ли книга читателю
     * @param book - Книга
     */
    public LibraryCard(K iD, V bookInfo, Book book) {
        super();
        this.iD = iD;
        this.bookInfo = bookInfo;
        this.book = book;
    }

    public K getiD() {
        return iD;
    }

    public V getBookInfo() {
        return bookInfo;
    }

    public Book getBook() {
        return book;
    }

    public void setBookInfo(V bookInfo) {
        this.bookInfo = bookInfo;
    }



    @Override
    public String toString() {
        return "Card" + "_iD:" + iD +
                "{книга: " + book.getTitle() +", "
                +"автор: " + book.getAuthor()+", " +
                ", выдана: " + bookInfo +
                '}';
    }
}
