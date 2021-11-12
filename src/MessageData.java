//MessageData.java
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MessageData implements Serializable {
   String operationType;
   ArrayList<Book> books;
   Book book;

    public MessageData(){
        this.operationType = "No";

    }

    public MessageData(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}
