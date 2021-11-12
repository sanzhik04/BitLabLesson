//ThreadSample.java
import javax.swing.*;

public class ThreadSample implements Runnable {
    String name;
    JLabel label;
    int X;
    int Y;
    private boolean isActive;

    public ThreadSample(){
        isActive = true;
        this.name = "";
    }
    public ThreadSample(String name, JLabel label,int X, int Y){
        isActive = true;
        this.name = name;
        this.label = label;
        this.X = X;
        this.Y = Y;
    }

    void disable(){
        isActive = false;
    }

    public void run(){
        while(isActive){
            try{
                for(int i=X;i<=200;i++){
                    for(int j=Y;j<=200;j++){
                        label.setLocation(i,j);
                        Thread.sleep(100);
                        if(i==200 && j==200){
                            break;
                        }
                    }
                }
                label.setLocation(200,200);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    public int MyRandomY(){
        int num = 0 + (int) (Math.random()*300);
        return num;
    }

    public int MyRandomX(){
        int num = 0 + (int) (Math.random()*500);
        return num;
    }
}
