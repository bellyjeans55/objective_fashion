package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Sweater extends Tops {

	
	public Sweater(Color color, Material material) {
		super(color, material);
		this.formality = Formality.SMART_CASUAL;
		this.temperature = AppropriateTemperature.COLD;
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " sweater";
	}
}
