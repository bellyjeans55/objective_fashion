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
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;
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
		Bottoms pants = new Pants(Color.BLACK, Material.DENIM);
		pants.setAppropriateTemperature(AppropriateTemperature.COOL);
		pants.setFormality(Formality.CASUAL);
		wardrobe.addBottoms(pants);
		Outerwear bomber = new Bomber(Color.BLACK, Material.SUEDE);
		bomber.setFormality(Formality.CASUAL);
		bomber.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addOuterwear(bomber);
		Shoes boots = new Boots(Color.BLACK, Material.LEATHER);
		boots.setFormality(Formality.CASUAL);
		boots.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addShoes(boots);
		Singletons romper = new Romper(Color.RED, Material.FLANNEL);
		romper.setFormality(Formality.CASUAL);
		romper.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addSingletons(romper);
		Socks socks = new Socks(Color.GREY, Material.WOOL);
		socks.setFormality(Formality.CASUAL);
		socks.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addSocks(socks);
		Tops buttonup = new ButtonUp(Color.WHITE, Material.LEATHER);
		buttonup.setFormality(Formality.CASUAL);
		buttonup.setAppropriateTemperature(AppropriateTemperature.COOL);
		wardrobe.addTops(buttonup);
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
