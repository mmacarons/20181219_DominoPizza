package com.example.mira.dominopizza.datas;

public class Menu {

    private String name;
    private String largePrice;
    private String mediumPrice;
    private String logoURL;

    public Menu(String name, String largePrice, String mediumPrice, String logoURL) {
        this.name = name;
        this.largePrice = largePrice;
        this.mediumPrice = mediumPrice;
        this.logoURL = logoURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(String largePrice) {
        this.largePrice = largePrice;
    }

    public String getMediumPrice() {
        return mediumPrice;
    }

    public void setMediumPrice(String mediumPrice) {
        this.mediumPrice = mediumPrice;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }
}
