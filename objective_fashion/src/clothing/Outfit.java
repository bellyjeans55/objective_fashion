package clothing;
import clothing.generics.Accessories;
import clothing.generics.Bottoms;
import clothing.generics.Outerwear;
import clothing.generics.Shoes;
import clothing.generics.Singletons;
import clothing.generics.Socks;
import clothing.generics.Tops;


public class Outfit {
	Tops top;
	Bottoms bottom;
	Socks socks;
	Shoes shoes;
	Outerwear outerwear;
	Singletons singleton;
	Accessories[] accessories; //array to add multiple accessories
	
	
	//constructor passes already created objects from wardrobe
	public Outfit(Tops top, Bottoms bottom, Socks sock, Shoes shoes, Outerwear outerwear, Singletons singleton, Accessories[] accessories) {
		this.top=top;
		this.bottom=bottom;
		this.socks=sock;
		this.shoes=shoes;
		this.outerwear=outerwear;
		this.singleton=singleton;
		this.accessories=accessories;
	}
	
	/**
	 * string representation of outfit
	 */
	public String toString() {
		String str = "";
		if (singleton != null) {
			str += "One piece: " + singleton.toString();
		} else {
			str += "Top: " + top.toString();
			str += "\nBottom: " + bottom.toString();
		}
		str += "\nSocks: " + socks.toString();
		str += "\nShoes: " + shoes.toString();
		if (outerwear != null) {
			str += "\nOuterwear: " + outerwear.toString();
		}
		if (accessories != null && accessories.length > 0) {
			str += "\nAccessories:";
			for (int i = 0; i < accessories.length; i++) {
				str += " " + accessories[i].toString();
			}
		}
		return str;
	}
	
}
