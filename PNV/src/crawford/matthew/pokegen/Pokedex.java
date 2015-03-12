package crawford.matthew.pokegen;
import java.util.LinkedList;

public class Pokedex
{
	private LinkedList<PokemonSpecies> CapturedSpecies;
	private LinkedList<PokemonSpecies> UnCapturedSeenSpecies;
	private LinkedList<PokemonSpecies> UnSeenSpecies;
	
	public Pokedex()
	{
		CapturedSpecies=new LinkedList<PokemonSpecies>();
		UnCapturedSeenSpecies=new LinkedList<PokemonSpecies>();
		UnSeenSpecies=new LinkedList<PokemonSpecies>();
	}
}
