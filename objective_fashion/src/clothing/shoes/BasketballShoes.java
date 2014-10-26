package clothing.shoes;

import clothing.generics.Shoes;
import clothing.variables.Color;
import clothing.variables.Material;

public class BasketballShoes extends Shoes {
	public BasketballShoes(Color color, Material material) {
		super(color, material);
	}

	public String toString() {
		return this.getColor().toString() + " basketball shoes";
	}
}
