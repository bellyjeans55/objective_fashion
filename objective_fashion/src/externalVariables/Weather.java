package externalVariables;

import de.mbenning.weather.wunderground.api.domain.WeatherStation;
import de.mbenning.weather.wunderground.impl.services.HttpDataReaderService;

public class Weather {
	public static int temperature;
	public static int rain;
	

	
	private static void calculateWeather() {
		// create a instance of a wunderground data reader
		HttpDataReaderService dataReader = new HttpDataReaderService();

		// select a wunderground weather station (ID "KNCCHAPE17" = Cosgrove Hill, Chapel Hill
		WeatherStation weatherStation = new WeatherStation("KNCCHAPE17");

		// set selected weather station to data reader
		dataReader.setWeatherStation(weatherStation);
		
		// set temperature and rain
		temperature = dataReader.getCurrentData().getTemperature().intValue();
		rain = dataReader.getCurrentData().getRainRateHourlyMm().intValue();
	}
	
	
	public static int getTemperature() {
		calculateWeather();
		return temperature;
	}
	
	public static int getRain() {
		calculateWeather();
		return rain;
	}

}
