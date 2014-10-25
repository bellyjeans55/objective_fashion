package userProfile;

import clothing.variables.Formality;

public class Preferences {
	Formality formality;
	
	public Preferences(Formality formality) {
		this.formality = formality;
	}
	
	public Formality getFormality() {
		return formality;
	}
}
