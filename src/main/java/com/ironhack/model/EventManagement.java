package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EventManagement {
    @Id
    private String name;

    EventManagement() {
    }

    public EventManagement(String name) {
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
        return "EventManagement{" +
                "name='" + name + '\'' +
                '}';
    }
}
