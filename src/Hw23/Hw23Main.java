package Hw23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hw23Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>(List.of(
                new Student("Suzie", 24, 11),
                new Student("Will", 13, 9),
                new Student("Lukas", 23, 11),
                new Student("Mike", 14, 9),
                new Student("Dustin", 12, 8)));

        //1 Студенти яким більше 22
        List<Student> res1 = students.stream()
                .filter(student -> student.getAge() > 22)
                .collect(Collectors.toList());

        //2 Коллекція з імен студентів
        List<String> res2 = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        //3 Сумарний вік всіх студентів
        Integer res3 = students.stream()
                .map(Student::getAge)
                .reduce(0, Integer::sum);

        for (Student h : res1) { System.out.println(h); } // 1
        System.out.println("============");
        for (String h : res2) { System.out.println(h); } // 2
        System.out.println("============");
        System.out.println(res3); // 3

    }

}
