package com.app.rentify.model;

import jakarta.persistence.*;

@Entity
@Table(name = "property_details")
public class PropertyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int propertyId;

    private String placeLocation;

    private int areaInSquareFeet;

    private int noOfBedroom;

    private int noOfBathroom;

    private String amenitiesAvailable;

    private int sellerId;

    public PropertyDetails() {
    }

    public PropertyDetails(String placeLocation, int areaInSquareFeet, int noOfBedroom, int noOfBathroom, String amenitiesAvailable,int sellerId) {
        this.placeLocation = placeLocation;
        this.areaInSquareFeet = areaInSquareFeet;
        this.noOfBedroom = noOfBedroom;
        this.noOfBathroom = noOfBathroom;
        this.amenitiesAvailable = amenitiesAvailable;
        this.sellerId = sellerId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public void setPlaceLocation(String placeLocation) {
        this.placeLocation = placeLocation;
    }

    public int getAreaInSquareFeet() {
        return areaInSquareFeet;
    }

    public void setAreaInSquareFeet(int areaInSquareFeet) {
        this.areaInSquareFeet = areaInSquareFeet;
    }

    public int getNoOfBedroom() {
        return noOfBedroom;
    }

    public void setNoOfBedroom(int noOfBedroom) {
        this.noOfBedroom = noOfBedroom;
    }

    public int getNoOfBathroom() {
        return noOfBathroom;
    }

    public void setNoOfBathroom(int noOfBathroom) {
        this.noOfBathroom = noOfBathroom;
    }

    public String getAmenitiesAvailable() {
        return amenitiesAvailable;
    }

    public void setAmenitiesAvailable(String amenitiesAvailable) {
        this.amenitiesAvailable = amenitiesAvailable;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

}
