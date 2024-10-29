package LLDDesign.Kindle;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private BookFormat format;

    public Book(String bookId, String title, String author, BookFormat format) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.format = format;
    }

    public String getBookId() {
        return bookId;
    }

    public void openBook() {
        format.render();
    }

    public void bookmarkPage(int page) {
        // Logic to bookmark a page
        System.out.println("Bookmarked page " + page);
    }
}
