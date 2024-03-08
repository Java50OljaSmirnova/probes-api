package telran.probes.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import static telran.probes.messages.ValidationErrorMessages.*;

public record SensorRange(@NotNull(message = MISSING_SENSOR_ID) long id, 
		@Valid @NotNull(message = MISSING_RANGE) Range range) {

}
