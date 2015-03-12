package crawford.matthew.pokegen;
import java.util.Random;

public class PokeGen
{
	private int[] IVs=new int[6];
	private int[] EVs=new int[6];
	private PokemonSpecies Species;
	private Nature Nature;
	private int Experience;
	private int Level;
	private Move[] FourMoves=new Move[4];
 // private Ability Ability;
 // private boolean HasPokerus
	
	public PokeGen()
	{
		this.Species=new PokemonSpecies(6);
	 // HasPokerus=false;
	 // Ability="Blaze";
		this.Nature=new Nature(false,0,0);
		for(int i=0;i<this.IVs.length;i++) this.IVs[i]=new Random().nextInt(32);
		this.Level=5;
		this.Experience=135;
	}
}
