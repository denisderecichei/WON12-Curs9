package org.fasttrackit.curs9.animals;

public class Cat extends Animal {
    private int nrOfWhisks;

    public Cat(int age, String name, int nrOfWhisks) {
        super(age, name);
        this.nrOfWhisks = nrOfWhisks;
    }

    public void purr(int age) {
        System.out.println("cat is purring");
    }


    public int getNrOfWhisks() {
        return nrOfWhisks;
    }
}
