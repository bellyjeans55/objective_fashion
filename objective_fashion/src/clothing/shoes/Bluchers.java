package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Bluchers extends Shoes {

	public Bluchers(Color color, Formality formality,
			AppropriateTemperature temperature, Material material) {
		super(color, formality, temperature, material);
	}

	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " bluchers";
	}
}
