package com.wigell.Command;

import com.wigell.BusinessObjects.Pants;

public class PantsSurferLenghtCommand implements PantsProcessingCommand {
    @Override
    public Pants process(Pants pants) {
        pants.setLenght("Surfer lenght");
        System.out.println("Pants has been adjusted to Surfer lenght");
        return pants;
    }
}