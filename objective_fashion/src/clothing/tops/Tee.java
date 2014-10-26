package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Tee extends Tops {
	Boolean graphic; // is it a graphic tee?
	
	public Tee(Color color, Formality formality,
			AppropriateTemperature temperature, Material material) {
		super(color, formality, temperature, material);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " tee shirt";
	}
}
