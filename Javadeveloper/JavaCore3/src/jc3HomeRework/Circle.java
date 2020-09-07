package jc3HomeRework;

public class Circle {
	int rad;

	public Circle() {
		this.rad = 15;
	}

	public double squareR() {

		return Math.PI * rad * rad;
	}

	public double perimetrR() {
		return 2 * rad * Math.PI;

	}
	public double perimetrR2(int rad) {
		return 2 * rad * Math.PI;

	}
	public double squareR2(int rad) {

		return Math.PI * rad * rad;
	}
}
