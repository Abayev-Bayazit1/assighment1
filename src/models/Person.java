package models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Boolean gender;

    public Person(String name, String surname, int age, Boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        String genderString = gender ? "male" : "female";
        return "Hi, I'm " + name + " " + surname + ", my age " +  age + " , " + "and my gender " + genderString;

    }
}