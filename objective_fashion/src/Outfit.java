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
	
	
}
