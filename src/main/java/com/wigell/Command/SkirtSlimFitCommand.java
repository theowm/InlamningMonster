package com.wigell.Command;

import com.wigell.BusinessObjects.Skirt;

public class SkirtSlimFitCommand implements SkirtProcessingCommand{
    @Override
    public Skirt process(Skirt skirt) {
        skirt.setWaistline("Slim waist fit");
        System.out.println("Skirt waist fit has been adjusted to slim");
        return skirt;
    }
}
