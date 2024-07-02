package com.ironhack.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {
    @Id
    private String title;
    private Date date;
    private Integer duration;
    private String location;

    @OneToMany
    private List<Guest> listOfGuests;

    @ManyToOne
    private EventManagement eventManagement;

    public Event() {
    }

    public Event(String title, Date date, Integer duration, String location, List<Guest> listOfGuests) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.listOfGuests = listOfGuests;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Guest> getListOfGuests() {
        return listOfGuests;
    }

    public void setListOfGuests(List<Guest> listOfGuests) {
        this.listOfGuests = listOfGuests;
    }

    public EventManagement getEventManagement() {
        return eventManagement;
    }

    public void setEventManagement(EventManagement eventManagement) {
        this.eventManagement = eventManagement;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", listOfGuests=" + listOfGuests +
                '}';
    }
}
