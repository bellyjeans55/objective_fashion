package GUI;

import javax.swing.DefaultListModel;

import userProfile.Preferences;
import clothing.generics.Clothing;

public class GUIController {
	private InformationActionPanel informationActionPanel;
    private WardrobePanel wardrobePanel;
    private AddItemPanel addItemPanel;
    private DefaultListModel wardrobeModel;
    
    
	public GUIController(InformationActionPanel informationActionPanel, 
			WardrobePanel wardrobePanel, AddItemPanel addItemPanel) {
		this.informationActionPanel = informationActionPanel;
		this.wardrobePanel = wardrobePanel;
		this.addItemPanel = addItemPanel;
		wardrobeModel = (DefaultListModel) wardrobePanel.getWardrobeList().getModel();
	}
	
	public void addToWardrobe(Clothing article) {
		wardrobeModel.addElement(article);
	}
	
	public String getEmail() {
		return informationActionPanel.getEmail();
	}
	
	public Preferences getPreferences() {
		Preferences pref = new Preferences(informationActionPanel.getFormality());
		return pref;
	}
}
