package jc5hwPets;

public class Application {

	public static void main(String[] args) {
		Dog woolfi = new Dog (10, "Woolfi", "domestic pet", "golden retriever", 67);
		System.out.println(woolfi);
		
		woolfi.voice();
		System.out.println();
		
		Cow starky =new Cow(7,"Starky", "farm pet", 140.00, 22.00);
		System.out.println(starky);
		
		starky.voice();
		System.out.println();
		
		Cat baska = new Cat(5, "Baska", "domestic pet", "long fur", "brown with black");
		System.out.println(baska);
		
		baska.voice();
		
		System.out.println();
		
		Horse flower = new Horse(17, "Flower", "farm pet", 33, "female");
		System.out.println(flower);
		flower.voice();
	}

}
