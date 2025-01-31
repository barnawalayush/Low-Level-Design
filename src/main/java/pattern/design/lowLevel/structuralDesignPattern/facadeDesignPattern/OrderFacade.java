package pattern.design.lowLevel.structuralDesignPattern.facadeDesignPattern;

import pattern.design.lowLevel.structuralDesignPattern.facadeDesignPattern.subSystem.Invoice;
import pattern.design.lowLevel.structuralDesignPattern.facadeDesignPattern.subSystem.Payment;
import pattern.design.lowLevel.structuralDesignPattern.facadeDesignPattern.subSystem.ProductDao;
import pattern.design.lowLevel.structuralDesignPattern.facadeDesignPattern.subSystem.SendNotification;

public class OrderFacade {

    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade() {
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }

    public void createOrder(){
        // implement logic
    }

}
