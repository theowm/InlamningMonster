package com.wigell.builder;

import com.wigell.BusinessObjects.Pants;
import com.wigell.ProductionObserver;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PantsBuilder {

    private Pants pants = new Pants();
    private PropertyChangeListener externalListener = null;

    public PantsBuilder addId(int id){

        pants.setId(id);
        return this;
    }

    public PantsBuilder addName(String name){

        pants.setName(name);
        return this;
    }

    public PantsBuilder addSize(String size){

        pants.setSize(size);
        return this;
    }

    public PantsBuilder addPrice(int price){

        pants.setPrice(price);
        return this;
    }

    public PantsBuilder addMaterial(String material){

        pants.setMaterial(material);
        return this;
    }

    public PantsBuilder addColor(String color){

        pants.setColor(color);
        return this;
    }

    public PantsBuilder addFit(String fit){

        pants.setFit(fit);
        return this;
    }

    public PantsBuilder addLenght(String lenght){

        pants.setLenght(lenght);
        return this;
    }

    //private PropertyChangeSupport propertyChangeSupport; //"Klass som tillhandahåller support för att lyssna på förändringar i vårt objekt"

    public PantsBuilder addPropertyChangeListener(PropertyChangeListener listener) {
        pants.addPropertyChangeListener(listener);
        return this;
    }

    public Pants build(){

        if(pants.getSize() == null){
            throw new RuntimeException("Size missing");
        }

        if(pants.getMaterial() == null){
            throw new RuntimeException("Material missing");
        }

        if(pants.getColor() == null){
            throw new RuntimeException("Color missing");
        }

        //pants.firePropertyChange("manufacturing", null, pants);

        return pants;
    }

}
