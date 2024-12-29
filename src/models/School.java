package models;

import java.util.ArrayList;
import java.util.List;


public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public List<Person> getMembers() {
        return members;

    }


    public void sortStudents() {
        members.sort((p1, p2) -> {
            if (p1 instanceof Student && p2 instanceof Student) {
                Student s1 = (Student) p1;
                Student s2 = (Student) p2;
                return Double.compare(s2.convertTogpa(s2.calculateGrade()),
                        s1.convertTogpa(s1.calculateGrade()));
            }
            return 0;
        });
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < members.size(); i++) {
            Person person = members.get(i);
            sb.append(person.toString()).append("\n");
        }

        return sb.toString();

    }
}
