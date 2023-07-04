package org.fasttrackit.curs9.animals;

public class SiberianCat extends Cat {
    private double weightOfFur;

    public SiberianCat(int age, String name, int nrOfWhisks, double weightOfFur) {
        super(age, name, nrOfWhisks);
        this.weightOfFur = weightOfFur;
    }
}
