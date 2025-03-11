package com.wigell.builder;

import com.wigell.BusinessObjects.Skirt;

public class SkirtBuilder {

    private Skirt skirt = new Skirt();

    public SkirtBuilder addMaterial(String material){
        skirt.setMaterial(material);
        return this;
    }

    public SkirtBuilder addSize(String size){
        skirt.setSize(size);
        return this;
    }

    public SkirtBuilder addColor(String color){
        skirt.setColor(color);
        return this;
    }

    public Skirt build(){
        if(skirt.getMaterial() == null){
            throw new RuntimeException("Missing Material");
        }

        if (skirt.getSize() == null){
            throw new RuntimeException("Missing Size");
        }

        if (skirt.getColor() == null){
            throw new RuntimeException("Missing Color");
        }
        return skirt;
    }

}
