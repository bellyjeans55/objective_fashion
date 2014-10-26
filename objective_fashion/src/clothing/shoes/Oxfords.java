package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Oxfords extends Shoes {

	public Oxfords(Color color, Material material) {
		super(color, material);
		this.formality = Formality.BUSINESS_CASUAL;
	}

	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " oxfords";
	}
}
