package using_pcollections;

import java.util.ArrayList;



public class UseAc {
	public static void main(String[] args) {

		Ac ac1 = new Ac();
		ac1.setBrand("Samsung");
		ac1.setprice(50000);
		ac1.settons(500.3f);
		ac1.colour("white");
		ac1.isWarranty(true);
		Ac ac2 = new Ac();
		ac2.setBrand("xxxxxxx");
		ac2.setprice(67000);
		ac2.settons(345.3f);
		ac2.colour("red");
		ac2.isWarranty(false);
		Ac ac3 = new Ac();
		ac3.setBrand("yyyyyy");
		ac3.setprice(73000);
		ac3.settons(678.56f);
		ac3.colour("white");
		ac3.isWarranty(true);
		Ac ac4 = new Ac();
		ac4.setBrand("qqqqq");
		ac4.setprice(345000);
		ac4.settons(238.56f);
		ac4.colour("black");
		ac4.isWarranty(false);
		ArrayList<Ac> ac = new ArrayList<>();
		ac.add(ac1);
		ac.add(ac2);
		ac.add(ac3);
		ac.add(ac4);
		for (int i = 0; i < ac.size(); i++) {
			System.out.println(ac.get(i));
			 if (ac.get(i).getBrand().length()%2==0 ) {
					System.out.println(ac.get(i));
				}
				
			     if(ac.get(i).getPrice()<50000) {
				 System.out.println(ac.get(i).getPrice()+" "+ac.get(i).getPrice()+(ac.get(i).getPrice()*5/100));
				  }
			     System.out.println();
			     if(ac.get(i).getcolour().equals("white")) {
					 System.out.println(ac.get(i));
					  }
			     
		           }
		Ac ac5 = new Ac();
		ac5.setBrand("yyyyyy");
		ac5.setprice(7);
		ac5.settons(678.56f);
		ac5.colour("white");
		ac5.isWarranty(true);
		ac.set(2, ac5);
		
		
		ac.remove(1);
		for(int i=0;i<ac.size();i++) {
			System.out.println(ac.get(i));
		}
		
		ArrayList<Ac>c = new ArrayList<>();
		for(int i =0;i<ac.size();i++) {
		if(c.get(i).getcolour().equals("white"));
		c.add(ac.get(i));
		}	

	}
}
