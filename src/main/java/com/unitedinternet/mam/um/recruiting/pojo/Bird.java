package com.unitedinternet.mam.um.recruiting.pojo;

public class Bird {
    private String name;
    private String family;
    private String sciName;
    private Category category;

    public Bird(String family, String name,  String sciName, String category) {
        this.family = family;
        this.name = name;

        this.sciName = sciName;
        this.category = Category.fromString(category);;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", sciName='" + sciName + '\'' +
                ", category=" + category +
                '}';
    }
}
