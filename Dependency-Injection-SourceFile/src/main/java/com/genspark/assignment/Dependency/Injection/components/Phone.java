package com.genspark.assignment.Dependency.Injection.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String mob;

    public String getMob() {return mob;}
    public void setMob(String mob) {this.mob = mob;}

    public Phone(String mob) {
        this.mob = mob;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "mobile='" + mob + '\'' +
                '}';
    }
}
