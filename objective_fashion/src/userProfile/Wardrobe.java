package userProfile;

import java.util.Iterator;
import java.util.Vector;

import clothing.generics.Accessories;
import clothing.generics.Bottoms;
import clothing.generics.Outerwear;
import clothing.generics.Shoes;
import clothing.generics.Singletons;
import clothing.generics.Socks;
import clothing.generics.Tops;
import clothing.variables.AppropriateTemperature;
import clothing.variables.Formality;

public class Wardrobe {
	Vector<Accessories> accessories;
	Vector<Bottoms> bottoms;
	Vector<Outerwear> outerwear;
	Vector<Shoes> shoes;
	Vector<Singletons> singletons;
	Vector<Socks> socks;
	Vector<Tops> tops;
	
	public Wardrobe() {
		accessories = new Vector<Accessories>();
		bottoms = new Vector<Bottoms>();
		outerwear = new Vector<Outerwear>();
		shoes = new Vector<Shoes>();
		singletons = new Vector<Singletons>();
		socks = new Vector<Socks>();
		tops = new Vector<Tops>();
	}
	
	public void addAccessories(Accessories accessory) {
		accessories.addElement(accessory);
	}
	
	public void addBottoms(Bottoms bottoms) {
		this.bottoms.addElement(bottoms);
	}
	
	public void addOuterwear(Outerwear outerwear) {
		this.outerwear.addElement(outerwear);
	}
	
	public void addShoes(Shoes shoes) {
		this.shoes.addElement(shoes);
	}
	
	public void addSingletons(Singletons singleton) {
		singletons.addElement(singleton);
	}
	
	public void addSocks(Socks socks) {
		this.socks.addElement(socks);
	}
	
	public void addTops(Tops top) {
		tops.addElement(top);
	}
	
	public Vector<Accessories> getAccessories() {
		return accessories;
	}
	
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
		if(appropriateBottoms.isEmpty()) {
			iterator = bottoms.iterator();
			while(iterator.hasNext()) {
				Bottoms item = iterator.next();
				if(item.getFormality() == formality) {
					appropriateBottoms.add(item);
				}
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
		if(appropriateOuterwear.isEmpty()) {
			iterator = outerwear.iterator();
			while(iterator.hasNext()) {
				Outerwear item = iterator.next();
				if(item.getFormality() == formality) {
					appropriateOuterwear.add(item);
				}
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
		if(appropriateShoes.isEmpty()) {
			iterator = shoes.iterator();
			while(iterator.hasNext()) {
				Shoes item = iterator.next();
				if(item.getFormality() == formality) {
					appropriateShoes.add(item);
				}
			}
		}
		return appropriateShoes;
	}
	
	public Vector<Singletons> getSingletons() {
		return singletons;
	}
	
	public Vector<Socks> getSocks() {
		return socks;
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
		if(appropriateTops.isEmpty()) {
			iterator = tops.iterator();
			while(iterator.hasNext()) {
				Tops item = iterator.next();
				if(item.getFormality() == formality) {
					appropriateTops.add(item);
				}
			}
		}
		return appropriateTops;
	}
}