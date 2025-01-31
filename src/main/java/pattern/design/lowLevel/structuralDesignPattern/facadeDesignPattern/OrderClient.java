package pattern.design.lowLevel.structuralDesignPattern.facadeDesignPattern;

public class OrderClient {

    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
