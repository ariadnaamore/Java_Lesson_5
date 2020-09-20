package jc5hwPets;

public abstract class Pet {

	private int age;
	private String name;
	private String type;

	public Pet(int age, String name, String type) {
		this.type =type;
		this.age = age;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Pet [age=" + age + ", name=" + name + ", type=" + type + "]";
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	abstract void voice();
}
