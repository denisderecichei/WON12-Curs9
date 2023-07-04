package org.fasttrackit.tema8;

public class Student {
    private String name;
    private double grade;

    private static int numberOfStudents;
    private static double sumOfGrades;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        numberOfStudents++;
        sumOfGrades += grade;
    }

    public static double averageOfAllStudents() {
        return sumOfGrades / numberOfStudents;
    }


}
