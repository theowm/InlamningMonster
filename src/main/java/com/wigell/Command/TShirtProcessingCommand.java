package com.wigell.Command;

import com.wigell.BusinessObjects.TShirt;

public interface TShirtProcessingCommand {
    TShirt process(TShirt tshirt);
}
