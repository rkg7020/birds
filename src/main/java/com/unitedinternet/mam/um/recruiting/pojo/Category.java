package com.unitedinternet.mam.um.recruiting.pojo;

public enum Category {
    LC ("Least Concern"),
    NT ("NearThreatened"),
    VU ("Vulnerable"),
    EN ("Endangered"),
    CR ("Critically Endangered"),
    EW ("Extinct in the Wild") ,
    EX ("Extinct"),
    DD ("Data Deficient");
    Category(String description) {
        this.description = description;
    }


    private String description;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static Category fromString(String category) {
        for (Category c : Category.values()) {
            if (c.name().equalsIgnoreCase(category)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Unknown IUCN category: " + category);
    }




}
