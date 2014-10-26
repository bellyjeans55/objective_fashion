package clothing.generics;

import clothing.variables.Color;
import clothing.variables.Material;

public abstract class Bottoms extends Clothing {
	public Bottoms (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
}
