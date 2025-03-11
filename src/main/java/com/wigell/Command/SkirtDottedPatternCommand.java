package com.wigell.Command;

import com.wigell.BusinessObjects.Skirt;

public class SkirtDottedPatternCommand implements SkirtProcessingCommand{
    @Override
    public Skirt process(Skirt skirt) {
        skirt.setPattern("Dotted pattern");
        System.out.println("Skirt pattern has been set to Dotted pattern");
        return skirt;
    }
}
