package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.Color;
import clothing.variables.Material;

public class ButtonUp extends Tops {

	public ButtonUp(Color color, Material material) {
		super(color, material);
	}
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " button up";
	}
}
