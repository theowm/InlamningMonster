package com.wigell.Command;

import com.wigell.BusinessObjects.TShirt;

public class TShirtShortSleevesCommand implements TShirtProcessingCommand{
    @Override
    public TShirt process(TShirt tshirt) {
        tshirt.setSleeves("Short sleeves");
        System.out.println("T-Shirt sleeves has ben adjusted to Short sleeves");
        return tshirt;
    }
}
