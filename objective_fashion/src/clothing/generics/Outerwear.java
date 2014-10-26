package clothing.generics;

import clothing.variables.Color;
import clothing.variables.Material;

public abstract class Outerwear extends Clothing {
	public Outerwear (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
}
