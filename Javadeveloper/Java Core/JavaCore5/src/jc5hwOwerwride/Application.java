package jc5hwOwerwride;

public class Application {

	public static void main(String[] args) {
		Laptop pc = new Laptop(null, 8);
		Laptop pc2 = new Laptop("Lenovo", 16, 3100, "gray", 4400);
		Laptop pc3 = new Laptop("Acer", 22);

		pc.show();
		pc2.show();
		pc3.show();
	}

}
