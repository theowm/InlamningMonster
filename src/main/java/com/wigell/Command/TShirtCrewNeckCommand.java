package com.wigell.Command;

import com.wigell.BusinessObjects.TShirt;

public class TShirtCrewNeckCommand implements TShirtProcessingCommand{
    @Override
    public TShirt process(TShirt tshirt) {
        tshirt.setNeck("Crew neck");
        System.out.println("T-Shirt neck has been adjusted to Crew neck");
        return tshirt;
    }
}
