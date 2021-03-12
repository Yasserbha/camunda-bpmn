package com.lieues.workflow.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ManyToOne
    private Manager manger;

    @OneToMany(mappedBy="employe")
    private List<Conge> conge;

     public Employe() {

     }

     public Employe(Long id, String name, String email, Manager manger, List<Conge> conge) {
         this.id = id;
         this.name = name;
         this.email = email;
         this.manger = manger;
         this.conge = conge;
     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Manager getManger() {
        return manger;
    }

    public void setManger(Manager manger) {
        this.manger = manger;
    }

    public List<Conge> getConge() {
        return conge;
    }

    public void setConge(List<Conge> conge) {
        this.conge = conge;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", manger=" + manger +
                ", conge=" + conge +
                '}';
    }
}
