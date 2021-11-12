//Client.java
import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("localhost",1999);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true){
                MessageData request  = new MessageData();
                System.out.println("PRESS 1 TO LIST BOOKS");
                System.out.println("PRESS 2 TO ADD BOOKS");
                System.out.println("PRESS 0 TO DISCONNECT FROM SERVER");
                int choice = in.nextInt();
                if(choice==1){
                    request.setOperationType("list_books");
                    outputStream.writeObject(request);
                    MessageData response = null;
                    if((response = (MessageData) inputStream.readObject())!=null){
                        if(response.getBooks() != null) {
                            for (int i=0;i<response.getBooks().size();i++) {
                                System.out.println(response.getBooks().get(i));
                            }
                        }else if(response.getOperationType().equals("None")){
                            System.out.println("Wrong input!");
                        }
                    }

                }
                else if(choice==2){
                    System.out.println("Insert id");
                    int id = in.nextInt();
                    System.out.println("Insert name");
                    String name = in.next();
                    System.out.println("Insert author");
                    String author = in.next();
                    request.setOperationType("add_book");
                    request.setBook(new Book(id,name,author));
                    outputStream.writeObject(request);
                }
                else if(choice==0){
                    System.exit(0);
                }
                else{
                    System.out.println("WRONG COMMAND");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }






}
