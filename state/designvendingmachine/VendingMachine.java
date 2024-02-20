package state.designvendingmachine;

import java.util.ArrayList;
import java.util.List;

import state.designvendingmachine.vendingstate.IdleState;
import state.designvendingmachine.vendingstate.State;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
    
}
