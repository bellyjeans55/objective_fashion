package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.Color;
import clothing.variables.Material;

public class Bluchers extends Shoes {
	public Bluchers(Color color, Material material) {
		super(color, material);
	}

	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " bluchers";
	}
}
