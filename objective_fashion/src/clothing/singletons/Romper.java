package clothing.singletons;

import clothing.generics.Singletons;
import clothing.variables.Color;
import clothing.variables.Material;

public class Romper extends Singletons{

	public Romper(Color color, Material material) {
		super(color, material);
	}
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " romper";
	}
}
