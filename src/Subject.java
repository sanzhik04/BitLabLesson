//Subject.java
import java.io.Serializable;

public class Subject implements Serializable {
    String name;
    int credits;

    public Subject(){
        this.name = "";
        this.credits = -1;
    }

    public Subject(String name, int credits){
        this.name = name;
        this.credits = credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return name+" "+credits;
    }
}
