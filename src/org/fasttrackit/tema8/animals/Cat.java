package org.fasttrackit.tema8.animals;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "walk like a cat";
    }

    @Override
    public String talk() {
        return "miau";
    }

    @Override
    public String eat() {
        return "cat food";
    }
}
