package com.ing.java.dev.school.solid.liskov_substitution.good;

public class BookDelivery {
    String title;
    Integer userID;
}

class OfflineDelivery extends BookDelivery {

    void getDeliveryLocations() {
        // ....
    }
}

class OnlineDelivery extends BookDelivery {

    void getSoftwareOptions() {
        // ....
    }
}