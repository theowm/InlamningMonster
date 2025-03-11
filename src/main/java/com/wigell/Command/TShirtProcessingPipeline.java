package com.wigell.Command;

import com.wigell.BusinessObjects.TShirt;

import java.util.ArrayList;

public class TShirtProcessingPipeline {
    private ArrayList<TShirtProcessingCommand> tShirtPipeline = new ArrayList<>();

    public void addCommand(TShirtProcessingCommand command) {

        tShirtPipeline.add(command);
    }

    public TShirt execute(TShirt tshirt) {
        TShirt result = tshirt; // Sätts til samma som kommer in. Finns fall där den är tom och då vill vi ej göra något med den
        for(TShirtProcessingCommand command : tShirtPipeline) {
            result = command.process(result);
        }
        return result;
    }

}
