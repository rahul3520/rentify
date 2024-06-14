package com.app.rentify.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="seller")
public class Seller extends User{

    private List<PropertyDetails> propertyList;
}
