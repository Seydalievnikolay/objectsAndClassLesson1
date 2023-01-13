public class Book {
    private String name;
    private Author author;
    private int publishingYear;



    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }


    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return name + author + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {return  true;}
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book two = (Book) other;
        return two.name == this.name &&
                two.author == this.author &&
                 two.publishingYear == this.publishingYear;

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, publishingYear);
    }
}

