package clothing.outerwear;
import clothing.generics.Outerwear;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Color;
import clothing.variables.Formality;
import clothing.variables.Material;

public class Bomber extends Outerwear {

	public Bomber(Color color, Material material) {
		super(color, material);
		this.formality = Formality.CASUAL;
		this.temperature = AppropriateTemperature.COOL;
	}

	public String toString() {
		return this.getColor().toString() + " "
				+ this.getMaterial().toString().toLowerCase() + " bomber";
	}
}
