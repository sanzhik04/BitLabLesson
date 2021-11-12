//Car.java
public class Car extends Thread{
    String name;
    int speed;
    double distance;

    public Car(String name, int speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void run(){
        try{
            System.out.println(name+" started");
            for(int i = 0;i<distance;i=i+speed){
                System.out.println(name+" is in "+i+" meters");
                Thread.sleep(1000);
            }
            System.out.println(name+" "+"finished in"+" "+(int)distance/speed+" seconds");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public int FinishTime(){
        return (int)distance/speed;
    }

    @Override
    public String toString() {
        return name+" "+FinishTime();
    }
}
