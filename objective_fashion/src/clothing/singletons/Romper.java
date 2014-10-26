package clothing.singletons;

import clothing.generics.Singletons;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Romper extends Singletons{

	public Romper(Color color, Formality formality,
			AppropriateTemperature temperature, Material material) {
		super(color, formality, temperature, material);
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " romper";
	}
}
