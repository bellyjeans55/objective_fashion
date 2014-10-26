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
	
	public Tops getTop() {return top;}
	public Bottoms getBottom() {return bottom;}
	public Socks getSocks() {return socks;}
	public Shoes getShoes() {return shoes;}
	public Outerwear getOuterwear() {return outerwear;}
	public Singletons getSingleton() {return singleton;}
	public Accessories[] getAccessories() {return accessories;}
	
	/**
	 * string representation of outfit
	 */
	public String toString() {
		String str = "";
		if (singleton != null) {
			str += singleton.toString();
		} else {
			if (top != null)
				str += top.toString();
			if (bottom != null)
				str += "\n" + bottom.toString();
		}
		if (socks != null)
			str += "\n" + socks.toString();
		if (shoes != null)
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
