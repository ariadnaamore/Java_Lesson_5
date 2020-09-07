package jc3HomeRework;

public class RectangleR {

	public int longitude;
	public int width;

	RectangleR() {
		this.longitude = 45;
		this.width = 79;

	}

	public int recsquare(int longitude, int width) {

		return width * longitude;
	}

	public int recsquare2() {

		return width * longitude;
	}

	public int recperim(int longitude, int width) {
		return (longitude + width) * 2;
	}

	

	public int recperim2() {
		return (longitude + width) * 2;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
