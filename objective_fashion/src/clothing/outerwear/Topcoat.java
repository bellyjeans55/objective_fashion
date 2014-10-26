package clothing.outerwear;

import clothing.generics.Outerwear;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Topcoat extends Outerwear {

	public Topcoat(Color color, Material material) {
		super(color, material);
		this.formality = Formality.SMART_CASUAL;
		this.temperature = AppropriateTemperature.COLD;
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " coat";
	}
}
