package using_pcollections;

public class Car {
	private String brand;
	private int price;

	private boolean isElectric;
	private String colour;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public void isElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}

	public void colour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public boolean getisElectric() {
		return isElectric;
	}

	public String getcolour() {
		return colour;
	}

	public String toString() {
		return brand + " " + price + " " + " " + isElectric + " " + colour;
	}
}
