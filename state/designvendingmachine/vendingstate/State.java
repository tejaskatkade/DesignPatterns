package state.designvendingmachine.vendingstate;

import java.util.List;

import state.designvendingmachine.Coin;
import state.designvendingmachine.Item;
import state.designvendingmachine.VendingMachine;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnStartProdictSelection(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int productNumber) throws Exception;
    public int returnChange(int changeMoney) throws Exception;
    public Item despenseProduct(VendingMachine vendingMachine, int productNumber) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    public void updateInventory(VendingMachine vendingMachine, Item item, int productNumber) throws Exception;
}
