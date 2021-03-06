package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Boots extends Shoes {

	public Boots(Color color, Material material) {
		super(color, material);
		this.formality = Formality.CASUAL;
	}

	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " boots";
	}
}
