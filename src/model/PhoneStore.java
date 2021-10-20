package model;
/*
 * remover un elemento de la lista
 * insertar un elemento de forma ordenada
*/
public class PhoneStore {
	public Phone firstPhone; // null significa que está vacía
	private Phone head;
	private Phone tail;
	private Provider firstProvider;
	

	public PhoneStore() {

	}
	// PRIMER TAREA
	// realizar él método que se encargue de adicionar al final de la lista un nuevo elemento con
	// la lista doblemente enlaza circular
	
	//SEGUNDA TAREA
	// Probar su funcionamiento haciendo también el método que imprima todos los elementos de la lista
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Phone remove(String model) {
		// Casos:
		// * lista vacía
		// * cuando hay un solo elemento
		// * cuando hay un solo elemento y ese es o no es el que hay que borrar
		// * cuando hay más de un elemento en la lista
		Phone removed = null;
		
		if (firstPhone != null) { // al menos tiene 1 elemento en la lista
			if (firstPhone.getModel().equalsIgnoreCase(model)) {
				removed = firstPhone;
				firstPhone = firstPhone.getNext();
				removed.setNext(null); //pa que el elemento removido apunt a null
			}else {
				Phone prev = firstPhone;
				Phone current = firstPhone.getNext();
				boolean stop = false;
				while (current != null && !stop) {
					if (current.getModel().equalsIgnoreCase(model)) { // más de un element
						removed = current;
						prev.setNext(current.getNext());
						removed.setNext(null);
						stop = true;
					}else {
						prev = current;
						current = current.getNext();
					}
				}
			}
			
		}
		return removed;
		
		
	}
	
	public int size() {
		int count = 0;
		if (firstPhone != null) {
			Phone current = firstPhone;
			while (current != null) {
				count++;
				current = current.getNext();
			}
		}
		return count;
	}
	
	public void addPhoneTail(String model, String brand, double cost) {
		Phone np = new Phone(model, brand, cost);
		
		// significa que la lista está vacía
		if (firstPhone == null) {
			firstPhone = np;
		}else {
			Phone last = firstPhone;
			while (last.getNext() != null) {
				last = last.getNext();
				
			}
			last.setNext(np);
		}
	}
	
	public void addPhoneHead(String model, String brand, double cost) {
		Phone np = new Phone(model, brand, cost);
		if (firstPhone == null) { 
			firstPhone = np;
			
		}else {
			Phone temp = firstPhone;
			firstPhone =  np;
			np.setNext(temp);
		}
		
	}
	
	
	public boolean addSorted(String model, String brand, double cost) {
		Phone np = new Phone(model, brand, cost);
		if (firstPhone == null) { // La lista esta vacia
			firstPhone = np;
			return true;
		}else {
			if (firstPhone.getCost() >= cost) { // La lista no est[a vac[ia y el elemento nuevo va en la cabeza
				Phone temp = firstPhone;
				firstPhone = np;
				np.setNext(temp);
				return true;
			}else { // El nuevo elemento no va en la cabeza
				Phone current = firstPhone;
				while (current != null) {
					if (current.getNext() == null) { // Llegue al final de la lista y no encontré un nodo mayor al nuevo
						current.setNext(np);
						return true;
					}else if(current.getNext().getCost() >= cost){ // Un nodo intermedio es mayor a nuevo, ahi se inserta
						np.setNext(current.getNext());
						current.setNext(np);
						return true;
					}
					current = current.getNext();
				}
				
			}
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	public Phone searchPhoneWithModel(String model) {
		if (firstPhone != null) {
			Phone current = firstPhone;
			while (current != null) {
				if (current.getModel().equalsIgnoreCase(model)) {
					return current;

				}
				current = current.getNext();
			}
		}
		return null;

	}

	public Phone getFirst() {
		return firstPhone;
	}

	
}