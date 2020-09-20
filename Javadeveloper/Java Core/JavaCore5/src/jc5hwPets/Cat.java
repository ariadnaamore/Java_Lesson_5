package jc5hwPets;

public class Cat extends Pet {
	private String fur;
	private String color;
	
	public Cat (int age, String name,String type,String fur, String color ) {
		super(age, name, type);
		this.color =color;
		this.fur =fur;
	}

	public String getFur() {
		return fur;
	}

	public void setFur(String fur) {
		this.fur = fur;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Cat [fur=" + fur + ", color=" + color + ", toString()=" + super.toString() + "]";
	}

	@Override
	void voice() {
		System.out.println("I am  cat "+super.getName() + ", and I say meoooooow!");
		
	}
	
}
