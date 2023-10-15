package using_pcollections;

public class Laptop {
	
private	String brand;
private String color;
private	int price;
private	boolean isWarranty;
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void setcolor(String color) {
			this.color = color;
		}
		public void setprice(int price) {
			this.price = price;
		}

		
		public void setisWarranty (boolean isWarranty) {
			this.isWarranty = isWarranty;
		}

		public String getBrand() {
			return brand;
		}

		 public String getcolor() {
		    	return color;
		    }
		public int getPrice() {
			return price;
		}

	    public boolean getisWarranty() {
	    	return isWarranty;
	    }
	   
		public String toString() {
			return brand + " " + price + " " +" "+isWarranty+" "+color;
}

		

}
