package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class CarFactory {

    public static  Car getNewCar() {
        int newCar = (int) (Math.random()*2);
            if (newCar == 0) {
                return new Fiat();
            }
            return new Mustang();


        }

    }

