package jc3Homework;

public class Rectangle {
	int longitude;
	int width;

	Rectangle() {
		this.longitude = 20;
		this.width = 15;

	}

	Rectangle(int mylongitude, int mywidth) {
		this.longitude = mylongitude;
		this.width = mywidth;
	}

	public void square(int longitude, int width) {

		System.out.println("Площа прямокутника = " + width * longitude);
	}

	public void perimetr(int longitude, int width) {
		System.out.println("Периметр прямокутника = " + (longitude + width) * 2);
	}

}
