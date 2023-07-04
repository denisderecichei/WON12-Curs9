package org.fasttrackit.curs9;

import org.fasttrackit.curs9.animals.Animal;
import org.fasttrackit.curs9.animals.Cat;
import org.fasttrackit.curs9.animals.Dog;
import org.fasttrackit.curs9.animals.SiberianCat;

// class extends class
// interface extends interface
// class implements interface

//Folositi LocalDateTime pt ora.
//LocalDateTime.now() pt a face rost de timpul curent.

public class Main {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.walk();
//        dog.eat();
//        dog.sleep();

        System.out.println("------------------------------");
        Cat cat = new Cat(13, "jojo", 10);
        System.out.println("Varsta pisicii este: " + cat.getAge());
        System.out.println("Numele pisicii este: " + cat.getName());
        System.out.println("CAT MAKEOVER++++++++++++++++++");
        cat.setAge(15);
        cat.setName("jojo2");
        System.out.println("Varsta pisicii este: " + cat.getAge());
        System.out.println("Numele pisicii este: " + cat.getName());
        cat.eat();
        cat.sleep();
//        cat.purr(30);
        System.out.println("Varsta pisicii este: " + cat.getAge());
        System.out.println("------------------------------");
        Animal animalDeBaza = new Animal(131, "animal");
        animalDeBaza.eat();
        animalDeBaza.sleep();
        System.out.println("Varsta animalului este: " + animalDeBaza.getAge());

        SiberianCat siberianCat = new SiberianCat(10, "sibi", 30, 4.5);
        siberianCat.getNrOfWhisks();
        siberianCat.eat();
        siberianCat.sleep();
        siberianCat.purr(68);
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Varsta pisicii siberiene este: " + siberianCat.getAge());
        System.out.println("Varsta pisicii este: " + cat.getAge());

        //OVERRIDING
        System.out.println();
        System.out.println();
        System.out.println();
        Dog dog = new Dog(10, "frufru", 3);
        dog.eat();
        dog.sleep();


    }
}
