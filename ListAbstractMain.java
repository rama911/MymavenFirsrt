
public class ListAbstractMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//
        // Create a concrete class from your abstract list item class and use this in a LinkedList
        // class to implement a linked list that will add items in order (so that they are sorted
        // alphabetically). Duplicate values are not added.
        //
        // Note that you are creating your own LinkedList class here, not using the built-in Java one..
        //
        // The rules for adding an item to the linked list are:
        //  If the head of the list is null, make the head refer to the item to be added.
        //  If the item to be added is less than the current item in the list, add the item before the
        //      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
        //      "next" refer to the current item).
        //  If the item to be added is greater than the current item, move onto the next item and compare
        //      again (if there is no next item then that is where the new item belongs).
        //
        // Care will be needed when inserting before the first item in the list (as it will not have a previous
        // item).
        //
        // You will also need a method to remove an item from the list.
        //
        // Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that
        // you create your classes before referring to them. In previous videos we have often referred to
        // classes that we create later, but if you use names that IntelliJ recognises as Java classes (such
        // as LinkedList) then it will create imports for them and possibly cause you problems later.
        //
        // Optional: create a class to use your concrete class to implement a Binary Search Tree:
        // When adding items to a Binary Search Tree, if the item to be added is less than the current item
        // then move to the left, if it is greater than the current item then move to the right.
        //
        // The new item is added when an attempt to move in the required direction would involve following a
        // null reference.
        // Once again, duplicates are not allowed.
        //
        // Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in
        // a loop as in the example below.
        //
        // Create a string data array to avoid typing loads of addItem instructions:
		
		MyLinkedList list = new MyLinkedList(null);
		 //BinarySearch list = new BinarySearch(null);
		 list.traverse(list.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        //String stringData = "3 5 7 1 0 8 4 2 6 9 7";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
        	
             list.addItem(new Node(s));
	           }
        //list.removeItem(new Node("Perth"));
        //list.removeItem(new Node("Adelaide"));
        //list.removeItem(new Node("Sydney"));
        list.traverse(list.getRoot());
        
	}
}
