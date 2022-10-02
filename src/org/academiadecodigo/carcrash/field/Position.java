package org.academiadecodigo.carcrash.field;

import org.academiadecodigo.carcrash.cars.Car;

public class Position {
    private int row;
    private int col;

    public void startPosition() {
        row = (int) (Math.random() * Field.getHeight());
        col = (int) (Math.random() * Field.getWidth());

    }
    public Position() {
        startPosition();
    }

    public int moveUp() {
        if (getRow() == Field.getHeight()-1) {
            return row--;
        }
        return row++;
    }
    public int moveDown(){
        if (getRow() == 0){
           return row ++;
        }
        return row --;
    }

    public int moveRight(){
        if(getCol()==Field.getWidth()-1){
           return col--;
        }
        return col++;
    }
    public int moveLeft(){
        if (getCol()==0){
            return col++;
        }
        return col --;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

}
