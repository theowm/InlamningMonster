package com.wigell;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OrderObserver implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Plagg har beställts");
    }
}
