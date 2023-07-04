package org.fasttrackit.tema8;

import org.fasttrackit.tema8.advertisement.EmailAdvertisement;
import org.fasttrackit.tema8.advertisement.FacebookAdvertisement;
import org.fasttrackit.tema8.advertisement.PrintAdvertisement;
import org.fasttrackit.tema8.animals.Cat;
import org.fasttrackit.tema8.animals.Dog;
import org.fasttrackit.tema8.banks.BT;

public class Main {

    public static void main(String[] args) {
        FacebookAdvertisement facebook = new FacebookAdvertisement();
        EmailAdvertisement emailAdvertisement = new EmailAdvertisement();
        PrintAdvertisement print = new PrintAdvertisement();

        facebook.advertiseMessage("tema8");
        emailAdvertisement.advertiseMessage("tema8");
        print.advertiseMessage("tema8");

        BT bt = new BT(1000);
        int soldulCurent;
        soldulCurent = bt.withdraw(5000);
        System.out.println("Soldul curent: " + soldulCurent);

        soldulCurent = bt.withdraw(100);
        System.out.println("Soldul curent: " + soldulCurent);

        soldulCurent = bt.deposit(2000);
        System.out.println("Soldul curent: " + soldulCurent);

        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println("A cat walks like this: " + cat.walk());
        System.out.println("A cat eats like this: " + cat.eat());
        System.out.println("A cat talks like this: " + cat.talk());

        System.out.println("A dog walks like this: " + dog.walk());
        System.out.println("A dog eats like this: " + dog.eat());
        System.out.println("A dog talks like this: " + dog.talk());

        Student student1 = new Student("1", -6.88);
        Student student2 = new Student("2", 4.88);
        Student student3 = new Student("3", 1.88);
        Student student4 = new Student("4", -2.88);

        System.out.println("Media studentilor este: " + Student.averageOfAllStudents());
    }
}
