package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public abstract class Singletons extends Clothing {
	public Singletons (Color color, Material material) {
		super(color);
		this.material = material;
	}
}
