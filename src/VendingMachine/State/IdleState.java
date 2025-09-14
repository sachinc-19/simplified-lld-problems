package VendingMachine.State;

import VendingMachine.VendingMachine;

public class IdleState implements VendingState {
    @Override
    public void insertCoin(VendingMachine product) {
        //insert coin logic
        System.out.println("Coin Inserted");
        product.setMachineState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        //not doing anything here
    }
}
