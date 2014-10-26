package clothing.outerwear;

import clothing.generics.Outerwear;
import clothing.variables.Color;
import clothing.variables.Material;

public class Topcoat extends Outerwear {

	public Topcoat(Color color, Material material) {
		super(color, material);
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " coat";
	}
}
