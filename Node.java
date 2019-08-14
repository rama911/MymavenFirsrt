
public class Node extends ListItem{
	
	public Node(Object value) {
		super(value);
	}

	@Override
	ListItem moveTonextItem() {
		// TODO Auto-generated method stub
		return this.rightLink;
	}

	@Override
	ListItem setNext(ListItem item) {
		// TODO Auto-generated method stub
		this.rightLink = item;
		return rightLink;
	}

	@Override
	ListItem setPrevious(ListItem item) {
		// TODO Auto-generated method stub
		this.LeftLink = item;
		return this.LeftLink;
	}

	@Override
	ListItem moveTopreviousItem() {
		// TODO Auto-generated method stub
		return this.LeftLink;
	}

	@Override
	int compareTo(ListItem item) {
		// TODO Auto-generated method stub
		if(item != null) {
			return (((String) super.getValue()).compareTo((String)item.getValue()));
		}	
		return -1;
	}

}
