package com.wigell.BusinessObjects;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CEO implements PropertyChangeListener {

    private int id;

    private String name;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Plagg klar");
    }

    public CEO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
