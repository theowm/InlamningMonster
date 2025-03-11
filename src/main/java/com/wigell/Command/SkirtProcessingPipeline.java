package com.wigell.Command;

import com.wigell.BusinessObjects.Skirt;

import java.util.ArrayList;

public class SkirtProcessingPipeline {
    private ArrayList<SkirtProcessingCommand> skirtPipeline = new ArrayList<>();

    public void addCommand(SkirtProcessingCommand command) {
        skirtPipeline.add(command);
    }

    public Skirt execute(Skirt skirt){
        Skirt result = skirt;
        for (SkirtProcessingCommand command : skirtPipeline) {
            result = command.process(result);
        }
        return result;
    }
}
