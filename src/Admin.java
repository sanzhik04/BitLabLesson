//Admin.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("PRESS [1] ADD GOOD");
            System.out.println("PRESS [2] LIST GOODS");
            System.out.println("PRESS [3] DELETE GOODS");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Name?");
                String name = in.next();
                System.out.println("Price?");
                int price = in.nextInt();
                ArrayList<GoodItem> goodItems = getGoodItemList();
                GoodItem g = new GoodItem(name,price);
                goodItems.add(g);
                saveGoodItems(goodItems);
            }
            else if(choice==2){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i<goodItems.size();i++){
                    System.out.println(goodItems.get(i));
                }
            }
            else if(choice==3){
                ArrayList<GoodItem> goodItems = getGoodItemList();
                for(int i = 0;i<goodItems.size();i++){
                    System.out.println(goodItems.get(i));
                }
                System.out.println("Insert index you want to delete");

                int index = in.nextInt();

                goodItems.remove(index);
                saveGoodItems(goodItems);
            }
            else if(choice==0){
                break;
            }
            else{
                System.out.println("WRONG COMMAND");
            }
        }


    }

    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/files/gooditems.txt"));
            String line = "";
            while((line = br.readLine())!= null){
                String name = line;
                int price = Integer.parseInt(br.readLine());
                goodItems.add(new GoodItem(name,price));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return goodItems;
    }

    public static void saveGoodItems(ArrayList<GoodItem> goodItems){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/files/gooditems.txt"));
            for(GoodItem g : goodItems){
                bw.write(g.getName()+"\n");
                bw.write(g.getPrice()+"\n");
            }
            bw.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
