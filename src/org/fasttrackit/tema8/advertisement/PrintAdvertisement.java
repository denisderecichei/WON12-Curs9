package org.fasttrackit.tema8.advertisement;

public class PrintAdvertisement implements Advertisement{
    @Override
    public void advertiseMessage(String message) {
        System.out.println("PRINT FROM PRINT: " + message);
    }
}
