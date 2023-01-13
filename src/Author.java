public class Author {
    public String nameAuthor;
    public String surName;

    public Author (String nameAuthor, String surName) {
        this.nameAuthor = nameAuthor;
        this.surName = surName;
    }

    public String getNameAuthor() {
        return  this.nameAuthor;
    }

    public String getSurName() {
        return  this.surName;
    }

    @Override
    public String toString() {
        return nameAuthor + surName;
    }
    @Override
    public boolean equals(Object other) {
        if(this == other) {return true;}
        if (other == null || this.getClass() != other.getClass()) {
            return  false;
        }
        Author author = (Author) other;
        return nameAuthor.equals(author.nameAuthor) &&
                surName.equals(author.surName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor, surName);
    }
}
