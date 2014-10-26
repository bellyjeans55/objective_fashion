package clothing.bottoms;

import clothing.generics.Bottoms;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Skirt extends Bottoms {

	public Skirt(Color color, Formality formality,
			AppropriateTemperature temperature, Material material) {
		super(color, formality, temperature, material);
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " skirt";
	}
}
