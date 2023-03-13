public class Author {
    private int id;
    private String name;

//    Constructors
    public Author() {
    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;

    }
//Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
