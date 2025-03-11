package com.wigell.Command;

import com.wigell.BusinessObjects.Pants;

public class PantsSlimFitCommand implements PantsProcessingCommand {
    @Override
    public Pants process(Pants pants) {
        pants.setFit("Slim Fit");
        System.out.println("Pants has been adjusted to Slim Fit");
        return pants;
    }
}
