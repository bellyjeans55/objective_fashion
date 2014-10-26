package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class BasketballShoes extends Shoes {

	public BasketballShoes(Color color, Material material) {
		super(color, material);
		this.formality = Formality.CASUAL;
	}

	public String toString() {
		return this.getColor().toString() + " basketball shoes";
	}
}
