package com.ironhack.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {
    @Id
    private String name;
    private Status status;

    @Temporal(TemporalType.DATE)
    private Date renewalDate;

    @ManyToOne
    private Chapter chapter;

    public enum Status {
        ACTIVE, LAPSED
    }

    public Member() {
    }

    public Member(String name, Status status, Date renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
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

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", renewalDate=" + renewalDate +
                '}';
    }
}
