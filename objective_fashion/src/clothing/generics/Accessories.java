package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;

public abstract class Accessories extends Clothing {
	public Accessories(Color color, Formality formality, AppropriateTemperature temperature) {
		super(color, formality, temperature);
	}
}