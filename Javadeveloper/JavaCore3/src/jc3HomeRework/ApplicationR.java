package jc3HomeRework;

public class ApplicationR {
	public static void main(String[] args) {
		RectangleR rectan1 = new RectangleR();
		RectangleR rectan2 = new RectangleR();
		Circle circl = new Circle ();
		rectan1.setWidth(15);
		rectan1.setLongitude(20);

		System.out.println("Довжина прямокутника #1 = "+ rectan1.getLongitude());
		System.out.println("Ширина прямокутника #1 = "+ rectan1.getWidth());
		System.out.println("Периметр прямокутника #1 = "+rectan1.recperim());
		System.out.println("Площа прямокутника #1 = " + rectan1.recsquare());
		
		System.out.println("Довжина прямокутника по замовчуванню = "+rectan2.getLongitude());
		System.out.println("Ширина прямокутника по замовчуванню = "+rectan2.getWidth());
		System.out.println("Периметр прямокутника #2 = "+rectan2.recperim());
		System.out.println("Площа прямокутника #2 = " + rectan2.recsquare());
		
		System.out.println("Периметр кола = "+circl.perimetrR());
		System.out.println("Полоща кола = "+circl.squareR());
	}
	

}
