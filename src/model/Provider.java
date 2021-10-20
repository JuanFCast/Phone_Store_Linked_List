package model;

public class Provider {
	private String id;
	private String name;
	private Provider next;

	public Provider(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Provider getNext() {
		return next;
	}

	public void setNext(Provider next) {
		this.next = next;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}



}
