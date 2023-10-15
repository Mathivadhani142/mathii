package using_pcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setBrand("Samsung");
		c1.setprice(6000);
		c1.colour("white");
		c1.isElectric(true);
		Car c2 = new Car();
		c2.setBrand("xxxxxxx");
		c2.setprice(2000);
		c2.colour("red");
		c2.isElectric(false);
		Car c3 = new Car();
		c3.setBrand("yyyyyy");
		c3.setprice(3000);
		c3.colour("white");
		c3.isElectric(true);
		Car c4 = new Car();
		c4.setBrand("qqqqq");
		c4.setprice(4000);
		c4.colour("black");
		c4.isElectric(false);

		List<Car> cars = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));
		// @GetMapping(value="/CarMax")
//	public List<Car> findMax(@RequestBody List<Car> cars) {
		List<Car> l = new ArrayList<>();
		Car max = cars.get(0);
		for (Car x : cars) {
			if (x.getPrice() > max.getPrice()) {
				max = x;
				//l.add(x);
			}
		}
		System.out.println(max);
		
		// return l;
//	}
//		List<Car> l1 = new ArrayList<>();
//		for (Car x : cars)
//			if (x.getPrice() < 3000) {
//				x.setprice(x.getPrice() + x.getPrice() * 8 / 100);
//				l1.add(x);
//
//			} 
//			else if (x.getPrice() > 4000) {
//				x.setprice(x.getPrice() + x.getPrice() * 6 / 100);
//				l1.add(x);
//			}

		// return l;
		// }

		//System.out.println(l);
		//sssSystem.out.println(l1);
	}
}
