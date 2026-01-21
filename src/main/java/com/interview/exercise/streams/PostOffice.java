package com.interview.exercise.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PostOffice {
    private final Truck truck = new Truck();

    public void sendParcels(List<Parcel> parcels) {
        sendParcels(sortByWeight(parcels));
    }

    private static Stream<Parcel> sortByWeight(List<Parcel> parcels) {
        return parcels.stream()
                .sorted(Comparator.comparingInt(Parcel::weight));
    }

    private void sendParcels(Stream<Parcel> sortedParcels) {
        putIntoTruck(sortedParcels);
        printRaport(sortedParcels);
    }

    private void putIntoTruck(Stream<Parcel> parcels) {
        parcels.forEach(truck::put);
    }

    private void printRaport(Stream<Parcel> parcels) {
        System.out.println("The following packages were sent in the specified order:");
        parcels.forEach(System.out::println);
    }
}
