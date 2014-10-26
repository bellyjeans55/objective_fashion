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
			str += singleton.toString();
		} else {
			str += top.toString();
			str += "\n" + bottom.toString();
		}
		str += "\n" + socks.toString();
		str += "\n" + shoes.toString();
		if (outerwear != null) {
			str += "\n" + outerwear.toString();
		}
		if (accessories != null && accessories.length > 0) {
			str += "\n";
			for (int i = 0; i < accessories.length; i++) {
				str += " " + accessories[i].toString();
			}
		}
		return str;
	}
	
}
