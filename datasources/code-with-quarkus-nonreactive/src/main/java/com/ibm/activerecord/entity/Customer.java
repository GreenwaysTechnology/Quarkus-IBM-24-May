package com.ibm.activerecord.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;


//Active Record Pattern:
@Entity
public class Customer extends PanacheEntity {
    //columns
    //Column Names
    @Column(name = "name")
    public String name;
    @Column(name = "city")
    public String city;
}
