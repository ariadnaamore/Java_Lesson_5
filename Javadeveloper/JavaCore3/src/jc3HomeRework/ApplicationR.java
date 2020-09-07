package jc3HomeRework;

public class ApplicationR {
	public static void main(String[] args) {
		RectangleR rectan1 = new RectangleR();
		RectangleR rectan2 = new RectangleR();
		RectangleR rectan3 = new RectangleR();
		Circle circl = new Circle();
		rectan1.setWidth(15);
		rectan1.setLongitude(20);
		rectan3.setWidth(25);
		rectan3.setLongitude(40);
		

		System.out.println("Довжина прямокутника #1 = " + rectan1.getLongitude());
		System.out.println("Ширина прямокутника #1 = " + rectan1.getWidth());
		System.out.println("Периметр прямокутника #1 = " + rectan1.recperim2());
           System.out.println("Площа прямокутника #1 = " + rectan1.recsquare2());

		System.out.println("Довжина прямокутника по замовчуванню = " + rectan2.getLongitude());
		System.out.println("Ширина прямокутника по замовчуванню = " + rectan2.getWidth());
		System.out.println("Периметр прямокутника #2 = " + rectan2.recperim2());
	System.out.println("Площа прямокутника #2 = " + rectan2.recsquare2());
	
	System.out.println("Довжина прямокутника #3 = " + rectan3.getLongitude());
	System.out.println("Ширина прямокутника #3 = " + rectan3.getWidth());

System.out.println("Площа прямокутника #3 = " + rectan2.recsquare(rectan3.longitude, rectan3.width));
	System.out.println("Периметр прямокутника #3 = " + rectan3.recperim(rectan3.longitude, rectan3.width));

		System.out.println("Периметр кола = " + circl.perimetrR());
		System.out.println("Полоща кола = " + circl.squareR());
		System.out.println("Довжина кола з радіусом "+circl.perimetrR2(45));
	}

}
