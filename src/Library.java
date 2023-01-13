public class Library {

    public static void main (String[] args){
        Author author = new Author("Gregory", "Roberts");
        Author secondAuthor = new Author("Fyodor", "Dostoevsky");
        Author IsaacAsimov = new Author("Isaac", "Asimov");
        System.out.println(IsaacAsimov.getNameAuthor() + " " + IsaacAsimov.getSurName());
        Author TeodorDreiser = new Author("Teodor", "Dreiser");
        System.out.println(TeodorDreiser.getNameAuthor() + " " + TeodorDreiser.getSurName());
        Book one = new Book("Shantaram",author , 1997);
        System.out.println("Первая книга = " + one.getName() + " " + author.getNameAuthor() + " " + author.getSurName() + " " + one.getPublishingYear() );
        Book two = new Book("Idiot", secondAuthor, 1866);
        System.out.println("Вторая книга = " + two.getName() + " " + secondAuthor.getNameAuthor() + " " + secondAuthor.getSurName() + " " + two.getPublishingYear());
        two.setPublishingYear(1867);
        System.out.println("Вторая книга = " + two.getName() + " " + secondAuthor.getNameAuthor() + " " + secondAuthor.getSurName() + " " + two.getPublishingYear());
        Book three = new Book("Idiot", secondAuthor, 1866);
        System.out.println("Вторая книга = " + three.getName() + " " + secondAuthor.getNameAuthor() + " " + secondAuthor.getSurName() + " " + three.getPublishingYear());
    }
}
