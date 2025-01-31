package pattern.design.lowLevel.behavioralDesignPattern.statePattern;

import java.util.List;

public class IdleState implements State{
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {
        //leave all these
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {

    }

    @Override
    public int getChange(int returnChangeMoney) {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {

    }
}
