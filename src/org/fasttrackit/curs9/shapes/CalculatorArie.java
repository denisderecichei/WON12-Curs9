package org.fasttrackit.curs9.shapes;

public class CalculatorArie {

    public static double area(Circle circle) {
        return circle.getRadius() * circle.getRadius() * Circle.PI;
    }

    public static double area(Square square) {
        return square.getSide() * square.getSide();
    }

    public static double area(int latime, int lungime) {
        return latime * lungime;
    }

    public static double area(int latura) {
        return latura * latura;
    }


}
