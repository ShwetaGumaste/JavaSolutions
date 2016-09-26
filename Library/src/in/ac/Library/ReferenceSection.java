package in.ac.Library;

public class ReferenceSection {
	private String sDept;
	private String sSub;
	private String sBookName;
	private int iHours;

	ReferenceSection(String sDept, String sSub, String sBookName, int iHours) {
		this.sDept = sDept;
		this.sSub = sSub;
		this.sBookName = sBookName;
		this.iHours = iHours;
	}

	public String getsDept() {
		return sDept;
	}

	public String getsSub() {
		return sSub;
	}

	public String getsBookName() {
		return sBookName;
	}

	public int getiHours() {
		return iHours;
	}

	public void CheckTime() {
		if (iHours > 4)
			System.out.println("Visitor is not allowed for more than 4 hours");
		else
			System.out.println("Visitor is allowed");
	}

}
