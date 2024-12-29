import  models.Person;
import models.Student;
import models.Teachers;
import models.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws FileNotFoundException {
        String path1 = "src/students.txt";
        String path2 = "src/teachers.txt";
        School school = new School();
        File file1 = new File(path1);
        Scanner scanner1 = new Scanner(file1);
        File file2  = new File(path2);
        Scanner scanner2 = new Scanner(file2);

        // читаем первый файл
        while (scanner1.hasNext()) {
            String name = scanner1.next();
            String surname = scanner1.next();
            int age = scanner1.nextInt();
            boolean gender = scanner1.next().equalsIgnoreCase("Male");

            Student students = new Student(name,surname,age,gender);

            while(scanner1.hasNextInt()){
                students.addGrade(scanner1.nextInt());
            }

            school.addMember(students);

        }

        scanner1.close();

        // читаем второй файл
        while(scanner2.hasNextLine()) {
            String name = scanner2.next();
            String surname = scanner2.next();
            int age = scanner2.nextInt();
            boolean gender = scanner2.next().equalsIgnoreCase("Male");
            String subject = scanner2.next();
            int yearsOfExperience = scanner2.nextInt();
            int salary = scanner2.nextInt();

            Teachers teachers = new Teachers(name,surname,age,gender,subject,yearsOfExperience,salary);

            school.addMember(teachers);

        }

        scanner2.close();

        System.out.println("Before sorting and raise:");

        System.out.println(school);

        // добавление зп если стаж больше 10 лет
        for (Person member : school.getMembers()) {
            if(member instanceof Teachers teachers) {
                if(teachers.getYearsOfExperience()  >= 10){
                    teachers.giveRaise(10);
                }
            }
        }

        school.sortStudents();

        System.out.println("After give Raise and sort students by GPA :");

        System.out.println(school);


    }
}
























