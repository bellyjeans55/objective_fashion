package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Sweatshirt extends Tops {
	
	public Sweatshirt(Color color, Material material) {
		super(color, material);
		this.formality = Formality.CASUAL;
		this.temperature = AppropriateTemperature.COOL;
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " sweatshirt";
	}
}
