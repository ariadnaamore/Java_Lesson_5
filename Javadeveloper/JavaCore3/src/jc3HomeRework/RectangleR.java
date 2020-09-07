package jc3HomeRework;

public class RectangleR {
	
	private	int longitude;
	private	int width;

		RectangleR() {
			this.longitude = 45;
			this.width = 79;

		}
		public int recsquare() {

			return  width * longitude;
		}
		
		public int recperim() {
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
