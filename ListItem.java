
public abstract class ListItem {
	
	protected ListItem rightLink;
	protected ListItem LeftLink;
	protected Object value;
	
	public ListItem(Object value) {
		this.value = value;
	}

	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	abstract ListItem moveTonextItem();
	abstract ListItem setNext(ListItem item);
	abstract ListItem setPrevious(ListItem item);
	abstract ListItem moveTopreviousItem();	
	abstract int compareTo (ListItem item);

}
