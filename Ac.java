package using_pcollections;

public class Ac {
	private String brand;
	private int price;
	private float tons;
    private boolean isWarranty;
    private String colour;
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public void settons(float tons) {
		this.tons = tons;
	}
	public void isWarranty (boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public void colour (String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public float gettons() {
		return tons;
	}
    public boolean getisWarranty() {
    	return isWarranty;
    }
    public String getcolour() {
    	return colour;
    }
	public String toString() {
		return brand + " " + price + " " + tons+" "+isWarranty+" "+colour;
	}
	
//	public Ac(String brand, int Price, float tons) {
//		this.brand = brand;
//		this.price = Price;
//		this.tons = tons;
//	}

}
