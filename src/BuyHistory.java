//BuyHistory.java
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class BuyHistory {
    String goodName;
    int goodPrice;
    Date buyTime;

    public BuyHistory(){
        this.goodName = "";
        this.goodPrice = -1;
        this.buyTime = new Date();
    }

    public BuyHistory(String goodName,int goodPrice){
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = new Date();
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

     public String getDate(){
       String pattern = "MM/dd/yyyy HH:mm:ss";
       DateFormat df = new SimpleDateFormat(pattern);
       String todayAsString = df.format(buyTime);
       return todayAsString;
     }

     public String toString(){
        return "goodName = "+goodName+" goodPrice = "+goodPrice+" buyTime = "+buyTime;
     }

    public String getGoodName() {
        return goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }
}
