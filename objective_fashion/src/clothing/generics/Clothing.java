package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public abstract class Clothing {
	AppropriateTemperature temperature;
	Color color;
	Formality formality;
	Material material;
	Boolean rainwear;
	
	public AppropriateTemperature getAppropriateTemperature() {
		return temperature;
	}
	public Color getColor() {
		return color;
	}
	
	public Formality getFormality() {
		return formality;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	public Boolean isRainwear() {
		return rainwear;
	}
	
	public String toString() {
		return "Appropriate Temp: " + temperature + "\nColor: " + color
				+ "\nFormality: " + formality + "\nMaterial: " + material
				+ "\nIs rainwear: " + rainwear;
	}
}