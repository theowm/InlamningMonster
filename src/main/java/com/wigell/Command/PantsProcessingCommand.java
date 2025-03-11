package com.wigell.Command;

import com.wigell.BusinessObjects.Pants;

public interface PantsProcessingCommand {
    Pants process(Pants pants);
}
