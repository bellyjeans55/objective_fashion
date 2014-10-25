package userProfile;
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
}
