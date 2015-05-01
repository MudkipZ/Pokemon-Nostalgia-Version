package crawford.matthew.pokegen;
import java.util.LinkedList;

/**
 * Data For Pokemon Species.
 * @author Matthew Crawford
 *
 */

public class PokemonSpecies
{
	private int PokedexNum;
	private String SpeciesName;
	private Types.Type[] SpeciesTypes=new Types.Type[2];
	private int[] BaseStats=new int[6];
	private LinkedList<Move> Movepool;
	
	
	/**
	 * Constructor Using The Pokedex Number.
	 * @param pn The Species Pokedex Number
	 */
	public PokemonSpecies(int pn)
	{
		switch(pn)
		{
			case 1:
				this.PokedexNum=1;
				this.SpeciesName="Bulbasaur";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=49;
				this.BaseStats[2]=49;
				this.BaseStats[3]=65;
				this.BaseStats[4]=65;
				this.BaseStats[5]=45;
				
				break;
				
			case 2:
				this.PokedexNum=2;
				this.SpeciesName="Ivysaur";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=62;
				this.BaseStats[2]=63;
				this.BaseStats[3]=80;
				this.BaseStats[4]=80;
				this.BaseStats[5]=60;
				
				break;
				
			case 3:
				this.PokedexNum=3;
				this.SpeciesName="Venusaur";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=80;
				this.BaseStats[1]=82;
				this.BaseStats[2]=83;
				this.BaseStats[3]=100;
				this.BaseStats[4]=100;
				this.BaseStats[5]=80;
				
				break;
				
			case 4:
				this.PokedexNum=4;
				this.SpeciesName="Charmander";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=39;
				this.BaseStats[1]=52;
				this.BaseStats[2]=43;
				this.BaseStats[3]=60;
				this.BaseStats[4]=50;
				this.BaseStats[5]=65;
				
				break;
				
			case 5:
				this.PokedexNum=5;
				this.SpeciesName="Charmeleon";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=58;
				this.BaseStats[1]=64;
				this.BaseStats[2]=58;
				this.BaseStats[3]=80;
				this.BaseStats[4]=65;
				this.BaseStats[5]=80;
				
				break;
				
			case 6:
				this.PokedexNum=6;
				this.SpeciesName="Charizard";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=78;
				this.BaseStats[1]=84;
				this.BaseStats[2]=78;
				this.BaseStats[3]=109;
				this.BaseStats[4]=85;
				this.BaseStats[5]=100;
				
				break;
				
			case 7:
				this.PokedexNum=7;
				this.SpeciesName="Squirtle";
				
				this.SpeciesTypes[0]=Types.Water;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=44;
				this.BaseStats[1]=48;
				this.BaseStats[2]=65;
				this.BaseStats[3]=50;
				this.BaseStats[4]=64;
				this.BaseStats[5]=43;
				
				break;
				
			case 8:
				this.PokedexNum=8;
				this.SpeciesName="Wartortle";
				
				this.SpeciesTypes[0]=Types.Water;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=59;
				this.BaseStats[1]=63;
				this.BaseStats[2]=80;
				this.BaseStats[3]=65;
				this.BaseStats[4]=80;
				this.BaseStats[5]=58;
				
				break;
				
			case 9:
				this.PokedexNum=9;
				this.SpeciesName="Blastoise";
				
				this.SpeciesTypes[0]=Types.Water;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=79;
				this.BaseStats[1]=83;
				this.BaseStats[2]=100;
				this.BaseStats[3]=85;
				this.BaseStats[4]=105;
				this.BaseStats[5]=78;
				
				break;
				
			case 10:
				this.PokedexNum=10;
				this.SpeciesName="Caterpie";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=30;
				this.BaseStats[2]=35;
				this.BaseStats[3]=20;
				this.BaseStats[4]=20;
				this.BaseStats[5]=45;
				
				break;
				
			case 11:
				this.PokedexNum=11;
				this.SpeciesName="Metapod";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=50;
				this.BaseStats[1]=20;
				this.BaseStats[2]=55;
				this.BaseStats[3]=25;
				this.BaseStats[4]=25;
				this.BaseStats[5]=30;
				
				break;
				
			case 12:
				this.PokedexNum=12;
				this.SpeciesName="Butterfree";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=45;
				this.BaseStats[2]=50;
				this.BaseStats[3]=90;
				this.BaseStats[4]=80;
				this.BaseStats[5]=70;
				
				break;
				
			case 13:
				this.PokedexNum=13;
				this.SpeciesName="Weedle";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=35;
				this.BaseStats[2]=30;
				this.BaseStats[3]=20;
				this.BaseStats[4]=20;
				this.BaseStats[5]=50;
				
				break;
				
			case 14:
				this.PokedexNum=14;
				this.SpeciesName="Kakuna";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=25;
				this.BaseStats[2]=50;
				this.BaseStats[3]=25;
				this.BaseStats[4]=25;
				this.BaseStats[5]=35;
				
				break;
				
			case 15:
				this.PokedexNum=15;
				this.SpeciesName="Beedrill";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=65;
				this.BaseStats[1]=90;
				this.BaseStats[2]=40;
				this.BaseStats[3]=45;
				this.BaseStats[4]=80;
				this.BaseStats[5]=75;
				
				break;
				
			case 16:
				this.PokedexNum=16;
				this.SpeciesName="Pidgey";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=45;
				this.BaseStats[2]=40;
				this.BaseStats[3]=35;
				this.BaseStats[4]=35;
				this.BaseStats[5]=56;
				
				break;
				
			case 17:
				this.PokedexNum=17;
				this.SpeciesName="Pidgeotto";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=63;
				this.BaseStats[1]=60;
				this.BaseStats[2]=55;
				this.BaseStats[3]=50;
				this.BaseStats[4]=50;
				this.BaseStats[5]=71;
				
				break;
				
			case 18:
				this.PokedexNum=18;
				this.SpeciesName="Pidgeot";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=83;
				this.BaseStats[1]=80;
				this.BaseStats[2]=75;
				this.BaseStats[3]=70;
				this.BaseStats[4]=70;
				this.BaseStats[5]=101;
				
				break;
				
			case 19:
				this.PokedexNum=19;
				this.SpeciesName="Rattata";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=30;
				this.BaseStats[1]=56;
				this.BaseStats[2]=35;
				this.BaseStats[3]=25;
				this.BaseStats[4]=35;
				this.BaseStats[5]=72;
				
				break;
				
			case 20:
				this.PokedexNum=20;
				this.SpeciesName="Raticate";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=55;
				this.BaseStats[1]=81;
				this.BaseStats[2]=60;
				this.BaseStats[3]=50;
				this.BaseStats[4]=70;
				this.BaseStats[5]=97;
				
				break;
				
			case 21:
				this.PokedexNum=21;
				this.SpeciesName="Spearow";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=60;
				this.BaseStats[2]=30;
				this.BaseStats[3]=31;
				this.BaseStats[4]=31;
				this.BaseStats[5]=70;
				
				break;
				
			case 22:
				this.PokedexNum=22;
				this.SpeciesName="Fearow";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=65;
				this.BaseStats[1]=90;
				this.BaseStats[2]=65;
				this.BaseStats[3]=61;
				this.BaseStats[4]=61;
				this.BaseStats[5]=100;
				
				break;
				
			case 23:
				this.PokedexNum=23;
				this.SpeciesName="Ekans";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=35;
				this.BaseStats[1]=60;
				this.BaseStats[2]=44;
				this.BaseStats[3]=40;
				this.BaseStats[4]=54;
				this.BaseStats[5]=55;
				
				break;
				
			case 24:
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case 25:
				this.PokedexNum=25;
				this.SpeciesName="Pikachu";
				
				this.SpeciesTypes[0]=Types.Electric;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=35;
				this.BaseStats[1]=55;
				this.BaseStats[2]=40;
				this.BaseStats[3]=50;
				this.BaseStats[4]=50;
				this.BaseStats[5]=90;
				
				break;
				
			case 26:
				this.PokedexNum=26;
				this.SpeciesName="Raichu";
				
				this.SpeciesTypes[0]=Types.Electric;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=90;
				this.BaseStats[2]=55;
				this.BaseStats[3]=90;
				this.BaseStats[4]=80;
				this.BaseStats[5]=110;
				
				break;
				
			case 27:
				this.PokedexNum=27;
				this.SpeciesName="Sandshrew";
				
				this.SpeciesTypes[0]=Types.Ground;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=50;
				this.BaseStats[1]=75;
				this.BaseStats[2]=85;
				this.BaseStats[3]=20;
				this.BaseStats[4]=30;
				this.BaseStats[5]=40;
				
				break;
				
			case 28:
				this.PokedexNum=28;
				this.SpeciesName="Sandslash";
				
				this.SpeciesTypes[0]=Types.Ground;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=75;
				this.BaseStats[1]=100;
				this.BaseStats[2]=110;
				this.BaseStats[3]=45;
				this.BaseStats[4]=55;
				this.BaseStats[5]=65;
				
				break;
				
			case 29:
				this.PokedexNum=29;
				this.SpeciesName="NidoranF";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=55;
				this.BaseStats[1]=47;
				this.BaseStats[2]=52;
				this.BaseStats[3]=40;
				this.BaseStats[4]=40;
				this.BaseStats[5]=41;
				
				break;
				
			case 30:
				this.PokedexNum=30;
				this.SpeciesName="Nidorina";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=70;
				this.BaseStats[1]=62;
				this.BaseStats[2]=67;
				this.BaseStats[3]=55;
				this.BaseStats[4]=55;
				this.BaseStats[5]=56;
				
				break;
				
			case 31:
				this.PokedexNum=31;
				this.SpeciesName="Nidoqueen";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Ground;
				
				this.BaseStats[0]=90;
				this.BaseStats[1]=92;
				this.BaseStats[2]=87;
				this.BaseStats[3]=75;
				this.BaseStats[4]=85;
				this.BaseStats[5]=76;
				
				break;
				
			case 32:
				this.PokedexNum=32;
				this.SpeciesName="NidoranM";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=46;
				this.BaseStats[1]=57;
				this.BaseStats[2]=40;
				this.BaseStats[3]=40;
				this.BaseStats[4]=40;
				this.BaseStats[5]=50;
				
				break;
				
			case 33:
				this.PokedexNum=33;
				this.SpeciesName="Nidorino";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=61;
				this.BaseStats[1]=72;
				this.BaseStats[2]=57;
				this.BaseStats[3]=55;
				this.BaseStats[4]=55;
				this.BaseStats[5]=65;
				
				break;
				
			case 34:
				this.PokedexNum=34;
				this.SpeciesName="Nidoking";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Ground;
				
				this.BaseStats[0]=81;
				this.BaseStats[1]=102;
				this.BaseStats[2]=77;
				this.BaseStats[3]=85;
				this.BaseStats[4]=75;
				this.BaseStats[5]=85;
				
				break;
				
			case 35:
				this.PokedexNum=35;
				this.SpeciesName="Clefairy";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=70;
				this.BaseStats[1]=45;
				this.BaseStats[2]=48;
				this.BaseStats[3]=60;
				this.BaseStats[4]=65;
				this.BaseStats[5]=35;
				
				break;
				
			case 36:
				this.PokedexNum=36;
				this.SpeciesName="Clefable";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=95;
				this.BaseStats[1]=70;
				this.BaseStats[2]=73;
				this.BaseStats[3]=95;
				this.BaseStats[4]=90;
				this.BaseStats[5]=60;
				
				break;
				
			case 37:
				this.PokedexNum=37;
				this.SpeciesName="Vulpix";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=38;
				this.BaseStats[1]=41;
				this.BaseStats[2]=40;
				this.BaseStats[3]=50;
				this.BaseStats[4]=65;
				this.BaseStats[5]=65;
				
				break;
				
			case 38:
				this.PokedexNum=38;
				this.SpeciesName="Ninetales";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=73;
				this.BaseStats[1]=76;
				this.BaseStats[2]=75;
				this.BaseStats[3]=81;
				this.BaseStats[4]=100;
				this.BaseStats[5]=100;
				
				break;
				
			case 39:
				this.PokedexNum=39;
				this.SpeciesName="Jigglypuff";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=115;
				this.BaseStats[1]=45;
				this.BaseStats[2]=20;
				this.BaseStats[3]=45;
				this.BaseStats[4]=25;
				this.BaseStats[5]=20;
				
				break;
				
			case 40:
				this.PokedexNum=40;
				this.SpeciesName="Wigglytuff";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=140;
				this.BaseStats[1]=70;
				this.BaseStats[2]=45;
				this.BaseStats[3]=85;
				this.BaseStats[4]=50;
				this.BaseStats[5]=45;
				
				break;
				
			case 41:
				this.PokedexNum=41;
				this.SpeciesName="Zubat";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=45;
				this.BaseStats[2]=35;
				this.BaseStats[3]=30;
				this.BaseStats[4]=40;
				this.BaseStats[5]=55;
				
				break;
				
			case 42:
				this.PokedexNum=42;
				this.SpeciesName="Golbat";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=75;
				this.BaseStats[1]=80;
				this.BaseStats[2]=70;
				this.BaseStats[3]=65;
				this.BaseStats[4]=75;
				this.BaseStats[5]=90;
				
				break;
				
			case 43:
				this.PokedexNum=43;
				this.SpeciesName="Oddish";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=50;
				this.BaseStats[2]=55;
				this.BaseStats[3]=75;
				this.BaseStats[4]=65;
				this.BaseStats[5]=30;
				
				break;
				
			case 44:
				this.PokedexNum=44;
				this.SpeciesName="Gloom";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=65;
				this.BaseStats[2]=70;
				this.BaseStats[3]=85;
				this.BaseStats[4]=75;
				this.BaseStats[5]=40;
				
				break;
				
			case 45:
				this.PokedexNum=45;
				this.SpeciesName="Vileplume";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=75;
				this.BaseStats[1]=80;
				this.BaseStats[2]=85;
				this.BaseStats[3]=110;
				this.BaseStats[4]=90;
				this.BaseStats[5]=50;
				
				break;
				
			case 46:
				this.PokedexNum=46;
				this.SpeciesName="Paras";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Grass;
				
				this.BaseStats[0]=35;
				this.BaseStats[1]=70;
				this.BaseStats[2]=55;
				this.BaseStats[3]=45;
				this.BaseStats[4]=55;
				this.BaseStats[5]=25;
				
				break;
				
			case 47:
				this.PokedexNum=47;
				this.SpeciesName="Parasect";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Grass;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=95;
				this.BaseStats[2]=80;
				this.BaseStats[3]=60;
				this.BaseStats[4]=80;
				this.BaseStats[5]=30;
				
				break;
				
			case 48:
				this.PokedexNum=48;
				this.SpeciesName="Venonat";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=55;
				this.BaseStats[2]=50;
				this.BaseStats[3]=40;
				this.BaseStats[4]=55;
				this.BaseStats[5]=45;
				
				break;
				
			case 49:
				this.PokedexNum=49;
				this.SpeciesName="Venomoth";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=70;
				this.BaseStats[1]=65;
				this.BaseStats[2]=60;
				this.BaseStats[3]=90;
				this.BaseStats[4]=75;
				this.BaseStats[5]=90;
				
				break;
				
			case 50:
				this.PokedexNum=50;
				this.SpeciesName="Diglett";
				
				this.SpeciesTypes[0]=Types.Ground;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=10;
				this.BaseStats[1]=55;
				this.BaseStats[2]=25;
				this.BaseStats[3]=35;
				this.BaseStats[4]=45;
				this.BaseStats[5]=95;
				
				break;
			case 52:
				this.PokedexNum = 52;
				this.SpeciesName = "Meowth";
				
				this.SpeciesTypes[0] = Types.Normal;
				this.SpeciesTypes[1] = null;
				
				this.BaseStats[0]=40;//hp
				this.BaseStats[1]=45;//attk
				this.BaseStats[2]=35;//def
				this.BaseStats[3]=40;//sp atk
				this.BaseStats[4]=40;//sp def
				this.BaseStats[5]=90;//spd
				
				break;
			case 53:
				this.PokedexNum = 53;
				this.SpeciesName = "Persian";
				
				this.SpeciesTypes[0] = Types.Normal;
				this.SpeciesTypes[1] = null;
				
				this.BaseStats[0]=65;//hp
				this.BaseStats[1]=70;//attk
				this.BaseStats[2]=60;//def
				this.BaseStats[3]=65;//sp atk
				this.BaseStats[4]=65;//sp def
				this.BaseStats[5]=115;//spd
		}
	}
	/**
	 * Constructor Using Species Name, As Opposed To Pokedex Number
	 * @param sn The Species To Be Created Name
	 */
	public PokemonSpecies(String sn)
	{
		switch(sn)
		{
			case "Bulbasaur":
				this.PokedexNum=1;
				this.SpeciesName="Bulbasaur";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=49;
				this.BaseStats[2]=49;
				this.BaseStats[3]=65;
				this.BaseStats[4]=65;
				this.BaseStats[5]=45;
				
				break;
				
			case "Ivysaur":
				this.PokedexNum=2;
				this.SpeciesName="Ivysaur";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=62;
				this.BaseStats[2]=63;
				this.BaseStats[3]=80;
				this.BaseStats[4]=80;
				this.BaseStats[5]=60;
				
				break;
				
			case "Venusaur":
				this.PokedexNum=3;
				this.SpeciesName="Venusaur";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=80;
				this.BaseStats[1]=82;
				this.BaseStats[2]=83;
				this.BaseStats[3]=100;
				this.BaseStats[4]=100;
				this.BaseStats[5]=80;
				
				break;
				
			case "Charmander":
				this.PokedexNum=4;
				this.SpeciesName="Charmander";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=39;
				this.BaseStats[1]=52;
				this.BaseStats[2]=43;
				this.BaseStats[3]=60;
				this.BaseStats[4]=50;
				this.BaseStats[5]=65;
				
				break;
				
			case "Charmeleon":
				this.PokedexNum=5;
				this.SpeciesName="Charmeleon";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=58;
				this.BaseStats[1]=64;
				this.BaseStats[2]=58;
				this.BaseStats[3]=80;
				this.BaseStats[4]=65;
				this.BaseStats[5]=80;
				
				break;
				
			case "Charizard":
				this.PokedexNum=6;
				this.SpeciesName="Charizard";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=78;
				this.BaseStats[1]=84;
				this.BaseStats[2]=78;
				this.BaseStats[3]=109;
				this.BaseStats[4]=85;
				this.BaseStats[5]=100;
				
				break;
				
			case "Squirtle":
				this.PokedexNum=7;
				this.SpeciesName="Squirtle";
				
				this.SpeciesTypes[0]=Types.Water;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=44;
				this.BaseStats[1]=48;
				this.BaseStats[2]=65;
				this.BaseStats[3]=50;
				this.BaseStats[4]=64;
				this.BaseStats[5]=43;
				
				break;
				
			case "Wartortle":
				this.PokedexNum=8;
				this.SpeciesName="Wartortle";
				
				this.SpeciesTypes[0]=Types.Water;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=59;
				this.BaseStats[1]=63;
				this.BaseStats[2]=80;
				this.BaseStats[3]=65;
				this.BaseStats[4]=80;
				this.BaseStats[5]=58;
				
				break;
				
			case "Blastoise":
				this.PokedexNum=9;
				this.SpeciesName="Blastoise";
				
				this.SpeciesTypes[0]=Types.Water;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=79;
				this.BaseStats[1]=83;
				this.BaseStats[2]=100;
				this.BaseStats[3]=85;
				this.BaseStats[4]=105;
				this.BaseStats[5]=78;
				
				break;
				
			case "Caterpie":
				this.PokedexNum=10;
				this.SpeciesName="Caterpie";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=30;
				this.BaseStats[2]=35;
				this.BaseStats[3]=20;
				this.BaseStats[4]=20;
				this.BaseStats[5]=45;
				
				break;
				
			case "Metapod":
				this.PokedexNum=11;
				this.SpeciesName="Metapod";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=50;
				this.BaseStats[1]=20;
				this.BaseStats[2]=55;
				this.BaseStats[3]=25;
				this.BaseStats[4]=25;
				this.BaseStats[5]=30;
				
				break;
				
			case "Butterfree":
				this.PokedexNum=12;
				this.SpeciesName="Butterfree";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=45;
				this.BaseStats[2]=50;
				this.BaseStats[3]=90;
				this.BaseStats[4]=80;
				this.BaseStats[5]=70;
				
				break;
				
			case "Weedle":
				this.PokedexNum=13;
				this.SpeciesName="Weedle";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=35;
				this.BaseStats[2]=30;
				this.BaseStats[3]=20;
				this.BaseStats[4]=20;
				this.BaseStats[5]=50;
				
				break;
				
			case "Kakuna":
				this.PokedexNum=14;
				this.SpeciesName="Kakuna";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=25;
				this.BaseStats[2]=50;
				this.BaseStats[3]=25;
				this.BaseStats[4]=25;
				this.BaseStats[5]=35;
				
				break;
				
			case "Beedrill":
				this.PokedexNum=15;
				this.SpeciesName="Beedrill";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=65;
				this.BaseStats[1]=90;
				this.BaseStats[2]=40;
				this.BaseStats[3]=45;
				this.BaseStats[4]=80;
				this.BaseStats[5]=75;
				
				break;
				
			case "Pidgey":
				this.PokedexNum=16;
				this.SpeciesName="Pidgey";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=45;
				this.BaseStats[2]=40;
				this.BaseStats[3]=35;
				this.BaseStats[4]=35;
				this.BaseStats[5]=56;
				
				break;
				
			case "Pidgeotto":
				this.PokedexNum=17;
				this.SpeciesName="Pidgeotto";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=63;
				this.BaseStats[1]=60;
				this.BaseStats[2]=55;
				this.BaseStats[3]=50;
				this.BaseStats[4]=50;
				this.BaseStats[5]=71;
				
				break;
				
			case "Pidgeot":
				this.PokedexNum=18;
				this.SpeciesName="Pidgeot";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=83;
				this.BaseStats[1]=80;
				this.BaseStats[2]=75;
				this.BaseStats[3]=70;
				this.BaseStats[4]=70;
				this.BaseStats[5]=101;
				
				break;
				
			case "Rattata":
				this.PokedexNum=19;
				this.SpeciesName="Rattata";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=30;
				this.BaseStats[1]=56;
				this.BaseStats[2]=35;
				this.BaseStats[3]=25;
				this.BaseStats[4]=35;
				this.BaseStats[5]=72;
				
				break;
				
			case "Raticate":
				this.PokedexNum=20;
				this.SpeciesName="Raticate";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=55;
				this.BaseStats[1]=81;
				this.BaseStats[2]=60;
				this.BaseStats[3]=50;
				this.BaseStats[4]=70;
				this.BaseStats[5]=97;
				
				break;
				
			case "Spearow":
				this.PokedexNum=21;
				this.SpeciesName="Spearow";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=60;
				this.BaseStats[2]=30;
				this.BaseStats[3]=31;
				this.BaseStats[4]=31;
				this.BaseStats[5]=70;
				
				break;
				
			case "Fearow":
				this.PokedexNum=22;
				this.SpeciesName="Fearow";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=65;
				this.BaseStats[1]=90;
				this.BaseStats[2]=65;
				this.BaseStats[3]=61;
				this.BaseStats[4]=61;
				this.BaseStats[5]=100;
				
				break;
				
			case "Ekans":
				this.PokedexNum=23;
				this.SpeciesName="Ekans";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=35;
				this.BaseStats[1]=60;
				this.BaseStats[2]=44;
				this.BaseStats[3]=40;
				this.BaseStats[4]=54;
				this.BaseStats[5]=55;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Pikachu":
				this.PokedexNum=25;
				this.SpeciesName="Pikachu";
				
				this.SpeciesTypes[0]=Types.Electric;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=35;
				this.BaseStats[1]=55;
				this.BaseStats[2]=40;
				this.BaseStats[3]=50;
				this.BaseStats[4]=50;
				this.BaseStats[5]=90;
				
				break;
				
			case "Raichu":
				this.PokedexNum=26;
				this.SpeciesName="Raichu";
				
				this.SpeciesTypes[0]=Types.Electric;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=90;
				this.BaseStats[2]=55;
				this.BaseStats[3]=90;
				this.BaseStats[4]=80;
				this.BaseStats[5]=110;
				
				break;
				
			case "Sandshrew":
				this.PokedexNum=27;
				this.SpeciesName="Sandshrew";
				
				this.SpeciesTypes[0]=Types.Ground;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=50;
				this.BaseStats[1]=75;
				this.BaseStats[2]=85;
				this.BaseStats[3]=20;
				this.BaseStats[4]=30;
				this.BaseStats[5]=40;
				
				break;
				
			case "Sandslash":
				this.PokedexNum=28;
				this.SpeciesName="Sandslash";
				
				this.SpeciesTypes[0]=Types.Ground;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=75;
				this.BaseStats[1]=100;
				this.BaseStats[2]=110;
				this.BaseStats[3]=45;
				this.BaseStats[4]=55;
				this.BaseStats[5]=65;
				
				break;
				
			case "NidoranF":
				this.PokedexNum=29;
				this.SpeciesName="NidoranF";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=55;
				this.BaseStats[1]=47;
				this.BaseStats[2]=52;
				this.BaseStats[3]=40;
				this.BaseStats[4]=40;
				this.BaseStats[5]=41;
				
				break;
				
			case "Nidorina":
				this.PokedexNum=30;
				this.SpeciesName="Nidorina";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=70;
				this.BaseStats[1]=62;
				this.BaseStats[2]=67;
				this.BaseStats[3]=55;
				this.BaseStats[4]=55;
				this.BaseStats[5]=56;
				
				break;
				
			case "Nidoqueen":
				this.PokedexNum=31;
				this.SpeciesName="Nidoqueen";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Ground;
				
				this.BaseStats[0]=90;
				this.BaseStats[1]=92;
				this.BaseStats[2]=87;
				this.BaseStats[3]=75;
				this.BaseStats[4]=85;
				this.BaseStats[5]=76;
				
				break;
				
			case "NidoranM":
				this.PokedexNum=32;
				this.SpeciesName="NidoranM";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=46;
				this.BaseStats[1]=57;
				this.BaseStats[2]=40;
				this.BaseStats[3]=40;
				this.BaseStats[4]=40;
				this.BaseStats[5]=50;
				
				break;
				
			case "Nidorino":
				this.PokedexNum=33;
				this.SpeciesName="Nidorino";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=61;
				this.BaseStats[1]=72;
				this.BaseStats[2]=57;
				this.BaseStats[3]=55;
				this.BaseStats[4]=55;
				this.BaseStats[5]=65;
				
				break;
				
			case "Nidoking":
				this.PokedexNum=34;
				this.SpeciesName="Nidoking";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Ground;
				
				this.BaseStats[0]=81;
				this.BaseStats[1]=102;
				this.BaseStats[2]=77;
				this.BaseStats[3]=85;
				this.BaseStats[4]=75;
				this.BaseStats[5]=85;
				
				break;
				
			case "Clefairy":
				this.PokedexNum=35;
				this.SpeciesName="Clefairy";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=70;
				this.BaseStats[1]=45;
				this.BaseStats[2]=48;
				this.BaseStats[3]=60;
				this.BaseStats[4]=65;
				this.BaseStats[5]=35;
				
				break;
				
			case "Clefable":
				this.PokedexNum=36;
				this.SpeciesName="Clefable";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=95;
				this.BaseStats[1]=70;
				this.BaseStats[2]=73;
				this.BaseStats[3]=95;
				this.BaseStats[4]=90;
				this.BaseStats[5]=60;
				
				break;
				
			case "Vulpix":
				this.PokedexNum=37;
				this.SpeciesName="Vulpix";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=38;
				this.BaseStats[1]=41;
				this.BaseStats[2]=40;
				this.BaseStats[3]=50;
				this.BaseStats[4]=65;
				this.BaseStats[5]=65;
				
				break;
				
			case "Ninetales":
				this.PokedexNum=38;
				this.SpeciesName="Ninetales";
				
				this.SpeciesTypes[0]=Types.Fire;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=73;
				this.BaseStats[1]=76;
				this.BaseStats[2]=75;
				this.BaseStats[3]=81;
				this.BaseStats[4]=100;
				this.BaseStats[5]=100;
				
				break;
				
			case "Jigglypuff":
				this.PokedexNum=39;
				this.SpeciesName="Jigglypuff";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=115;
				this.BaseStats[1]=45;
				this.BaseStats[2]=20;
				this.BaseStats[3]=45;
				this.BaseStats[4]=25;
				this.BaseStats[5]=20;
				
				break;
				
			case "Wigglytuff":
				this.PokedexNum=40;
				this.SpeciesName="Wigglytuff";
				
				this.SpeciesTypes[0]=Types.Normal;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=140;
				this.BaseStats[1]=70;
				this.BaseStats[2]=45;
				this.BaseStats[3]=85;
				this.BaseStats[4]=50;
				this.BaseStats[5]=45;
				
				break;
				
			case "Zubat":
				this.PokedexNum=41;
				this.SpeciesName="Zubat";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=40;
				this.BaseStats[1]=45;
				this.BaseStats[2]=35;
				this.BaseStats[3]=30;
				this.BaseStats[4]=40;
				this.BaseStats[5]=55;
				
				break;
				
			case "Golbat":
				this.PokedexNum=42;
				this.SpeciesName="Golbat";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=Types.Flying;
				
				this.BaseStats[0]=75;
				this.BaseStats[1]=80;
				this.BaseStats[2]=70;
				this.BaseStats[3]=65;
				this.BaseStats[4]=75;
				this.BaseStats[5]=90;
				
				break;
				
			case "Oddish":
				this.PokedexNum=43;
				this.SpeciesName="Oddish";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=45;
				this.BaseStats[1]=50;
				this.BaseStats[2]=55;
				this.BaseStats[3]=75;
				this.BaseStats[4]=65;
				this.BaseStats[5]=30;
				
				break;
				
			case "Gloom":
				this.PokedexNum=44;
				this.SpeciesName="Gloom";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=65;
				this.BaseStats[2]=70;
				this.BaseStats[3]=85;
				this.BaseStats[4]=75;
				this.BaseStats[5]=40;
				
				break;
				
			case "Vileplume":
				this.PokedexNum=45;
				this.SpeciesName="Vileplume";
				
				this.SpeciesTypes[0]=Types.Grass;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=75;
				this.BaseStats[1]=80;
				this.BaseStats[2]=85;
				this.BaseStats[3]=110;
				this.BaseStats[4]=90;
				this.BaseStats[5]=50;
				
				break;
				
			case "Paras":
				this.PokedexNum=46;
				this.SpeciesName="Paras";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Grass;
				
				this.BaseStats[0]=35;
				this.BaseStats[1]=70;
				this.BaseStats[2]=55;
				this.BaseStats[3]=45;
				this.BaseStats[4]=55;
				this.BaseStats[5]=25;
				
				break;
				
			case "Parasect":
				this.PokedexNum=47;
				this.SpeciesName="Parasect";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Grass;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=95;
				this.BaseStats[2]=80;
				this.BaseStats[3]=60;
				this.BaseStats[4]=80;
				this.BaseStats[5]=30;
				
				break;
				
			case "Venonat":
				this.PokedexNum=48;
				this.SpeciesName="Venonat";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=55;
				this.BaseStats[2]=50;
				this.BaseStats[3]=40;
				this.BaseStats[4]=55;
				this.BaseStats[5]=45;
				
				break;
				
			case "Venomoth":
				this.PokedexNum=49;
				this.SpeciesName="Venomoth";
				
				this.SpeciesTypes[0]=Types.Bug;
				this.SpeciesTypes[1]=Types.Poison;
				
				this.BaseStats[0]=70;
				this.BaseStats[1]=65;
				this.BaseStats[2]=60;
				this.BaseStats[3]=90;
				this.BaseStats[4]=75;
				this.BaseStats[5]=90;
				
				break;
				
			case "Diglett":
				this.PokedexNum=50;
				this.SpeciesName="Diglett";
				
				this.SpeciesTypes[0]=Types.Ground;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=10;
				this.BaseStats[1]=55;
				this.BaseStats[2]=25;
				this.BaseStats[3]=35;
				this.BaseStats[4]=45;
				this.BaseStats[5]=95;
				
				break;
			/*	
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
			case "Meowth":
				this.PokedexNum = 52;
				this.SpeciesName = "Meowth";
				
				this.SpeciesTypes[0] = Types.Normal;
				this.SpeciesTypes[1] = null;
				
				this.BaseStats[0]=40;//hp
				this.BaseStats[1]=45;//attk
				this.BaseStats[2]=35;//def
				this.BaseStats[3]=40;//sp atk
				this.BaseStats[4]=40;//sp def
				this.BaseStats[5]=90;//spd
				
				break;
			case "Persian":
				this.PokedexNum = 53;
				this.SpeciesName = "Persian";
				
				this.SpeciesTypes[0] = Types.Normal;
				this.SpeciesTypes[1] = null;
				
				this.BaseStats[0]=65;//hp
				this.BaseStats[1]=70;//attk
				this.BaseStats[2]=60;//def
				this.BaseStats[3]=65;//sp atk
				this.BaseStats[4]=65;//sp def
				this.BaseStats[5]=115;//spd
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
			case "Arbok":
				this.PokedexNum=24;
				this.SpeciesName="Arbok";
				
				this.SpeciesTypes[0]=Types.Poison;
				this.SpeciesTypes[1]=null;
				
				this.BaseStats[0]=60;
				this.BaseStats[1]=85;
				this.BaseStats[2]=69;
				this.BaseStats[3]=65;
				this.BaseStats[4]=79;
				this.BaseStats[5]=80;
				
				break;
				
					*/
		}
	}
	public String toString(PokemonSpecies s)
	{
		StringBuilder sb=new StringBuilder();
		sb.append("Dex Num: "+s.PokedexNum+"\t"+s.SpeciesName+"\n");
		if(s.SpeciesTypes[1]!=null)
		{
			sb.append("Types: "+s.SpeciesTypes[0]+"\t"+s.SpeciesTypes[1]+"\n");
		}
		if(s.SpeciesTypes[1]==null)
		{
			sb.append("Types: "+s.SpeciesTypes[0]+"\n");
		}
		sb.append("Base HP             : "+s.BaseStats[0]+"\n");
		sb.append("Base ATTACK         : "+s.BaseStats[1]+"\n");
		sb.append("Base DEFENSE        : "+s.BaseStats[2]+"\n");
		sb.append("Base SPECIAL ATTACK : "+s.BaseStats[3]+"\n");
		sb.append("Base SPECIAL DEFENSE: "+s.BaseStats[4]+"\n");
		sb.append("Base SPEED          : "+s.BaseStats[5]+"\n");
		return sb.toString();
	}
	
	public int[] getBaseStats()
	{
		return this.BaseStats;
	}
	
	public String getSpeciesName()
	{
		return this.SpeciesName;
	}
	
	public static void main(String[] Args) throws Exception
	{
		// PokemonSpecies s=new PokemonSpecies(15);
		// System.out.println(s.toString(s));
		for(int i=1;i<=50;i++)
		{
			PokemonSpecies s=new PokemonSpecies(i);
			System.out.println(s.toString(s));
		}
	}
}
