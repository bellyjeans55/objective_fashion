package clothing.outerwear;

import clothing.generics.Outerwear;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Parka extends Outerwear {

	public Parka(Color color, Material material) {
		super(color, material);
		this.formality = Formality.CASUAL;
		this.temperature = AppropriateTemperature.COLD;
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " parka";
	}
}
