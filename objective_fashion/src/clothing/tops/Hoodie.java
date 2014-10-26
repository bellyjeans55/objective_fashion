package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.Color;
import clothing.variables.Material;

public class Hoodie extends Tops {

	public Hoodie(Color color, Material material) {
		super(color, material);
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " hoodie";
	}
}
