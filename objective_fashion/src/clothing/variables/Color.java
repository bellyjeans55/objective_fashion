package clothing.variables;

public enum Color {
	BLACK, BLUE, BROWN, BURGUNDY, DARK_BLUE, DARK_GREEN, GREEN, 
	GREY, LIGHT_BLUE, LIGHT_GREEN, ORANGE, PINK, PURPLE, RED, 
	TAN, YELLOW, WHITE;
	
	public String toString() {
		String colorString = "";
		switch (this) {
		case BLACK: colorString = "Black";
			break;
		case BLUE: colorString = "Blue";
			break;
		case BROWN: colorString = "Brown";
			break;
		case BURGUNDY: colorString = "Burgundy";
			break;
		case DARK_BLUE: colorString = "Dark blue";
			break;
		case DARK_GREEN: colorString = "Dark green";
			break;
		case GREEN: colorString = "Green";
			break;
		case GREY: colorString = "Grey";
			break;
		case LIGHT_BLUE: colorString = "Light blue";
			break;
		case LIGHT_GREEN: colorString = "Light green";
			break;
		case ORANGE: colorString = "Orange";
			break;
		case PINK: colorString = "Pink";
			break;
		case PURPLE: colorString = "Purple";
			break;
		case RED: colorString = "Red";
			break;
		case TAN: colorString = "Tan";
			break;
		case WHITE: colorString = "White";
			break;
		case YELLOW: colorString = "Yellow";
			break;
		}
		return colorString;
	}
}