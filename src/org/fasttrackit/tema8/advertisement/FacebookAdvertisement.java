package org.fasttrackit.tema8.advertisement;

public class FacebookAdvertisement implements Advertisement {

    public void advertiseMessage(String message) {
        System.out.println("PRINT FROM FACEBOOK: " + message);
    }
}
