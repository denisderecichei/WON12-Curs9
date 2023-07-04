package org.fasttrackit.tema8.animals;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "walk like a dog";
    }

    @Override
    public String talk() {
        return "woof";
    }

    @Override
    public String eat() {
        return "dog food";
    }
}
