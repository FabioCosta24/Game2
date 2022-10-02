package org.academiadecodigo.carcrash.cars;

public enum CarType {
    FIAT ("F"),
    MUSTANG("M");

    private String brand;

    CarType (String brand ){
    this.brand= brand;
    }

    public String getBrand() {
        return brand;
    }
}