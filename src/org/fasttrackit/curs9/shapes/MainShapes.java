package org.fasttrackit.curs9.shapes;

public class MainShapes {

    public static void main(String[] args) throws InterruptedException {
        Circle circle = new Circle(14.5);
        Square square = new Square(19.8);
        CalculatorArie arie = new CalculatorArie();

        System.out.println("Aria cercului este " + arie.area(circle));
        System.out.println("Aria patratului este " + arie.area(square));
        System.out.println("Aria patratului simpla este " + arie.area(13));
        System.out.println("Aria dreptunghiului este " + arie.area(13, 18));


        NoteBac notaNadia = new NoteBac("Nadia", 10, 9);
        // hashCode = nota / 130 + notaRomana * 1313231 + "Nadia".toCharArray().sum();
        //1002
        NoteBac notaNadia2 = new NoteBac("Nadia", 10, 9);
        //1002
        System.out.println(notaNadia.getName());
        System.out.println(notaNadia.getNotaMate());
        System.out.println(notaNadia.getNotaRomana());

        notaNadia.equals(notaNadia);
        notaNadia.hashCode();
        notaNadia.toString();

        System.out.println("BEFORE");
        notaNadia.wait(5000);
        System.out.println("AFTER");

        Object object = new Object();
    }
}
