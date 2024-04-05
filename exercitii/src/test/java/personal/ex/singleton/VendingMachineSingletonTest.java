package personal.ex.singleton;

import personal.ex.VendingMachine.VendingMachineSingleton;

public class VendingMachineSingletonTest {
    public static void main(String[] args) {
        VendingMachineSingleton a= VendingMachineSingleton.getInstance();
        a.displayProducts();
        a.insertCoin(10);
        String selectionResult=a.selectProduct(3);
        System.out.println(selectionResult);
        a.displayCredit();
    }
}
