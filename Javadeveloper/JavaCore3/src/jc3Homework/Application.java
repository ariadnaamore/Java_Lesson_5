package jc3Homework;

public class Application {

	public static void main(String[] args) {
		Rectangle sqrt1 = new Rectangle();
		Rectangle sqrt2 = new Rectangle(34, 21);
		Rectangle sqrt3 = new Rectangle(11, 8);

		System.out.println("Прямокутник1: ");
		System.out.println("Довжина = " + sqrt1.longitude + " Ширина =  " + sqrt1.width);
		sqrt1.perimetr(sqrt1.longitude, sqrt1.width);
		sqrt1.square(sqrt1.longitude, sqrt1.width);

		System.out.println("Прямокутник2: ");
		System.out.println("Довжина = " + sqrt2.longitude + " Ширина =  " + sqrt2.width);
		sqrt2.perimetr(sqrt2.longitude, sqrt2.width);
		sqrt2.square(sqrt2.longitude, sqrt2.width);

		System.out.println("Прямокутник3: ");
		System.out.println("Довжина = " + sqrt3.longitude + " Ширина =  " + sqrt3.width);
		sqrt3.perimetr(sqrt3.longitude, sqrt3.width);
		sqrt3.square(sqrt3.longitude, sqrt3.width);

	Round circle1 = new Round (10.5,21);
	System.out.println("Коло: ");
	System.out.println("Радіус= "+circle1.radius);
	circle1.circlarea(circle1.diametr);
	circle1.circlesqr(circle1.radius);
	}

}
