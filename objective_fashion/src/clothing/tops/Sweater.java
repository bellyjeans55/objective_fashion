package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.Color;
import clothing.variables.Material;

public class Sweater extends Tops {

	public Sweater(Color color, Material material) {
		super(color, material);
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " sweater";
	}
}
