package jc5hwPets;

public class Cow extends Pet {
private double weight;
private double milkfat;

public Cow (int age, String name,String type, double weight,double milkfatcontent) {
	super (age, name, type);
	this.weight=weight;
	this.milkfat = milkfatcontent;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public double getMilkfat() {
	return milkfat;
}

public void setMilkfat(double milkfat) {
	this.milkfat = milkfat;
}



@Override
public String toString() {
	return "Cow [weight=" + weight + ", milkfat=" + milkfat + ", toString()=" + super.toString() + "]";
}

@Override
void voice() {
	System.out.println("I am  cow "+super.getName()+  ", and I say mouuuuu!");
	
}


}
