package stream.flapMap;

import stream.filter.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlapMap {
    public static void main(String[] args) {

        Students students1 = new Students("Ivan", 'm', 22, 1, 8.3);
        Students students2 = new Students("Ser", 'm', 18, 4, 6.3);
        Students students3 = new Students("Sanya", 'm', 24, 2, 4.3);
        Students students4 = new Students("Petay", 'm', 30, 5, 7.0);
        Students students5 = new Students("Prochor", 'm', 21, 3, 5.3);

        List<Students> list = new ArrayList<>();
        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);

        Faculty facultyEconomics = new Faculty("Economics");
        Faculty facultyHistory = new Faculty("History");
        facultyHistory.addStudent(students1);
        facultyHistory.addStudent(students2);
        facultyEconomics.addStudent(students3);
        facultyEconomics.addStudent(students4);


        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(facultyEconomics);
        facultyList.add(facultyHistory);

        List<String> stringList = facultyList.stream()
                .flatMap(s -> s.getStudentFaculty().stream())
                .sorted((s, s1) -> (s.getAge() - s1.getAge()))
                .map(students -> students.getName())
                .collect(Collectors.toList());

        System.out.println(stringList);

    }
}

class Faculty {
    String name;
    List<Students> studentFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentFaculty = new ArrayList<>();
    }

    public List<Students> getStudentFaculty() {
        return studentFaculty;
    }

    public void addStudent(Students student) {
        getStudentFaculty().add(student);
    }
}
