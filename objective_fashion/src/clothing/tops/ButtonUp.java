package clothing.tops;

import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class ButtonUp extends Tops {

	public ButtonUp(Color color, Material material) {
		super(color, material);
		if (material == Material.BROADCLOTH) {
			this.formality = Formality.SMART_CASUAL;
			this.temperature = AppropriateTemperature.WARM;
		} else if (material == Material.PINPOINT) {
			this.formality = Formality.FORMAL;
			this.temperature = AppropriateTemperature.WARM;
		} else {
			this.formality = Formality.CASUAL;
			this.temperature = AppropriateTemperature.COOL;
		}
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " button up";
	}
}
