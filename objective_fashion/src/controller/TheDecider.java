package controller;

import clothing.generics.Accessories;
import clothing.generics.Bottoms;
import clothing.generics.Outerwear;
import clothing.generics.Shoes;
import clothing.generics.Singletons;
import clothing.generics.Socks;
import controller.State.TemperatureState;
import clothing.tops.*;

public class TheDecider {
	State state;
	
	/**
	 * Based on variables, intelligently instantiate one outfit and return it.
	 * @param preferences
	 * @param wardrobe
	 * @return
	 */
	public Outfit decideOutfit(Preferences preferences, Wardrobe wardrobe) {
		TemperatureState temperature = state.getTemperatureState();
		switch (temperature) {
		case VERY_COLD: return createColdOutfit(); //these method calls are very abstract for now 
		break;
		case COLD: return createColdOutfit();  
		break;
		case COOL: return createColdOutfit(); 
		break;
		case WARM: return createHotOutfit(); 
		break;
		case HOT: return createHotOutfit();  
		break;
		case VERY_HOT: return createHotOutfit(); 
		break;
		}
	}
	
	public Outfit createColdOutfit() {
		return new Outfit(new Bomber(), Bottoms bottom, Socks sock, Shoes shoes, Outerwear outerwear, Singletons singleton, Accessories[] accessories)
	}
	
	public Outfit createHotOutfit() {
		
	}
}
