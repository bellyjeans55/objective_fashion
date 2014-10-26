package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.Color;
import clothing.variables.Material;

public class Boots extends Shoes {
	public Boots(Color color, Material material) {
		super(color, material);
	}

	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " boots";
	}
}
