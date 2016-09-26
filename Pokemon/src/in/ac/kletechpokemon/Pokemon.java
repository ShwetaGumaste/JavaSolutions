package in.ac.kletechpokemon;

public class Pokemon {
	private int iPokeID;
	private String sPokeName;
	private String sType;
	private int iInitialCP;
	private int iTotalMatchPlayed;
	private int iWon;
	private int iLost;
	private float fFinalCP;

	Pokemon(int iPokeID, String sPokeName, String sType, int iInitialCP, int iTotalMatchPlayed, int iWon, int iLost){
			this.iPokeID=iPokeID;
			this.sPokeName=sPokeName;
			this.sType=sType;
			this.iInitialCP=iInitialCP;
			this.iTotalMatchPlayed=iTotalMatchPlayed;
			this.iWon=iWon;
			this.iLost=iLost;
		
	}

	public int getiPokeID() {
		return iPokeID;
	}

	public String getsPokeName() {
		return sPokeName;
	}

	public String getsType() {
		return sType;
	}

	public int getiInitialCP() {
		return iInitialCP;
	}

	public int getiTotalMatchPlayed() {
		return iTotalMatchPlayed;
	}

	public int getiWon() {
		return iWon;
	}

	public int getiLost() {
		return iLost;
	}

	float calPokemonCP(){
		int diff;
		float temp;
		float finalCP=0;
		
		if(iWon>iLost)
		{
			diff=iWon-iLost;
			if(Math.abs(diff)>0 && Math.abs(diff)<=20)
				temp=diff*(10f/100f);
			else	if(diff>20 && diff<=40)
						temp= 0.25f*diff;
			else	if(diff>40 && diff<=60)
						temp=0.40f*diff;
			else
						temp=0.50f*diff;
			finalCP=iInitialCP+temp;
			
			
		}
		
		if(iLost>iWon)
		{
			diff=iLost-iWon;
			if(diff>0 && diff<=20)
				temp=diff*(10f/100f);
			else	if(diff>20 && diff<=40)
						temp= 0.25f*diff;
			else	if(diff>40 && diff<=60)
						temp=0.40f*diff;
			else
						temp=0.50f*diff;
			
			finalCP=iInitialCP-temp;
		}
		
		return finalCP;
		
	}
	

}
