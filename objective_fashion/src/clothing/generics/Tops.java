package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public abstract class Tops extends Clothing {
	public Tops (Color color, Material material) {
		super(color);
		this.material = material;
	}
}