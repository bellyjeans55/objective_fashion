package clothing.generics;

import clothing.variables.Color;
import clothing.variables.Material;

public abstract class Tops extends Clothing {
	public Tops (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
}