package personal.ex.VendingMachine;

import java.util.HashMap;
import java.util.Map;
public class VendingMachine {
    private Map<Integer,String> products;
    private int credit;
    public VendingMachine(){
        products=new HashMap<>();
        products.put(1,"Cola");
        products.put(2,"Snickers");
        products.put(3,"KitKat");
        credit=0;
    }
    public void displayProducts(){
        System.out.println("Available Products:");
        for(Map.Entry<Integer,String > entry: products.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public void insertCoin(int value){
        credit+=value;
    }
    public String selectProduct(int id){
        if(products.containsKey(id)){
            String productName=products.get(id);
            if(credit>0){
                credit-=1;
                return "You selected: "+productName;
            }
            else{
                return "Please insert coins to purchase"+productName;
            }
        }
        else{
            return "invalid product selection";
        }
    }
    public void displayCredit(){
        System.out.println("Current Credit: "+credit);
    }
    public void userManual(){
        System.out.println("Vending Machine Menu:");
        System.out.println("1. Display Products");
        System.out.println("2. Insert Coin");
        System.out.println("3. Select Product");
        System.out.println("4. Display Credit");
        System.out.println("5. Exit");
    }
}
