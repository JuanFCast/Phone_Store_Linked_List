package model;
/*
 * remover un elemento de la lista
 * insertar un elemento de forma ordenada
*/
public class PhoneStore {
	public Phone first; // null significa que está vacía

	public PhoneStore() {

	}
	
	
	
	public Phone remove(String model) {
		// Casos:
		// * lista vacía
		// * cuando hay un solo elemento
		// * cuando hay un solo elemento y ese es o no es el que hay que borrar
		// * cuando hay más de un elemento en la lista
		Phone removed = null;
		
		if (first != null) { // al menos tiene 1 elemento en la lista
			if (first.getModel().equalsIgnoreCase(model)) {
				removed = first;
				first = first.getNext();
				removed.setNext(null); //pa que el elemento removido apunt a null
			}else {
				Phone prev = first;
				Phone current = first.getNext();
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
		if (first != null) {
			Phone current = first;
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
		if (first == null) {
			first = np;
		}else {
			Phone last = first;
			while (last.getNext() != null) {
				last = last.getNext();
				
			}
			last.setNext(np);
		}
	}
	
	public void addPhoneHead(String model, String brand, double cost) {
		Phone np = new Phone(model, brand, cost);
		if (first == null) {
			first = np;
			
		}else {
			Phone temp = first;
			first =  np;
			np.setNext(temp);
		}
		
	}
	
	public Phone searchPhoneWithModel(String model) {
		if (first != null) {
			Phone current = first;
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
		return first;
	}

	
}