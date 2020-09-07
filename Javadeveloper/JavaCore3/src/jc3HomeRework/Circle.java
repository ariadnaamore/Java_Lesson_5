package jc3HomeRework;

public class Circle {
	int rad;

	public Circle() {
		this.rad = 15;
	}

	public double squareR(){

		return Math.PI*rad*rad;
		}
	
	public double perimetrR() {
		return 2*rad*Math.PI;
		
	}
}


