import java.util.ArrayList;

public class Memberservice {
	private String Phone;
	private ArrayList<Member> myMembers;

	public Memberservice(String phone) {
		this.Phone = phone;
		this.myMembers = new ArrayList<Member>();
	}

	public boolean addNewMember(Member member) {

		if (findMember(member.getName()) >= 0) {
			return false;
		}
		myMembers.add(member);
		return true;
	}

	public boolean updateMember(Member oldMember, Member newMember) {
		int foundposition = findMember(oldMember);
		if (foundposition < 0) {
			System.out.println(oldMember.getName() + " was not found");
			return false;
		}
		this.myMembers.set(foundposition, newMember);
		System.out.println(oldMember.getName() + "was replaced with " + newMember.getName());
		return true;
	}

	public boolean removeMember(Member member) {
		int foundposition = findMember(member);
		if (findMember(member) < 0) {
			System.out.println(member + " not found to delete");
			return false;
		}
		this.myMembers.remove(foundposition);
		return true;
	}
	
	public void printMembers() {
	//if((this.myMembers) != null) {		
	  System.out.println("Members List");
	  
	  for(int i=0;i < this.myMembers.size();i++){
		  System.out.println(i+1 + "."+ 
	       this.myMembers.get(i).getName() + 
	       this.myMembers.get(i).getPhNumber() );
	       }
	}
	  
	
	
	public String searchMember(Member member) {
		if(findMember(member) >= 0) {
			return member.getName();
		}
		return null;
	}
	
	public Member searchMember(String Name) 
	{
		int position = findMember(Name);
		if(position >= 0) {
			return this.myMembers.get(position);
		}
		return null;
	}

	private int findMember(Member member) {
		return this.myMembers.indexOf(member);
	}

	private int findMember(String Name) {
		for (int i = 0; i < myMembers.size(); i++) {
			Member member = this.myMembers.get(i);
			if (member.getName().equalsIgnoreCase(Name)) {
				return i;
			}
		}
		return -1;
	}

}