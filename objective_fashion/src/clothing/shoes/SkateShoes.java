package clothing.shoes;

import clothing.generics.Shoes;

public class SkateShoes extends Shoes {
	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " skate shoes";
	}
}
