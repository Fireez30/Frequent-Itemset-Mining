package tp1;

public class Item {
	int count;
	String name;
	
	public Item() {
		name = "";
		count = 0;
	}
	
	public Item(String s,int i){
		count = i;
		name = s;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o){
		Item i = (Item) o;
		return i.getName().equals(this.getName());
	}

}
