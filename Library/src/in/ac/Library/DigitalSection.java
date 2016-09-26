package in.ac.Library;

public class DigitalSection {

	private String sDept;
	private String sSub;
	private int iHours;
	private int iMinutes;
	private int iSeconds;

	DigitalSection(String sDept, String sSub, int iHours, int iMinutes, int iSeconds) {
		this.sDept = sDept;
		this.sSub = sSub;
		this.iHours = iHours;
		this.iMinutes = iMinutes;
		this.iSeconds = iSeconds;
	}

	public String getsDept() {
		return sDept;
	}

	public String getsSub() {
		return sSub;
	}

	public int getiHours() {
		return iHours;
	}

	public int getiMinutes() {
		return iMinutes;
	}

	public int getiSeconds() {
		return iSeconds;
	}

	public void CheckTime() {
		if (iHours > 4 && iHours < 6) {
			if (iMinutes > 0 && iMinutes < 60) {
				if (iSeconds > 0 && iSeconds < 60)
					System.out.println("Library is open");
			}
		}

		else
			System.out.println("Library is closed");

	}

}
