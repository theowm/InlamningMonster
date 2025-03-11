package com.wigell.Command;

import com.wigell.BusinessObjects.Pants;

import java.util.ArrayList;

public class PantsProcessingPipeline {

    private ArrayList<PantsProcessingCommand> pantsPipeline = new ArrayList<>(); // Pipeline/Serie av kommandon

    public void addCommand(PantsProcessingCommand command) {
        pantsPipeline.add(command);
    }

    public Pants execute(Pants pants) {
        Pants result = pants; // Sätts til samma som kommer in. Finns fall där den är tom och då vill vi ej göra något med den
        for(PantsProcessingCommand command : pantsPipeline) {
            result = command.process(result);
        }
        return result;
    }



}
