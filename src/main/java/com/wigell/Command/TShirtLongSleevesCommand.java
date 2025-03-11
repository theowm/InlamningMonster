package com.wigell.Command;

import com.wigell.BusinessObjects.TShirt;

public class TShirtLongSleevesCommand implements TShirtProcessingCommand{
    @Override
    public TShirt process(TShirt tshirt) {
        tshirt.setSleeves("Long sleeves");
        System.out.println("T-Shirt sleeves has ben adjusted to Long sleeves");
        return tshirt;
    }
}
