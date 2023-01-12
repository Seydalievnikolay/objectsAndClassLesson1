public class Main {
    public static void main() {
        Author author = new Author("Isaac", "Asimov");
        Author secondAuthor = new Author("Fyodor", "Dostoevsky");
        Book one = new Book("Shantaram", author, 1997);
        System.out.println("one.name = " + one.getName() + " " + one.getAuthor() + " " + one.getPublishingYear() );
        Book two = new Book("Idiot", secondAuthor, 1866);
        System.out.println("two.name = " + two.getName() + " " + two.getAuthor() + " " + two.getPublishingYear());
        two.setPublishingYear(1867);
        System.out.println("two.getPublishingYear() = " + two.getPublishingYear());
        Author Asimov = new Author ("Isaac", "Asimov");
        System.out.println("Asimov.name = " + Asimov.nameAuthor + " " + Asimov.surName);
        Author Theodore = new Author("Teodore", "Dreiser");
        System.out.println("Theodore.name = " + Theodore.nameAuthor + " " + Theodore.surName);

    }
}