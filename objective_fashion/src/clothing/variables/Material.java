package clothing.variables;

public enum Material {
	BROADCLOTH, CANVAS, CHINO, COTTON, DENIM, FLANNEL, LEATHER, OXFORD, SUEDE, WOOL;

public String toString() {
	String str = "";
	switch(this) {
	case BROADCLOTH: str = "Breadcloth";
		break;
	case CANVAS: str = "Canvas";
		break;
	case CHINO: str = "Chino";
		break;
	case COTTON: str = "Cotton";
		break;
	case DENIM: str = "Denim";
		break;
	case FLANNEL: str = "Flannel";
		break;
	case LEATHER: str = "Leather";
		break;
	case OXFORD: str = "Oxford";
		break;
	case SUEDE: str = "Suede";
		break;
	case WOOL: str = "Wool";
		break;
	default:
		break;
	}
	return str;
}
}
