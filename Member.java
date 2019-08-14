
public class Member {

	private String Name;
	private String PhNumber;

	public Member(String Name, String PhNumber) {

		this.Name = Name;
		this.PhNumber = PhNumber;
	}

	public String getName() {
		return Name;
	}

	public String getPhNumber() {
		return PhNumber;
	}

	public static Member CreateMember(String name, String phnumber) {
		return new Member(name, phnumber);

	}
}
