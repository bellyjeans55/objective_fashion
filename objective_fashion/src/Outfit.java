import java.util.ArrayList;

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
	ArrayList<Accessories> theAccessories; //array list to add multiple accessories
	
	
	//constructor passes already created objects from wardrobe
	public Outfit(Tops top, Bottoms bottom, Socks sock, Shoes shoes, Outerwear outerwear, Singletons singleton, Accessories[] accessories) {
		theTop=top;
		theBottom=bottom;
		theSocks=sock;
		theShoes=shoes;
		theOuterwear=outerwear;
		theSingleton=singleton;
	//accessories loop to add all items
		for (int i=0; i < accessories.length; i++) {
			theAccessories.add(accessories[i]);
		}
		
	}
	
	
}
