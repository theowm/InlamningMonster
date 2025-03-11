package com.wigell.builder;

import com.wigell.BusinessObjects.TShirt;

public class TShirtBuilder {

    private TShirt tshirt = new TShirt();


    public TShirtBuilder addMaterial(String material){
        tshirt.setMaterial(material);
        return this;
    }

    public TShirtBuilder addSize(String size){
        tshirt.setSize(size);
        return this;
    }

    public TShirtBuilder addColor(String color){
        tshirt.setColor(color);
        return this;
    }

    public TShirt build(){
        if(tshirt.getMaterial() == null){
            throw new RuntimeException("Missing Material");
        }

        if (tshirt.getSize() == null){
            throw new RuntimeException("Missing Size");
        }

        if (tshirt.getColor() == null){
            throw new RuntimeException("Missing Color");
        }
        return tshirt;
    }
}
