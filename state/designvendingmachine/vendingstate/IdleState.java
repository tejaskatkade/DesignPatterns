package state.designvendingmachine.vendingstate;

import java.util.List;

import state.designvendingmachine.Coin;
import state.designvendingmachine.Item;
import state.designvendingmachine.VendingMachine;

public class IdleState implements State {

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void clickOnStartProdictSelection(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnStartProdictSelection'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public int returnChange(int changeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnChange'");
    }

    @Override
    public Item despenseProduct(VendingMachine vendingMachine, int productNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'despenseProduct'");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundFullMoney'");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }
    
}
