package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Tee extends Tops {
	Boolean graphic; // is it a graphic tee?
	
	public Tee(Color color, Material material) {
		super(color, material);
		this.formality = Formality.CASUAL;
		this.temperature = AppropriateTemperature.HOT;
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " tee shirt";
	}
}
