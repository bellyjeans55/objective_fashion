package clothing.accessories;

import clothing.generics.Accessories;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;

public class Ring extends Accessories{
	public Ring(Color color) {
		super(color);
		this.formality = Formality.FORMAL;
		this.temperature = AppropriateTemperature.ANY;
	}

	public String toString() {
		return this.getColor().toString() + " ring";
	}
}
