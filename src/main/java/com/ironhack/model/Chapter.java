package com.ironhack.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    private String name;
    private String district;

    @OneToOne
    private Member president;

    @OneToMany
    private List<Member> listOfMembers;

    @ManyToOne
    @JoinColumn(name="association_of_nurses_id")
    private AssociationOfNurses associationOfNurses;

    public Chapter() {
    }

    public Chapter(String name, String district, Member president, List<Member> listOfMembers) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.listOfMembers = listOfMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getListOfMembers() {
        return listOfMembers;
    }

    public void setListOfMembers(List<Member> listOfMembers) {
        this.listOfMembers = listOfMembers;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", listOfMembers=" + listOfMembers +
                '}';
    }
}
