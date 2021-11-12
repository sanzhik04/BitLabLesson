public class User {
    int id;
    String login;
    String password;

    public User(){
        this.id = -1;
        this.login = "";
        this.password = "";
    }

    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public String toString(){
        return id+" "+login+" "+password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
