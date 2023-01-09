public class Book {
    public String name;
    public String author;
    public int publishingYear;

    public Book(String name, String author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
}
