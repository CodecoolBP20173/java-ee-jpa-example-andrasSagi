package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "class")
public class Klass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @Column(name = "CCLocation")
    @Enumerated(EnumType.STRING)
    private Location location;

    @OneToMany
    private Set<Student> students = new HashSet<>();

    public Klass() {}

    public Klass(String name, Location location) {
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
