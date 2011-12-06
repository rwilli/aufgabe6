
/**
	 * Map Container class needed for store values related with keys
	 * 
	 * @author Gruppe222
	 * 
	 */
public class Map {

	List keys = new List();
	List values = new List();
	
	
	/**
	 * Adds any value combined with a key, 
	 * In order to get the correct Data with getValueByKey
	 * you have to watch, what you add. In our case only 
	 * Roboters as value.
	 * @param key
	 * @param value
	 */
	public boolean add(Object key, Object value){
		
		if(!contains(key)){
			keys.add(key);
			values.add(value);
			return true;
		}else 
			return false;
		
	}
	
	/**
	 * checks if the key is contained in the map,
	 * returns true or false; 
	 * @param key
	 * @return true or false
	 */
	public boolean contains(Object key){
		
		Iter it = keys.iter();
		
		while(it.hasNext()){
	
			if(it.next().equals(key))
				return true;
		}
		
		return false;
	}
	
	/**
	 * returns an Iterator over all Values.
	 * Iterator contains all Object stored in the Map.
	 * Next and previous return the same as getValueByKey, 
	 * so you have to watch 
	 * what you are adding in order to cast right. 
	 * @return
	 */
	public Iter iter(){
		
		return values.iter();
	}
	
	/**
	 * retruns the size of the Map.
	 * Because we handel key and value list always togther,
	 * it dosen't matter which size we return;
	 * @return size
	 */
	public int size(){
		return keys.size;
	}
	
	/**
	 * returns the value related to the key, 
	 * if the key isn't contained in the map, we return 
	 * null. As mentioned before, you have to watch what you 
	 * add in order to cast right. 
	 * @param k
	 * @return value
	 */
	public Object getValueByKey(Object k){
		
		List.ListIter keyIt = keys.iter();
		List.ListIter valueIt = values.iter();
		
		while(keyIt.hasNext()){
			
			Object value = valueIt.next();				
			Object key  = keyIt.next();
			
			if(key.equals(k)){
				
				return value;
			}
		}

		return null;
	}
	
	/**
	 * removes the Object related to the key
	 * returns true when it is removed or 
	 * false if there is no object with that key.
	 * @param k
	 * @return true or false
	 */
	public boolean removeByKey(Object k){
		
			List.ListIter keyIt = keys.iter();
			List.ListIter valueIt = values.iter();
			
			while(keyIt.hasNext()){
				
				valueIt.next();				
				Object key  = keyIt.next();
				
				if(key.equals(k)){
					
					List.ListNode vN = valueIt.getCurrentNode();
					List.ListNode kN = keyIt.getCurrentNode();
					
					//löschen, umhängen
					
					if(vN.previous != null){
					
						vN.previous.next = vN.next;
						vN.next.previous = vN.previous;
						kN.previous.next = kN.next;
						kN.next.previous = kN.previous;
					}else{
						
						keys.first = kN.next;
						values.first = vN.next;
						
					}
					return true;
				}
			}
	
			return false;
	}
	
	/**
	 * prints the hole map with key and value
	 */
	public void printMap(){
		List.ListIter keyIt = keys.iter();
		List.ListIter valueIt = values.iter();
		
		while(keyIt.hasNext()){
		
			Object value = valueIt.next();				
			Object key  = keyIt.next();
			System.out.println("Key: "+key.toString()+" Value "+value.toString());
		}
	}
	
	/**
	 * Nested class to save key and value seperate
	 * 
	 * @author Gruppe222
	 *
	 */
		protected class List {
			private ListNode first = null;
			private ListNode last = null;
			private int size;
	
			/**
			 * adds a new Element to the list.
			 * 
			 * @param element
			 *            to add.
			 */
			protected void add(Object element) {
				if (first == null) {
					first = new ListNode(element);
					last = first;
				} else {
					ListNode tmp = new ListNode(element);
					last.next = tmp;
					tmp.previous = last;
					last = tmp;
				}
				size++;
			}
	
			/**
			 * returns the last element of the list
			 * 
			 * @return a ListNode being the last element.
			 */
			protected ListNode getLast() {
				ListNode tmp = this.first;
				while (tmp.next != null) {
					tmp = tmp.next;
				}
	
				return tmp;
			}
	
			/**
			 * creates a new list iterator.
			 * 
			 * @return Iter an iterator.
			 */
			protected ListIter iter() {
				return new ListIter();
			}
	
			/**
			 * Inner Class ListNode, represents a node in the list.
			 * 
			 * @author Gruppe222
			 * 
			 */
			protected class ListNode {
				private Object data;
				private ListNode next = null;
				private ListNode previous = null;
	
				ListNode(Object data) {
					this.data = data;
				}
	
			}
	
			/**
			 * Inner class ListIter implements Iter represents an iterator over the
			 * list.
			 * 
			 * @author Gruppe222
			 * 
			 */
			protected class ListIter implements Iter {
				protected ListNode n = first;
	
				
				public ListNode getCurrentNode(){
					
					return n.previous;
				}
				
				@Override
				public Object next() {
					if (n == null)
						return null;
	
					Object data = n.data;
					n = n.next;
	
					return data;
				}
	
				@Override
				public Object previous() {
					if (n == null)
						return null;
	
					Object data = n.data;
					n = n.previous;
	
					return data;
				}
	
				@Override
				public boolean hasNext() {
					return n != null;
				}
	
				@Override
				public boolean hasPrevious() {
					return n.previous != null;
				}
	
			}
	
			/**
			 * returns the current size of the list
			 * 
			 * @return size as integer
			 */
			protected int size() {
				return this.size;
			}
		}
		
}
