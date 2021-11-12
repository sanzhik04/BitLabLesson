//ClientHandler.java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id){
        this.id = id;
        this.socket = socket;
    }

    public void run(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData response  = null;
            while ((response = (MessageData) inputStream.readObject()) != null) {
                if(response.getOperationType().equals("list_books")){
                    response.setBooks(readBooks());
                    outputStream.writeObject(response);
                }
                else if(response.getOperationType().equals("add_book")){
                    ArrayList<Book> books = readBooks();
                    books.add(response.getBook());
                    saveBooks(books);
                }
                else{
                    response.setOperationType("No");
                    outputStream.writeObject(response);
                }
            }
        }
        catch(Exception e){

        }

    }

    public ArrayList<Book> readBooks() {
        ArrayList<Book> books = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/files/books.data"));
            books = (ArrayList<Book>) inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {

        }
        return books;
    }

    public static void saveBooks(ArrayList<Book> books) {
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("src/files/books.data"));
            outStream.writeObject(books);
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
