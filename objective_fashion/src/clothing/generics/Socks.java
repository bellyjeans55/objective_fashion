package clothing.generics;

import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Socks extends Clothing {
	public Socks (Color color, Formality formality, AppropriateTemperature temperature, Material material) {
		super(color, formality, temperature);
		this.material = material;
	}
	
	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " socks";
	}
}
