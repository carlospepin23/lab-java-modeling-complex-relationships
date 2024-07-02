package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "title")
public class Conference extends Event{

    @OneToOne
    private Speaker speaker;

    @ManyToOne
    private EventManagement eventManagement;

    Conference() {
    }

    public Conference(Speaker speaker) {
        this.speaker = speaker;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public EventManagement getEventManagement() {
        return eventManagement;
    }

    public void setEventManagement(EventManagement eventManagement) {
        this.eventManagement = eventManagement;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "speaker=" + speaker +
                ", eventManagement=" + eventManagement +
                '}';
    }
}
