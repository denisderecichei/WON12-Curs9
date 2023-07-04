package org.fasttrackit.curs9.animals;

public class Dog extends Animal {
    protected int children;

    public Dog(int age, String name, int children) {
        super(age, name);
        this.children = children;
    }

//    @Override
    public void eat313123() {
        System.out.println("PRINTEZ DIN PARINTE");
        super.eat();
        System.out.println("PRINTEZ DIN COPIL");
        System.out.println("I AM A DOG, I EAT LIKE A DOG");
    }

    public void walk() {
        System.out.println("walk like a dog");
    }

    public int getChildren() {
        return children;
    }
}
