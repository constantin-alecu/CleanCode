package com.ing.java.dev.school.solid.liskov_substitution.bad;

public class BookDelivery {
    String titles;
    Integer userID;

    void getDeliveryLocations() {
        // ....
    }

}
class PosterMapDelivery extends BookDelivery {

    @Override
    void getDeliveryLocations() {
        // ....
    }
}

class AudioBookDelivery extends BookDelivery {

    @Override
    void getDeliveryLocations() {

        /* can't be implemented since

         * Audio book doesn't have

         * a physical location. */

        throw new RuntimeException("AudioBook does not have a physical delivery address");

    }

}
