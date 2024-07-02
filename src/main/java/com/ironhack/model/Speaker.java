package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Speaker{
    @Id
    private String name;
    private Integer presentationDuration;

    public Speaker(String name, Integer presentationDuration) {
        this.name = name;
        this.presentationDuration = presentationDuration;
    }

    public Integer getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Integer presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", presentationDuration=" + presentationDuration +
                '}';
    }
}
