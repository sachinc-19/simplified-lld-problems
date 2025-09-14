package VendingMachine.State;

import VendingMachine.VendingMachine;

public class WorkingState implements VendingState {
    @Override
    public void insertCoin(VendingMachine product) {
        //not doing anything here
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Product dispensed");
        //set any other state if applicable
    }
}
