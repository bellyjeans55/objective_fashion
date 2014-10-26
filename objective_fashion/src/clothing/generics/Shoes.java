package clothing.generics;

import clothing.variables.Color;
import clothing.variables.Material;

public abstract class Shoes extends Clothing {
	public Shoes (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
}
