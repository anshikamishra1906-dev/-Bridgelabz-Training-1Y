package com.gla.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void main() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(6, "Anshika", 19);
        Student s2 = new Student(14, "Deeksha", 37);
        Student s3 = new Student(18, "Disha", 27);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.stream().filter( s -> s.getAge()>20);
        list.forEach(s->System.out.println(s.getAge()));
    }
}
