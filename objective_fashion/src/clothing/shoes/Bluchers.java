package clothing.shoes;

import clothing.generics.Shoes;

public class Bluchers extends Shoes {
	public String toString() {
		return this.getColor().toString()
				+ " " + this.getMaterial().toString().toLowerCase() + " bluchers";
	}
}
