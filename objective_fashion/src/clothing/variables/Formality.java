package clothing.variables;

// dunno how to handle things being in multiple categories. suggestions?

public enum Formality {
	/**
	 * Examples:
	 *  Casual - tank top, tee shirt, jeans, chinos, sneakers
	 *  Smart casual - derbies, chinos, wool pants, bluchers, wingtips
	 *  Bizcaz - blazer, oxford shoes, dressier pants
	 *  Formal - suit, oxford shoes, heads of your enemies
	 */
	CASUAL, SMART_CASUAL, BUSINESS_CASUAL, FORMAL;
	
	public String toString() {
		String str = "";
		switch(this) {
		case BUSINESS_CASUAL: str = "Business Casual";
			break;
		case CASUAL: str = "Casual";
			break;
		case FORMAL: str = "Formal";
			break;
		case SMART_CASUAL: str = "Smart Casual";
			break;
		default:
			break;
		}
		return str;
	}
}
