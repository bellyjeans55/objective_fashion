package controller;

import clothing.Outfit;
import clothing.accessories.*;
import clothing.bottoms.*;
import clothing.generics.*;
import clothing.outerwear.*;
import clothing.shoes.*;
import clothing.singletons.*;
import clothing.tops.*;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Formality;
import userProfile.Preferences;
import userProfile.UserProfile;
import userProfile.Wardrobe;

/**
 * @author The Squad
 *
 */
public class Controller {
	TheDecider decider;
	UserProfile profile;
	Wardrobe wardrobe; //these field should ultimately be contained in profile. just for testing
	Preferences preferences;
	
	
	public Controller() {
		decider = new TheDecider();
		wardrobe = new Wardrobe();
		preferences = new Preferences(Formality.CASUAL);
		randomPopulateWardrobe();
		profile = new UserProfile(wardrobe, preferences);
	}
	
	public void randomPopulateWardrobe() {
		Accessories ring = new Ring();
		ring.setAppropriateTemperature(AppropriateTemperature.COOL);
		ring.setFormality(Formality.CASUAL);
		wardrobe.addAccessories(ring);
		Bottoms pants = new Pants();
		pants.setAppropriateTemperature(AppropriateTemperature.COOL);
		pants.setFormality(Formality.CASUAL);
		wardrobe.addBottoms(pants);
		Outerwear bomber = new Bomber();
		bomber.setFormality(Formality.CASUAL);
		bomber.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addOuterwear(bomber);
		Shoes boots = new Boots();
		boots.setFormality(Formality.CASUAL);
		boots.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addShoes(boots);
		Singletons romper = new Romper();
		romper.setFormality(Formality.CASUAL);
		romper.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addSingletons(romper);
		Socks socks = new Socks();
		socks.setFormality(Formality.CASUAL);
		socks.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addSocks(socks);
		Tops hoodie = new Hoodie();
		hoodie.setFormality(Formality.CASUAL);
		hoodie.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addTops(hoodie);
	}
	
	/**
	 * Decides outfit.
	 * @return
	 */
	public Outfit decideOutfit() {
		return decider.decideOutfit(accessPreferences(), accessWardrobe());
	}
	
	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
	
	public Wardrobe accessWardrobe() {
		return profile.getWardrobe();
	}
	
	public Preferences accessPreferences() {
		return profile.getPreferences();
	}
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.decideOutfit());
		
	}
	

}
