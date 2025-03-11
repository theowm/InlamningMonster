package com.wigell.Command;

import com.wigell.BusinessObjects.Pants;

public class PantsClassicLenghtCommand implements PantsProcessingCommand {
    @Override
    public Pants process(Pants pants) {
        pants.setLenght("Classic lenght");
        System.out.println("Pants has been adjusted to Classic lenght");
        return pants;
    }
}
