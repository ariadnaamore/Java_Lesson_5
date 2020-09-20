package jc5hwPets;

public class Dog extends Pet {
private String breed;
private int height;

public Dog(int age, String name,String type,  String breed, int height) {
	super(age, name, type);
	this.breed = breed;
	this.height = height;
	
}

public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

@Override
public String toString() {
	return "Dog [breed=" + breed + ", height=" + height + ", toString()=" + super.toString() + "]";
}

@Override
void voice() {
	System.out.println("I am  dog "+ super.getName() + ", and I say 'Woof, woof'! ");
}
}





