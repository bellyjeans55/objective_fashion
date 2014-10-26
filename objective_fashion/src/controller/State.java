package controller;
import clothing.variables.AppropriateTemperature;
import externalVariables.Weather;

/**
 * State of the decider. Provides the decider a state from which to create outfits based on
 * external variables.
 * @author User
 *
 */
public class State {

	/**
	 * calculates weather state based on temperature
	 */
	private static AppropriateTemperature calculateTemperatureState() {
		AppropriateTemperature temperatureState;
		int temperature = Weather.getTemperature();
		if (temperature < 20)
			temperatureState = AppropriateTemperature.VERY_COLD;
		else if (temperature < 40)
			temperatureState = AppropriateTemperature.COLD;
		else if (temperature < 55)
			temperatureState = AppropriateTemperature.COOL;
		else if (temperature < 70)
			temperatureState = AppropriateTemperature.WARM;
		else if (temperature < 85)
			temperatureState = AppropriateTemperature.HOT;
		else
			temperatureState = AppropriateTemperature.VERY_HOT;
		return temperatureState;
	}
	
	public static AppropriateTemperature getTemperatureState() {
		return calculateTemperatureState();
	}
}
