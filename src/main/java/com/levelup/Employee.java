package com.levelup;
import java.util.ArrayList;

public class Employee {
    private int id;
    private int age;
    private String name;
    private String sername;

    public Employee(int id, int age, String name, String sername) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.sername = sername;
    }

    public Employee() {
    }


    public Employee(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }
}
