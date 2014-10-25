package controller;

import externalVariables.Weather;

/**
 * State of the decider. Provides the decider a state from which to create outfits based on
 * external variables.
 * @author User
 *
 */
public class State {
	Weather weather;
	TemperatureState temperatureState;
	public enum TemperatureState {
		VERY_HOT, HOT, WARM, COOL, COLD, VERY_COLD;
	}
	
	public State() {
		weather = new Weather();
		temperatureState = null;
	}
	
	/**
	 * calculates weather state based on temperature
	 */
	public void calculateTemperatureState() {
		int temp = weather.getTemperature();
		if (weather.getTemperature() < 20)
			temperatureState = TemperatureState.VERY_COLD;
		else if (weather.getTemperature() < 40)
			temperatureState = TemperatureState.COLD;
		else if (weather.getTemperature() < 55)
			temperatureState = TemperatureState.COOL;
		else if (weather.getTemperature() < 70)
			temperatureState = TemperatureState.WARM;
		else if (weather.getTemperature() < 85)
			temperatureState = TemperatureState.HOT;
		else
			temperatureState = TemperatureState.VERY_HOT;
	}
	
	public TemperatureState getTemperatureState() {
		return temperatureState;
	}
}
