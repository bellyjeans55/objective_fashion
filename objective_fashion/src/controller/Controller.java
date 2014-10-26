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
	String outfitWarnings;
	
	public Controller() {
		decider = new TheDecider();
		profile = new UserProfile(new Wardrobe(), new Preferences(null));
	}
	
	public UserProfile getUserProfile() {
		return profile;
	}
	
	public void addToWardrobe(Clothing article) {
		profile.getWardrobe().addToWardrobe(article);
	}
	
//	public void randomPopulateWardrobe() {
//		Accessories ring = new Ring(Color.GREY);
//		wardrobe.addAccessories(ring);
//		Bottoms pants = new Pants(Color.BLACK, Material.DENIM);
//		wardrobe.addBottoms(pants);
//		Outerwear bomber = new Bomber(Color.BLACK, Material.SUEDE);
//		wardrobe.addOuterwear(bomber);
//		Shoes boots = new Boots(Color.BLACK, Material.LEATHER);
//		wardrobe.addShoes(boots);
//		Singletons romper = new Romper(Color.RED, Material.FLANNEL);
//		wardrobe.addSingletons(romper);
//		Socks socks = new Socks(Color.GREY, Material.WOOL);
//		wardrobe.addSocks(socks);
//		Tops buttonup = new ButtonUp(Color.WHITE, Material.LEATHER);
//		wardrobe.addTops(buttonup);
//	}
	
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
	
	public void sendOutfit(Preferences preferences, String email) {
		profile.setPreferences(preferences);
		Outfit outfit = decideOutfit();
		outfitWarnings = "";
		if ((State.getTemperatureState() == AppropriateTemperature.COLD
				|| State.getTemperatureState() == AppropriateTemperature.COOL
				|| State.getTemperatureState() == AppropriateTemperature.VERY_COLD)
				&& outfit.getOuterwear() == null)
			outfitWarnings += "\nYou need new outerwear.";
		if (outfit.getBottom() == null)
			outfitWarnings += "\nYou need new pants.";;
		if (outfit.getShoes() == null)
			outfitWarnings += "\nYou need new shoes.";;
		if (outfit.getTop() == null)
			outfitWarnings += "\nYou need a new top.";;
		if (outfit.getSocks() == null)
			outfitWarnings += "\nYou need new socks.";;
		profile.setPreferences(preferences);
		Mailer.sendOutfit(outfit, outfitWarnings, email);
	}
	

}
