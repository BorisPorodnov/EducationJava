package com.company.model;

import java.util.Objects;

public class Rectangle {

    private float  side1;
    private float  side2;

    public  float  area(){ // ploshad'
        return  side1 * side2;
    }
    public float perimeter(){
        return  side1 * side2 + side1 * side2;
    }

    public Rectangle(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle() {

    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    @Override// переопределить
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.side1, side1) == 0 &&
            Float.compare(rectangle.side2, side2) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
               "side1=" + side1 +
               ", side2=" + side2 +
                    '}';
    }
}
