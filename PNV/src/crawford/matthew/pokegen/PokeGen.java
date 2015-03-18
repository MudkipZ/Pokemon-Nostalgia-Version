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
	private Ability Ability;
	private Move[] FourMoves=new Move[4];
	private boolean HasPokerus;
	
	public PokeGen()
	{
		this.Species=new PokemonSpecies(7);
		HasPokerus=false;
	    this.Ability=new Ability("Blaze");
		this.Nature=new Nature(false,0,0);
		for(int i=0;i<this.IVs.length;i++)
		{
			this.IVs[i]=new Random().nextInt(32);
			this.EVs[i]=0;
		}
		this.Level=5;
		this.Experience=135;
	}
	
	public void outputMon()
	{
		int HPStat=(int)(((float)this.Level/100)*(this.IVs[0]+(2*this.Species.getBaseStats()[0])+(this.EVs[0]/4)+100))+10;
		int AtkStat=(int)(((this.Nature.getStatMods()[0]*(float)(this.Level)/100.0)*(2*this.Species.getBaseStats()[1]+this.IVs[1]+(this.EVs[1]/4))))+5;
		int DefStat=(int)(((this.Nature.getStatMods()[1]*(float)(this.Level)/100.0)*(2*this.Species.getBaseStats()[2]+this.IVs[2]+(this.EVs[2]/4))))+5;
		int SpAStat=(int)(((this.Nature.getStatMods()[2]*(float)(this.Level)/100.0)*(2*this.Species.getBaseStats()[3]+this.IVs[3]+(this.EVs[3]/4))))+5;
		int SpDStat=(int)(((this.Nature.getStatMods()[3]*(float)(this.Level)/100.0)*(2*this.Species.getBaseStats()[4]+this.IVs[4]+(this.EVs[4]/4))))+5;
		int SpeStat=(int)(((this.Nature.getStatMods()[4]*(float)(this.Level)/100.0)*(2*this.Species.getBaseStats()[5]+this.IVs[5]+(this.EVs[5]/4))))+5;
		
		System.out.println(this.Species.getSpeciesName());
		System.out.println("Lv "+this.Level);
		System.out.println(this.Nature+" Nature");
		System.out.println("HP : "+HPStat+"/"+HPStat);
		System.out.println("ATK: "+AtkStat);
		System.out.println("DEF: "+DefStat);
		System.out.println("SPA: "+SpAStat);
		System.out.println("SPD: "+SpDStat);
		System.out.println("SPE: "+SpeStat);
	}
	
	public static void main(String[] Args)
	{
		PokeGen WildMon=new PokeGen();
		WildMon.outputMon();
	}
}
