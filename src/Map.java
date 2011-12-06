

public class Map {

	List keys = new List();
	List values = new List();
	
	public void add(Object key, Object value){
		
		keys.add(key);
		values.add(value);
	}
	
	public boolean contains(Object key){
		
		Iter it = keys.iter();
		
		while(it.hasNext()){
			
			if(it.next().equals(key))
				return true;
		}
		
		return false;
	}
	
	
	public Iter iter(){
		
		return values.iter();
	}
	public int size(){
		return keys.size;
	}
	
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
	
	
	public boolean remove(Object k){
		
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
	 * List Container class needed for the node list of a tree.
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
		 * @return Iter<T> an iterator.
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
		 * Inner class ListIter implements Iter<T> represents an iterator over the
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
