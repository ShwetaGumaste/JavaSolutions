package in.ac.Library;

public class LendingBooksSection {
	private String sDept;
	private String sSub;
	private int iDays;

	LendingBooksSection(String sDept, String sSub, int iDays) {
		this.sDept = sDept;
		this.sSub = sSub;
		this.iDays = iDays;
	}

	public String getsDept() {
		return sDept;
	}

	public String getsSub() {
		return sSub;
	}

	public int getiDays() {
		return iDays;
	}

	public int checkPenalty() {
		int penalty;
		int x;

		if (iDays < 15)
			penalty = 0;
		else {
			x = iDays - 15;
			if (x <= 7)
				penalty = x * 20;
			else if (x > 7 && x <= 14)
				penalty = (x - 7) * 50 + 7 * 20;
			else if (x > 14 && x <= 21)
				penalty = 7 * 20 + 7 * 50 + (x - 14) * 150;
			else
				penalty = 7 * 20 + 7 * 50 + 7 * 150 + (x - 21) * 300;
         }
		return penalty;
	}
}
