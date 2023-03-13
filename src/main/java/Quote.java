public class Quote {
    private int id;
    private String text;
    private Author author;

//Getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


//    Constructors

    public Quote() {
    }

    public Quote(int id, String text, Author author) {
        this.id = id;
        this.text = text;
        this.author = author;
    }


}

