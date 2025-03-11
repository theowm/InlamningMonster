package com.wigell.Command;

import com.wigell.BusinessObjects.Skirt;

public interface SkirtProcessingCommand {
    Skirt process(Skirt skirt);
}
