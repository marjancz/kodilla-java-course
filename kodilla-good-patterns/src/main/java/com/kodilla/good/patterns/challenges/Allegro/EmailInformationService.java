package com.kodilla.good.patterns.challenges.Allegro;

public class EmailInformationService implements InformationService {

    @Override
    public void inform(OrderRequest orderRequest) {
        //this.orderRequest = orderRequest;
        System.out.println("The order: \n" +
                "\n" + orderRequest.getCommodity().toString() +
                "\nquantity: " + orderRequest.getQuantity() +
                "\nfor: \n" + orderRequest.getUser().getName() +
                 " " + orderRequest.getUser().getSurname() +
                "\n" +
                "\nhas been realized");
    }
}
