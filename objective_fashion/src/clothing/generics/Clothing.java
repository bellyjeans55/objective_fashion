package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public abstract class Clothing {
	protected AppropriateTemperature temperature;
	Color color;
	protected Formality formality;
	Material material;
	Boolean rainwear;
	
	public Clothing(Color color) {
		this.color = color;
	}
	
	
	public AppropriateTemperature getAppropriateTemperature() {
		return temperature;
	}
	
	public void setAppropriateTemperature(AppropriateTemperature temperature) {
		this.temperature = temperature;
	}
	
	public void setFormality(Formality formality) {
		this.formality = formality;
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