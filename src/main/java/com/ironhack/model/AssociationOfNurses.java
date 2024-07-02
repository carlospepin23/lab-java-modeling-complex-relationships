package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class AssociationOfNurses {
    @Id
    private String name;
    @OneToMany(mappedBy = "associationOfNurses")
    private List<Chapter> chapters;

    AssociationOfNurses() {
    }

    public AssociationOfNurses(String name, List<Chapter> chapters) {
        this.name = name;
        this.chapters = chapters;
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
                ", chapters=" + chapters +
                '}';
    }
}
