package using_pcollections;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		System.out.println("this is Collection");
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(100);
		num.add(100);
		num.add(333);
		num.add(300);
		num.add(350);
		num.add(333);
				
		System.out.println(num);
		num.add(3, 250); // add() inset the values in array one buy one
	System.out.println(num);
		System.out.println(num.get(3)); // get() method used to get the value
		num.set(0, 500); // set() method used to set the value remove the old value
	System.out.println(num);
//		num.remove(5); // remove() the value
//		System.out.println(num);
//		System.out.println(num.size()); // find the size of array
		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) % 2 == 0) {
				System.out.println(num.get(i));
			}
		}
//    System.out.println();
//    for(Integer n : num) {
//    	System.out.println(n);
//    }
//    System.out.println();
//    num.forEach(n ->{
//    	if(n%2==0) {
//    		System.out.println(n);
//    	}
//    
//    });
   ArrayList<Integer>newnums = new ArrayList<>();
//    
    num.forEach(h->{
    	 if(h%2!=0) {
    		newnums.add(h);
    	 }
     });
	System.out.println(newnums);
	
	}
}
