package jc3Homework;

public class Round {
double radius;
double diametr;

Round (double rad,double diam){
	this.radius = rad;
	this.diametr = diam;	
}

public void circlesqr (double rad) {
	System.out.println("Площа круга = "+rad*rad*Math.PI);
	
}

public void circlarea (double diam) {
	System.out.println("Периметр круга = "+diam*Math.PI);
}

}

