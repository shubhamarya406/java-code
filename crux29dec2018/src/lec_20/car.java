package lec_20;

public class car implements Comparable<car> {
	int speed;
	int price;
	String colour;

	public car(int speed, int price, String colour) {
		this.speed = speed;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public String toString() {

		return "S " + this.speed + " P " + this.price + " C " + this.colour;
	}

	@Override
	public int compareTo(car oth) {
		return this.speed - oth.speed;

	}
}