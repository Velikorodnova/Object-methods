import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publicationYear;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Книга: " + this.bookName + " Автор: " + this.author + " Год публикации: " + this.publicationYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(bookName, author, publicationYear);
    }
}
