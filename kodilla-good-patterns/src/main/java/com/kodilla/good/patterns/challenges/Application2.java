package com.kodilla.good.patterns.challenges;

public class Application2 {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        productOrderProcessor.process(orderRequest);
    }
}
