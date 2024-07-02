package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Guest {
    @Id
    private String name;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private enum Status {
        ATTENDING, NOT_ATTENDING, NO_RESPONSE
    }

    public Guest() {
    }

    public Guest(String name){
        this.name = name;
        this.status = Status.ATTENDING;
    }

    public Guest(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
