package in.ac.Library;

public class QuestionPapersSection {
	private String sDept;
	private String sSub;
	private int iYear;

	public QuestionPapersSection(String sDept, String sSub, int iYear) {
		this.sDept = sDept;
		this.sSub = sSub;
		this.iYear = iYear;
	}

	public String getsDept() {
		return sDept;
	}

	public String getsSub() {
		return sSub;
	}

	public int getiYear() {
		return iYear;
	}

}
