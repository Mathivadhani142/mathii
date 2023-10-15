package using_pcollections;

import java.util.ArrayList;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setBrand("Samsung");
		l.setprice(50000);
        l.setisWarranty(true);
		l.setcolor("red");
        Laptop l1 = new Laptop();
		l1.setBrand("xxxxxxx");
		l1.setprice(67000);
        l1.setisWarranty(false);
		l1.setcolor("white");
        Laptop l2 = new Laptop();
		l2.setBrand("yyyyyy");
		l2.setprice(73000);
        l2.setisWarranty(true);
		l2.setcolor("black");
        Laptop l3 = new Laptop();
		l3.setBrand("QQQQ");
		l3.setprice(345000);
        l3.setisWarranty(false);
        l3.setcolor("voilet");
        ArrayList<Laptop>lap=new ArrayList<>();
        lap.add(l);
        lap.add(l1);
        lap.add(l2);
        lap.add(l3);
//     Integer a = lap.get(0).getPrice();
//       lap.forEach(n->{
//    	   if(a<n.getPrice()) {
//    		 
//    	   }
//       });

   //    System.out.println(a);
        
    //    int q = lap.get(0).getPrice();
        
       //        
       
//    //    lap.forEach(c->System.out.println(c));
//       
        lap.forEach(d->{
        	 if(d.getisWarranty()==true) {
        		 System.out.println(d);
        	 }
         });
//         
//         lap.forEach(f->{
//        	 if(f.getcolor().equals("black")) {
//        		// System.out.println(f);
//        	 }
//         });
//         
//         lap.forEach(z->{
//        	 if(z.getBrand().equals(z.getBrand().toUpperCase())) {
//        	//	 System.out.println(z);
//        	 }
//         });
//         
//         
//         
//        ArrayList<Integer>num = new ArrayList<>();
//    	num.add(333);
//    	num.add(150);
//    	num.add(155);
//    	num.add(999);
//        num.add(35);
//        
//        
//        num.set(0,500);
//     //   num.remove(1);
//    //   num.forEach(n->System.out.println(n));   
//     
//       
//       ArrayList<Integer>nums = new ArrayList<>();
//        
//        num.forEach(h->{
//        	 if(h%2!=0) {
//        		nums.add(h);
//        	 }
//         });
//		System.out.println(nums);
//
//        
//       
        
	}
}
