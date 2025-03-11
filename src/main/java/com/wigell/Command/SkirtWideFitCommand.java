package com.wigell.Command;

import com.wigell.BusinessObjects.Skirt;

public class SkirtWideFitCommand implements SkirtProcessingCommand{
    @Override
    public Skirt process(Skirt skirt) {
        skirt.setWaistline("Wide waist fit");
        System.out.println("Skirt waist fit has been adjusted to wide");
        return skirt;
    }
}
