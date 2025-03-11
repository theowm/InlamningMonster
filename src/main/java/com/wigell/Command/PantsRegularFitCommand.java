package com.wigell.Command;

import com.wigell.BusinessObjects.Pants;

public class PantsRegularFitCommand implements PantsProcessingCommand {
    @Override
    public Pants process(Pants pants) {
        pants.setFit("Regular Fit");
        System.out.println("Pants has been set to Regular Fit");
        return pants;
    }
}
