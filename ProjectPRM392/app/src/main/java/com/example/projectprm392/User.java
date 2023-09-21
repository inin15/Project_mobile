package com.example.projectprm392;

import java.io.Serializable;

public class User implements Serializable {
    private int resourcecId;
    private String name;
    public User(int resourcecId,String name){
        this.resourcecId=resourcecId;
        this.name=name;
    }

    public int getResourcecId() {
        return resourcecId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResourcecId(int resourcecId) {
        this.resourcecId = resourcecId;
    }
}
