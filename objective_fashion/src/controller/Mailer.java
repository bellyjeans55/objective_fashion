package controller;

import clothing.Outfit;

public class Mailer {
static Outfit outfit;

	public static void sendOutfit(Outfit outfit) {
		Mailer.outfit=outfit;
		
	}

}
