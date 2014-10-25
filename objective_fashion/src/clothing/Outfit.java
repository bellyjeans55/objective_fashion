package clothing;
import clothing.generics.Accessories;
import clothing.generics.Bottoms;
import clothing.generics.Outerwear;
import clothing.generics.Shoes;
import clothing.generics.Singletons;
import clothing.generics.Socks;
import clothing.generics.Tops;


public class Outfit {
	Tops theTop;
	Bottoms theBottom;
	Socks theSocks;
	Shoes theShoes;
	Outerwear theOuterwear;
	Singletons theSingleton;
	Accessories[] theAccessories; //array to add multiple accessories
	
	
	//constructor passes already created objects from wardrobe
	public Outfit(Tops top, Bottoms bottom, Socks sock, Shoes shoes, Outerwear outerwear, Singletons singleton, Accessories[] accessories) {
		theTop=top;
		theBottom=bottom;
		theSocks=sock;
		theShoes=shoes;
		theOuterwear=outerwear;
		theSingleton=singleton;
		theAccessories=accessories;
	
		
	}
	
	/**
	 * string representation of outfit
	 */
	public String toString() {
		String str = "";
		str += theTop.toString() + "\n------------------\n";
		str += theBottom.toString() + "\n------------------\n";
		str += theSocks.toString() + "\n------------------\n";
		str += theShoes.toString() + "\n------------------\n";
		str += theOuterwear.toString() + "\n------------------\n";
		str += theSingleton.toString() + "\n------------------\n";
		str += theAccessories.toString() + "\n------------------\n";
		return str;
	}
	
	
}
