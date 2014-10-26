package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public abstract class Outerwear extends Clothing {
	public Outerwear (Color color, Formality formality, AppropriateTemperature temperature, Material material) {
		super(color, formality, temperature);
		this.material = material;
	}
}
