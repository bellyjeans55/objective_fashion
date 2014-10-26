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
	Weather weather;
	AppropriateTemperature temperatureState;
	
	public State() {
		weather = new Weather(50);
		calculateTemperatureState();
	}
	
	/**
	 * calculates weather state based on temperature
	 */
	public void calculateTemperatureState() {
		int temp = weather.getTemperature();
		if (weather.getTemperature() < 20)
			temperatureState = AppropriateTemperature.VERY_COLD;
		else if (weather.getTemperature() < 40)
			temperatureState = AppropriateTemperature.COLD;
		else if (weather.getTemperature() < 55)
			temperatureState = AppropriateTemperature.COOL;
		else if (weather.getTemperature() < 70)
			temperatureState = AppropriateTemperature.WARM;
		else if (weather.getTemperature() < 85)
			temperatureState = AppropriateTemperature.HOT;
		else
			temperatureState = AppropriateTemperature.VERY_HOT;
	}
	
	public AppropriateTemperature getTemperatureState() {
		return temperatureState;
	}
}
