package ui;

import model.Phone;
import model.PhoneStore;

public class Main {
	
	private static PhoneStore ps;
	public static void main(String[] args) {
		ps = new PhoneStore();
		/*
		ps.addPhoneTail("1", "Nokia", 700000);
		ps.addPhoneTail("4", "iPhone", 4000000);
		ps.addPhoneTail("3", "Xiaomi", 1500000);
		ps.addPhoneTail("8", "Realme", 1300000);
		ps.addPhoneTail("2", "Huawei", 2600000);
		
		printListPhone();
		System.out.println();
		ps.addPhoneHead("1", "Nokia", 700000);
		ps.addPhoneHead("4", "iPhone", 4000000);
		ps.addPhoneHead("3", "Xiaomi", 1500000);
		ps.addPhoneHead("8", "Realme", 1300000);
		ps.addPhoneHead("2", "Huawei", 2600000);
		printListPhone();
		findPhone("8");
		System.out.println("element number: " + ps.size());
		*/
		
		ps.addSorted("1", "Nokia", 700000);
		ps.addSorted("4", "iPhone", 4000000);
		ps.addSorted("3", "Xiaomi", 1500000);
		ps.addSorted("8", "Realme", 1300000);
		ps.addSorted("2", "Huawei", 2600000);
		printListCost();
		System.out.println();
		printListPhone();
	}
	
	public static void findPhone(String model) {
		Phone newP = ps.searchPhoneWithModel(model);
		if (newP != null) {
			System.out.println(newP.getBrand());
		}else {
			System.out.println("Phone not found");
		}
	}
	
	
	public static void printListPhone() {
		
		Phone last = ps.getFirst();
		
		while(last != null) {
			
			System.out.println(last.getModel());
			last = last.getNext();
			
			
		}
	}
	
	
	

	public static void printListCost() {

		Phone last = ps.getFirst();

		while(last != null) {

			System.out.println(last.getCost());
			last = last.getNext();


		}
		
		
		
	}
	
}
