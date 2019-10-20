package com.example.bikearound;

public class Bike {

    private String bikeName;
    private String ownerName;
    private String rating;
    private String bikeType;
    private String description;
    private int thumbnail;

    public Bike() {
    }

    public Bike(String bikeName, String ownerName, String rating, String bikeType, String description, int thumbnail) {
        this.bikeName = bikeName;
        this.ownerName = ownerName;
        this.rating = rating;
        this.bikeType = bikeType;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public String getBikeName() {
        return bikeName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getRating() {
        return rating;
    }

    public String getBikeType() {
        return bikeType;
    }

    public String getDescription() {
        return description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
