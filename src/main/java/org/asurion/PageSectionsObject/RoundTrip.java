package org.asurion.PageSectionsObject;

import org.asurion.AbstractComponents.SearchFlightAvail;

public class RoundTrip implements SearchFlightAvail {
    @Override
    public void checkAvailability(String Origin, String Destination) {
        System.out.println("I am inside RoundTrip section");
    }
}
