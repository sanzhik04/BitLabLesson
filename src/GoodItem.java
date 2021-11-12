//GoodItem.java
public class GoodItem {
    String name;
    int price;

    public GoodItem(){
        this.name = "";
        this.price = -1;
    }

    public GoodItem(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return name+" "+price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
