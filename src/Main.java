//Main.java
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("PRESS 1 TO CREATE GAME");
            System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println("PRESS 3 TO PLAY GAME");
            System.out.println("PRESS 0 TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("GAME NAME");
                String gameName = in.next();
                System.out.println("IP ADDRESS");
                String ipAddress = in.next();
                System.out.println("PORT");
                int port = in.nextInt();
                Game game = new Game(gameName,ipAddress,port);
                ArrayList<Game> games = loadGame();
                games.add(game);
                saveGame(games);
            }
            else if(choice==2){
                ArrayList<Game> games = loadGame();
                System.out.println("NickName");
                String nickName = in.next();
                System.out.println("Rating");
                double rating = in.nextDouble();
                System.out.println("Game Name");
                String GameName = in.next();
                for(int i=0;i<games.size();i++){
                    if(games.get(i).getGameName().equals(GameName)){
                        games.get(i).addPlayer(new Players(nickName,rating));
                    }
                }
                saveGame(games);
            }
            else if(choice==3){
                ArrayList<Game> games = loadGame();
                System.out.println("Which Game");
                String GameName = in.next();

                for(int i=0;i<games.size();i++){
                    if(games.get(i).getGameName().equals(GameName)){
                        System.out.println(games.get(i));
                        for(int j=0;j<games.get(i).getPlayers().size();j++){
                            System.out.println(games.get(i).getPlayers().get(j));
                        }
                    }

                }

            }
            else if(choice==0){
                break;
            }
            else{
                System.out.println("WRONG COMMAND");
            }
        }


    }

    public static void saveGame(ArrayList<Game> games){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("src/files/settings.data"));
            outStream.writeObject(games);
            outStream.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Game> loadGame(){
        ArrayList<Game> games= new ArrayList<Game>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/files/settings.data"));
            games = (ArrayList<Game>) inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return games;
    }
}