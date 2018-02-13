package com.kodilla.good.patterns.challenges.Allegro;

public class EmailInformationService implements InformationService {

    @Override
    public void inform(OrderRequest orderRequest) {
        System.out.println("The order: \n" +
                "\n" + orderRequest.getCommodity().toString() +
                "\nQuantity: " + "[ " + orderRequest.getQuantity() + " ]" +
                "\n" + orderRequest.getUser().toString() +
                "\n" + "\nhas been realized!");
    }
}
