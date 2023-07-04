package org.fasttrackit.tema8.advertisement;

public class EmailAdvertisement implements Advertisement{
    @Override
    public void advertiseMessage(String message) {
        System.out.println("PRINT FROM EMAIL: " + message);
    }
}
