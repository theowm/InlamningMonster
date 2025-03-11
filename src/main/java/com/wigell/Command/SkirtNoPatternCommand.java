package com.wigell.Command;

import com.wigell.BusinessObjects.Skirt;

public class SkirtNoPatternCommand implements SkirtProcessingCommand{
    @Override
    public Skirt process(Skirt skirt) {
        skirt.setPattern("No pattern");
        System.out.println("Skirt pattern has been set to No pattern");
        return skirt;
    }
}
