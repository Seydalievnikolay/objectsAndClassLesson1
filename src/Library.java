public class Library {

    public static void main (String[] args){

        Author IsaacAsimov = new Author("Isaac", "Asimov");
        System.out.println(IsaacAsimov.getNameAuthor() + " " + IsaacAsimov.getSurName());
        Author TeodorDreiser = new Author("Teodor", "Dreiser");
        System.out.println(TeodorDreiser.getNameAuthor() + " " + TeodorDreiser.getSurName());
        Book one = new Book("Shantaram","Gregory David Roberts", 1997);
        System.out.println("one.name = " + one.getName() + " " + one.getAuthor() + " " + one.getPublishingYear() );
        Book two = new Book("Idiot", "Fyodor Mikhailovich Dostoevsky", 1866);
        System.out.println("two.name = " + two.getName() + " " + two.getAuthor() + " " + two.getPublishingYear());
        two.setPublishingYear(1867);
        System.out.println("two.getPublishingYear() = " + two.getPublishingYear());
    }
}
