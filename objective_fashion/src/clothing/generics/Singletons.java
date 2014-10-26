package clothing.generics;

import clothing.variables.Color;
import clothing.variables.Material;

public abstract class Singletons extends Clothing {
	public Singletons (Color color, Material material) {
		this.color = color;
		this.material = material;
	}
}
