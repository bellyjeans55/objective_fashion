package webview;

import org.w3c.dom.Element;

import javafx.scene.web.WebEngine;
import clothing.variables.Formality;
import controller.Controller;
import userProfile.Preferences;

public class Bridge {
	Controller controller;
	WebEngine webEngine;
	
	public Bridge(Controller controller, WebEngine webEngine) {
		this.controller = controller;
		this.webEngine = webEngine;
	}
	public void action() {
		controller.sendOutfit(new Preferences(getFormality()), getEmail());
	}
	
	private Formality getFormality() {
		webEngine.executeScript("alert($('#preferences_selector').val())");
		return null;
	}
	private String getEmail() {
		return null;
	}
}
