//Players.java
import java.io.Serializable;

public class Players implements Serializable {
    String nickName;
    double rating;

    public Players() {
        nickName = "";
        rating = -1.0;
    }

    public Players(String nickName, double rating) {
        this.nickName = nickName;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return nickName+" "+rating;
    }
}


