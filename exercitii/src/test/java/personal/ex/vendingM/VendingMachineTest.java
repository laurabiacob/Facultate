package personal.ex.vendingM;

import personal.ex.VendingMachine.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();
        vendingMachine.displayProducts();
        vendingMachine.insertCoin(10);
        String selectionResult=vendingMachine.selectProduct(3);
        System.out.println(selectionResult);
        vendingMachine.displayCredit();
    }
}
