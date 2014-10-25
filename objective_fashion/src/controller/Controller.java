package controller;

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
	
	
	public Controller() {
		decider = new TheDecider();
	}
	
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
	

}
