package model;

public class Phone {
	private String model;
	private String brand;
	private double cost;
	
	private Phone next; // arranca en null
	private Phone prev; // arranca en null
	
	public Phone(String model, String brand, double cost) {
		this.model = model;
		this.brand = brand;
		this.cost = cost;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Double getCost() {
		return cost;
	}
	
	public Phone getNext() {
		return next;
	}
	
	
	public void setNext(Phone next) {
		this.next = next;
	}

	public Phone getPrev() {
		return prev;
	}

	public void setPrev(Phone prev) {
		this.prev = prev;
	}


	
	
}
