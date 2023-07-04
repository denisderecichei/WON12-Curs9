package org.fasttrackit.curs9.animals;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public final void eat() {
        System.out.println("food like an animal");
    }

    public void sleep() {
        System.out.println("sleep like an animal");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
