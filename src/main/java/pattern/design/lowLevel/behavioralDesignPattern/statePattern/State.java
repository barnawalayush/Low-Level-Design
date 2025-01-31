package pattern.design.lowLevel.behavioralDesignPattern.statePattern;

import java.util.List;

public interface State {

    public void clickOnInsertCoinButton(VendingMachine vendingMachine);

    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine);

    public void insertCoin(VendingMachine vendingMachine, Coin coin);

    public void chooseProduct(VendingMachine vendingMachine, int codeNumber);

    public int getChange(int returnChangeMoney);

    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber);

    public List<Coin> refundFullMoney(VendingMachine vendingMachine);

    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber);
}
