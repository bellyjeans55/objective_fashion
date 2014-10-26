package userProfile;

import clothing.generics.Clothing;

public class UserProfile {
	Wardrobe wardrobe;
	Preferences preferences;
	
	public UserProfile(Wardrobe wardrobe, Preferences preferences) {
		this.wardrobe = wardrobe;
		this.preferences = preferences;
	}
	
	public Wardrobe getWardrobe() {
		return wardrobe;
	}
	
	public Preferences getPreferences() {
		return preferences;
	}
	
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}
	
	public void addToWardrobe(Clothing article) {
		wardrobe.addToWardrobe(article);
	}
}
