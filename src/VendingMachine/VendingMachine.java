package VendingMachine;

import VendingMachine.State.VendingState;

public class VendingMachine {
    private VendingState machineState;

    public VendingState getMachineState() {
        return machineState;
    }

    public void setMachineState(VendingState machineState) {
        this.machineState = machineState;
    }
}
