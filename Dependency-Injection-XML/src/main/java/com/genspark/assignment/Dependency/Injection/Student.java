package com.genspark.assignment.Dependency.Injection;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public List<Phone> getPh() {return ph;}
    public void setPh(List<Phone> ph) {this.ph = ph;}

    public Address getAdd() {return add;}
    public void setAdd(Address add) {this.add = add;}

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