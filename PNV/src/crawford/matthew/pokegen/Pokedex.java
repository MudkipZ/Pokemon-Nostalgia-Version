package crawford.matthew.pokegen;
import java.util.LinkedList;

public class Pokedex
{
	private LinkedList<PokemonSpecies> CapturedSpecies;
	private LinkedList<PokemonSpecies> UnCapturedSeenSpecies;
	private LinkedList<PokemonSpecies> UnSeenSpecies;
	private int Caught;
	private int Seen;
	
	public Pokedex()
	{
		this.CapturedSpecies=new LinkedList<PokemonSpecies>();
		this.UnCapturedSeenSpecies=new LinkedList<PokemonSpecies>();
		this.UnSeenSpecies=new LinkedList<PokemonSpecies>();
		this.Caught=0;
		this.Seen=0;
	}
	
	public void AddSpecies(PokemonSpecies PS,int flag)
	{
		// If The Species Is Caught
		if(flag==1)
		{
			// Insert The Species Into Caught
			// Remove Species From UnCapturedSeenSpecies
		}
		
		// If The Species Is Seen For The First Time
		else
		{
			// Insert Species Into UnCapturedSeenSpecies
			// Remove Species From UnSeenSpecies
		}
	}
	
	// Will Fill The Unseen Species Into The Pokedex At The Start Of The Game
	public void FillUnSeenSpecies()
	{
		// For All Of The Species, Add Them Into The Pokedex As Unseen.
	}
	
	public void OutputDex()
	{
		// Will Output The Dex
	}
}
