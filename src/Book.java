//Book.java
import java.io.Serializable;

public class Book implements Serializable {
    int id;
    String name;
    String author;

    public Book(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+author;
    }
}
