package jc5hwOwerwride;

public class Laptop {
	String model;
	int ram;
	double processor;
	String color;
	double weight;

	public Laptop(String model, int ram) {
		this.model = model;
		this.ram = ram;
	}

	public Laptop(String model, int ram, double processor, String color, double weight) {
		this(model, ram);
		this.processor = processor;
		this.weight = weight;
		this.color = color;
	}

	public void show() {
		System.out.println("Laptop is: " + model + ", " + ram + ", " + processor + ", " + color + ", " + weight);
	}
}
