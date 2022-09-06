package com.elendemo.locaciones.domain;

public class Lodgment {
    private int lodgmentId;

    private String email;
    private String phone;
    private String coordinate;
    private String lodgment;
    private String socialNetwork;

    public int getLodgmentId() {
        return lodgmentId;
    }

    public void setLodgmentId(int lodgmentId) {
        this.lodgmentId = lodgmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getLodgment() {
        return lodgment;
    }

    public void setLodgment(String lodgment) {
        this.lodgment = lodgment;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }
}
