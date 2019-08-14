
public class BinarySearch implements NodeList{
	
	private ListItem root = null;

	public BinarySearch(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		// TODO Auto-generated method stub
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		
		while(currentItem != null) {
			int compare = currentItem.compareTo(newItem);
			// New item is greater than currentItem and moving towards right
			if(compare < 0 ){
			   if(currentItem.moveTonextItem()!= null) {
				  currentItem = currentItem.moveTonextItem();
			   }else {
				   currentItem.setNext(newItem);
				   return true;
			   }
			   // New Item is less than current item moving towards left
			} else if(compare > 0){
				if(currentItem.moveTopreviousItem()!= null) {
					currentItem = currentItem.moveTopreviousItem();
				}else {
					currentItem.setPrevious(newItem);
					return true;
				}
			}else {
				System.out.println(newItem.getValue() + " is already present");
                return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		//recursive method.
		 if (root != null) {
	            traverse(root.moveTopreviousItem());
	            System.out.println(root.getValue());
	            traverse(root.moveTonextItem());
	        }
		
	}
	
	

}
