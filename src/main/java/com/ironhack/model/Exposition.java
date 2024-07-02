package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "title")
public class Exposition extends Event{

    public Exposition() {
    }


}
