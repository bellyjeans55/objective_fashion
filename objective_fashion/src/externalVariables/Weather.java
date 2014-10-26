package externalVariables;

import de.mbenning.weather.wunderground.api.domain.WeatherStation;
import de.mbenning.weather.wunderground.impl.services.HttpDataReaderService;

public class Weather {
	public static int temperature;
	
	public static void calculateWeather() {
		// create a instance of a wunderground data reader
		HttpDataReaderService dataReader = new HttpDataReaderService();

		// select a wunderground weather station (ID "KMABOSTO32" = somewhere)
		WeatherStation weatherStation = new WeatherStation("KNCCHAPE17");

		// set selected weather station to data reader
		dataReader.setWeatherStation(weatherStation);
		
		// set temperature
		temperature = dataReader.getCurrentData().getTemperature().intValue();
		
	}
	
	
	public int getTemperature() {
		return temperature;
	}

}
