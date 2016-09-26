package in.ac.kletechpokemon;

public class PokemonDemo {
	public static void main(String[] args) {
		Pokemon obj = new Pokemon (1, "Pikachu","Electric", 90, 27, 6, 21);
		
		System.out.println("Pokemon ID : " + obj.getiPokeID());
		System.out.println("Pokemon Name :" + obj.getsPokeName());
		System.out.println("Type :"+obj.getsType());
		System.out.println("Initial CP:"+obj.getiInitialCP());
		System.out.println("Total Matches Played :"+obj.getiTotalMatchPlayed());
		System.out.println("Matches Won :"+obj.getiWon());
		System.out.println("Matches Lost :"+obj.getiLost());
		System.out.println("Final CP :"+obj.calPokemonCP());
	}

}
