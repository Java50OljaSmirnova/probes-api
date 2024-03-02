package telran.probes.exceptions;

import telran.probes.messages.ErrorMessages;

@SuppressWarnings("serial")
public class SensorNotFoundException extends NotFoundException {

	public SensorNotFoundException() {
		super(ErrorMessages.SENSOR_NOT_FOUND);
	}

}
