package models;

import java.util.ArrayList;

public class Student extends Person {
    private static int  id_gen = 1;
    private int id;
     ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, Boolean gender) {
        super(name, surname, age, gender);
        id = id_gen++;
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGrade() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);

        }

        return sum / grades.size();

    }

    public double convertTogpa(double calculateGrade) {
        if(calculateGrade >= 93) {return 4.0;}
        else if(calculateGrade  >= 90) {return 3.7;}
        else if(calculateGrade >= 87) {return 3.3;}
        else if(calculateGrade >= 83) {return 3.0;}
        else if(calculateGrade >= 80) {return 2.7;}
        else if(calculateGrade >= 70) {return 2.3;}
        else if(calculateGrade >= 65) {return 1.0;}
        return 0.0;

    }


@Override
    public String toString() {
        return super.toString() + " I'm a student with ID " + id  + " My GPA is " + convertTogpa(calculateGrade());
    }
}
