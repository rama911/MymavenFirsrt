
public class MyLinkedList implements NodeList {

	private ListItem root = null;

	public MyLinkedList(ListItem root) {
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
		if (this.root == null) {
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int compare = currentItem.compareTo(newItem);
			if (compare < 0) {
				// new item is greater and move to right
				if (currentItem.moveTonextItem() != null) {
					currentItem = currentItem.moveTonextItem();
				} else {
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
				// New item is less than currenItem, Insert before move to left.
			} else if (compare > 0) {
				if (currentItem.moveTopreviousItem() != null) {
					currentItem.moveTopreviousItem().setNext(newItem);
					newItem.setPrevious(currentItem.moveTopreviousItem());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				} else {
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}
				return true;

			} else {
				System.out.println(newItem.getValue() + " is already present, not added");
				return false;
			}

		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		
		if(item != null) {
			System.out.println("Deleteing item :"+item.getValue());
		}
		
		// TODO Auto-generated method stub
		ListItem currentItem = this.root;
		while(currentItem != null) {
		   int compare = currentItem.compareTo(item);
		   //found item to delete
		   if(compare == 0) {
			   // this is the root item - First in the list
			   if(currentItem == this.root) {
			   this.root = currentItem.moveTonextItem(); 
			   }
		   else {
			   currentItem.moveTopreviousItem().setNext(currentItem.moveTonextItem());
			   if(currentItem.moveTonextItem() != null) {
				  currentItem.moveTonextItem().setPrevious(currentItem.moveTopreviousItem()); 
			   }
		       }
		   return true;
		    // looping through the list till we find the deleted item.
		    } else if(compare <0){
		    	currentItem = currentItem.moveTonextItem();
		          }
		   // we passed the record to be deleted
		   // record to delete is not found in the list
		    else {
		    	return false;
		    }
			}
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		// TODO Auto-generated method stub
		if (root == null) {
			System.out.println("list is empty");
		} else {
			while (root != null) {
				System.out.println(root.getValue());
				root = root.moveTonextItem();
			}
		}
	}
}
