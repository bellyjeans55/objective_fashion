package clothing.generics;

import clothing.variables.Color;
import clothing.variables.Material;

public class Socks extends Clothing {
	public Socks (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " socks";
	}
}
