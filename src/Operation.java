//Operation.java
public class Operation extends Thread{
    String operationName;
    int operationTime;

    public Operation(){
        this.operationName = "";
        this.operationTime = -1;
    }

    public Operation(String operationName,int operationTime){
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public void run(){
        System.out.println("Operation "+operationName+" started");
        try{
            for(int i=1;i<operationTime+1;i++){
                System.out.println("Operation "+operationName+" "+i+" second");
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Operation "+operationName+" finished");
    }
}
