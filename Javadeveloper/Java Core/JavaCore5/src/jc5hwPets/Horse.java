package jc5hwPets;

public class Horse extends Pet {
private int maxSpeed;
private String gender;
public Horse(int age, String name, String type, int maxSpeed, String gender) {
	super(age, name, type);
	this.maxSpeed = maxSpeed;
	this.gender = gender;
}
public int getMaxSpeed() {
	return maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Horse [maxSpeed=" + maxSpeed + ", gender=" + gender + ", toString()=" + super.toString() + "]";
}
@Override
void voice() {
	System.out.println("I am a horse "+ super.getName()+", and I say 'Ihohohohoo!'");
	
}



}
