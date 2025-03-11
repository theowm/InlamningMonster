package com.wigell.BusinessObjects;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Pants {

    private int id;

    private String name;

    private String size;

    private int price;

    private String material;

    private String color;

    private String fit;

    private String lenght;

    private PropertyChangeSupport propertyChangeSupport; //"Klass som tillhandahåller support för att lyssna på förändringar i vårt objekt"

    public Pants() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
        this.price = 899;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String oldColor = this.color;
        this.color = color;

        this.propertyChangeSupport.firePropertyChange("color", oldColor, this.color);
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }
}
