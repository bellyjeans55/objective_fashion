package userProfile;

import java.util.Iterator;
import java.util.Vector;

import clothing.generics.Bottoms;
import clothing.generics.Outerwear;
import clothing.generics.Shoes;
import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Formality;

public class Wardrobe {
	Vector<Bottoms> bottoms;
	Vector<Outerwear> outerwear;
	Vector<Shoes> shoes;
	Vector<Tops> tops;
	
	public Vector<Bottoms> getBottoms(AppropriateTemperature temp, Formality formality) {
		Vector<Bottoms> appropriateBottoms = new Vector<Bottoms>();
		Iterator<Bottoms> iterator = bottoms.iterator();
		
		while(iterator.hasNext()) {
			Bottoms item = iterator.next();
			if(item.getFormality() == formality 
					&& item.getAppropriateTemperature() == temp) {
				appropriateBottoms.add(item);
			}
		}
		return appropriateBottoms;
	}
	
	public Vector<Outerwear> getOuterwear(AppropriateTemperature temp, Formality formality) {
		Vector<Outerwear> appropriateOuterwear = new Vector<Outerwear>();
		Iterator<Outerwear> iterator = outerwear.iterator();
		
		while(iterator.hasNext()) {
			Outerwear item = iterator.next();
			if(item.getFormality() == formality 
					&& item.getAppropriateTemperature() == temp) {
				appropriateOuterwear.add(item);
			}
		}
		return appropriateOuterwear;
	}
	
	public Vector<Shoes> getShoes(AppropriateTemperature temp, Formality formality) {
		Vector<Shoes> appropriateShoes = new Vector<Shoes>();
		Iterator<Shoes> iterator = shoes.iterator();
		
		while(iterator.hasNext()) {
			Shoes item = iterator.next();
			if(item.getFormality() == formality 
					&& item.getAppropriateTemperature() == temp) {
				appropriateShoes.add(item);
			}
		}
		return appropriateShoes;
	}
	
	public Vector<Tops> getTops(AppropriateTemperature temp, Formality formality) {
		Vector<Tops> appropriateTops = new Vector<Tops>();
		Iterator<Tops> iterator = tops.iterator();
		
		while(iterator.hasNext()) {
			Tops item = iterator.next();
			if(item.getFormality() == formality 
					&& item.getAppropriateTemperature() == temp) {
				appropriateTops.add(item);
			}
		}
		return appropriateTops;
	}
}