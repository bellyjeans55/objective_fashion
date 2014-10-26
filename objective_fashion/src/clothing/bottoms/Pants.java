package clothing.bottoms;

import clothing.generics.Bottoms;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Pants extends Bottoms {

	
	public Pants(Color color, Material material) {
		super(color, material);
	}

	public String toString() {
		String output = "";
		if (this.getMaterial() == Material.DENIM)
			output = this.getColor().toString() + " jeans";
		else
			output = this.getColor().toString() + " "
					+ this.getMaterial().toString().toLowerCase() + " pants";
		return output;
	}
}