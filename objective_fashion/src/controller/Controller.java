package controller;

import clothing.Outfit;
import clothing.accessories.*;
import clothing.bottoms.*;
import clothing.generics.*;
import clothing.outerwear.*;
import clothing.shoes.*;
import clothing.singletons.*;
import clothing.tops.*;
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
		wardrobe.addAccessories(new Ring());
		wardrobe.addBottoms(new Pants());
		wardrobe.addOuterwear(new Bomber());
		wardrobe.addShoes(new Boots());
		wardrobe.addSingletons(new Romper());
		wardrobe.addSocks(new Socks());
		wardrobe.addTops(new Hoodie());
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
