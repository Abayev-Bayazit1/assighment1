package models;


public class Teachers extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teachers(String name, String surname, int age, Boolean gender,String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(int percentage){
        this.salary += salary * percentage/100;

    }

    public int getSalary() {
        return salary;

    }

    public int getYearsOfExperience() {
        return yearsOfExperience;

    }



@Override
    public String toString() {
        return super.toString() + " I teach "  + subject  + " my salary is " + getSalary();

    }
}
