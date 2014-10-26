package clothing.bottoms;

import clothing.generics.Bottoms;
import clothing.variables.Color;
import clothing.variables.Material;

public class Shorts extends Bottoms {

	public Shorts(Color color, Material material) {
		super(color, material);
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " shorts";
	}
}
