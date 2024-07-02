package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AssociationOfNurses {
    @Id
    private String name;

    AssociationOfNurses() {
    }

    public AssociationOfNurses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AssociationOfNurses{" +
                "name='" + name + '\'' +
                '}';
    }

}
