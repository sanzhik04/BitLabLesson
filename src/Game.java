//Game.java
import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    String gameName;
    String ipAddress;
    int port;
    ArrayList<Players> players = new ArrayList();

    public Game(){
        this.gameName = "";
        this.ipAddress = "";
        this.port = -1;
    }

    public Game(String gameName,String ipAddress,int port){
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getGameName() {
        return gameName;
    }

    public int getPort() {
        return port;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return gameName+" "+ipAddress+" "+port;
    }

    public void addPlayer(Players player){
        players.add(player);
    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

}
