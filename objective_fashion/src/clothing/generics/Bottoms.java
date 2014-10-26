package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public abstract class Bottoms extends Clothing {
	public Bottoms (Color color, Material material) {
		super(color);
		this.material = material;
		if (material == Material.WOOL) {
			formality = Formality.SMART_CASUAL;
			temperature = AppropriateTemperature.COLD;
		} else {
			formality = Formality.CASUAL;
			temperature = AppropriateTemperature.COOL;
		}
	}
}
