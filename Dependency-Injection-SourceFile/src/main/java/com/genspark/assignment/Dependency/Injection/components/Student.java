package com.genspark.assignment.Dependency.Injection.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public class Student {
    private int id;
    private String name;
    //@Autowired
    private List<Phone> ph;
    //@Autowired
    private Address add;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public List<Phone> getPh() {return ph;}
    public void setPh(List<Phone> ph) {this.ph = ph;}

    public Address getAdd() {return add;}
    public void setAdd(Address add) {this.add = add;}

    public Student(int id, String name, List<Phone>  phones, Address address){
        this.id = id;
        this.name = name;
        this.ph = phones;
        this.add = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + ph +
                ", address=" + add +
                '}';
    }

    public void printStudent() {
        System.out.println(name + " " + id);
    }

    public void init(){
        System.out.println("Student Bean Initialized");
    }
    public void destroy(){
        System.out.println("Student Bean Closed");
    }

}
