package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean isCrashed;


    public Car(Position pos) {
        this.pos = pos;
    }


    //Getters&&Setters-------------------------------------------------------
    public Position getPos() {
        return pos;
    }


    //Methods----------------------------------------------------------------

    public boolean isCrashed() {
        return false;
    }

    public void hasCrashed(boolean crashed) {
        this.isCrashed = crashed;
    }

    public void randomMove() {
        if (!isCrashed) {
            int randomNum = (int) (Math.random() * 4);
            switch (randomNum) {
                case 0:
                    pos.moveUp();
                    break;
                case 1:
                    pos.moveDown();
                    break;
                case 2:
                    pos.moveLeft();
                    break;
                case 3:
                    pos.moveRight();
                    break;
            }

        }
    }
}
