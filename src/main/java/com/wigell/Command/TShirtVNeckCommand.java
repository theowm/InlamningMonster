package com.wigell.Command;

import com.wigell.BusinessObjects.TShirt;

public class TShirtVNeckCommand implements TShirtProcessingCommand{
    @Override
    public TShirt process(TShirt tshirt) {
        tshirt.setNeck("V-Neck");
        System.out.println("T-Shirt neck has been adjusted to V-Neck");
        return tshirt;
    }
}
