import java.util.ArrayList;

public class Contacts {

	private ArrayList<String> Contacts = new ArrayList<String>();

	public void addContact(String contact) {
		Contacts.add(contact);
	}

	public ArrayList<String> getContacts() {
		return Contacts;
	}

	public void printContacts() {
		System.out.println("Mobile phone has " + Contacts.size() + " Contacts");
		for (int i = 0; i < Contacts.size(); i++) {
			System.out.println("Contact deatils are " + (i+1) + " " + Contacts.get(i));
		}
	}

	public void editContact(String oldcontact, String newcontact) {
		int position = findContact(oldcontact);
		if (position >= 0) {
			Contacts.set(position, newcontact);
		}
	}

	public void deleteContact(String contact) {
		int position = findContact(contact);
		if (position >= 0) {
			Contacts.remove(position);
		}

	}

	private int findContact(String contact) {
		return Contacts.indexOf(contact);
	}

	public boolean isaContact(String contact) {
		int position = findContact(contact);

		if (position >= 0) {
			System.out.println("Contact is on the phone "+contact);
			return true;
		} else {
			System.out.println("Contact is not on the phone "+contact);
			return false;
		}

	}
}
