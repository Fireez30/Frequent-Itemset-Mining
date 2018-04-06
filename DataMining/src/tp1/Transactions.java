package tp1;

import java.util.ArrayList;

public class Transactions {

	ArrayList<Item> items;
	
	public Transactions() {
		items = new ArrayList<Item>();
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item s){
		if (!items.contains(s)) 
			items.add(s);
	}
	
	public int sizeTransaction(){
		return items.size();
	}
	
	public Item getElement(int i){
		return items.get(i);
	}
	public String toString() {
		return "Transactions [items=" + items + "]";
	}

}
