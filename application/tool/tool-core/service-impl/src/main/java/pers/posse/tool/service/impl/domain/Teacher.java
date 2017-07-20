package pers.posse.tool.service.impl.domain;

import domain.enums.Gender;

import javax.persistence.Entity;

/**
 * Created by posse on 17-7-20.
 */
@Entity
public class Teacher {

    private Long id;

    private String name;

    private int age;

    private Gender gender;

    private Course course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
