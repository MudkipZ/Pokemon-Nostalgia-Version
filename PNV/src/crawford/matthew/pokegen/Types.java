package crawford.matthew.pokegen;
import java.util.ArrayList;

/**
 * Class That Generates All Of The Pokemon Types Present Before Gen 4.
 * @author Justin Miller
 * @author Matthew Crawford
 *
 */
public class Types {
	public final static Type Rock = Type.getBaseType("Rock");
	public final static Type Steel = Type.getBaseType("Steel");
	public final static Type Fighting = Type.getBaseType("Fighting");
	public final static Type Flying = Type.getBaseType("Flying");
	public final static Type Ground = Type.getBaseType("Ground");
	public final static Type Fire = Type.getBaseType("Fire");
	public final static Type Water = Type.getBaseType("Water");
	public final static Type Bug = Type.getBaseType("Bug");
	public final static Type Grass = Type.getBaseType("Grass");
	public final static Type Poison = Type.getBaseType("Poison");
	public final static Type Ghost = Type.getBaseType("Ghost");
	public final static Type Dark = Type.getBaseType("Dark");
	public final static Type Psychic = Type.getBaseType("Psychic");
	public final static Type Ice = Type.getBaseType("Ice");
	public final static Type Electric = Type.getBaseType("Electric");
	public final static Type Dragon = Type.getBaseType("Dragon");
	public final static Type Normal = Type.getBaseType("Normal");
	
	/**
	 * Initializes Each Type With All Immunities, Weaknesses, And Resistances.
	 */
	public static void initTypes()
	{
		Normal.immunities.add(Ghost);
		Normal.weaknesses.add(Fighting);
		
		Dragon.weaknesses.add(Dragon);
		Dragon.weaknesses.add(Ice);
		Dragon.resistances.add(Water);
		Dragon.resistances.add(Fire);
		Dragon.resistances.add(Grass);
		Dragon.resistances.add(Electric);
		
		Electric.weaknesses.add(Ground);
		Electric.resistances.add(Electric);
		Electric.resistances.add(Steel);
		
		Ice.weaknesses.add(Fighting);
		Ice.weaknesses.add(Rock);
		Ice.weaknesses.add(Steel);
		Ice.weaknesses.add(Fire);
		Ice.resistances.add(Ice);
		
		Psychic.weaknesses.add(Dark);
		Psychic.weaknesses.add(Bug);
		Psychic.weaknesses.add(Ghost);
		Psychic.resistances.add(Fighting);
		Psychic.resistances.add(Psychic);
		
		Dark.immunities.add(Psychic);
		Dark.weaknesses.add(Fighting);
		Dark.weaknesses.add(Bug);
		Dark.resistances.add(Dark);
		Dark.resistances.add(Ghost);
		
		Ghost.immunities.add(Normal);
		Ghost.immunities.add(Fighting);
		Ghost.weaknesses.add(Dark);
		Ghost.weaknesses.add(Ghost);
		Ghost.resistances.add(Bug);
		Ghost.resistances.add(Poison);
		
		Poison.weaknesses.add(Ground);
		Poison.weaknesses.add(Psychic);
		Poison.resistances.add(Poison);
		Poison.resistances.add(Grass);
		Poison.resistances.add(Bug);
		Poison.resistances.add(Fighting);
		
		Grass.weaknesses.add(Fire);
		Grass.weaknesses.add(Ice);
		Grass.weaknesses.add(Poison);
		Grass.weaknesses.add(Bug);
		Grass.weaknesses.add(Flying);
		Grass.resistances.add(Grass);
		Grass.resistances.add(Ground);
		Grass.resistances.add(Water);
		Grass.resistances.add(Electric);
		
		Bug.weaknesses.add(Rock);
		Bug.weaknesses.add(Fire);
		Bug.weaknesses.add(Flying);
		Bug.resistances.add(Grass);
		Bug.resistances.add(Fighting);
		Bug.resistances.add(Ground);
		
		Water.weaknesses.add(Electric);
		Water.weaknesses.add(Grass);
		Water.resistances.add(Fire);
		Water.resistances.add(Water);
		Water.resistances.add(Ice);
		
		Fire.weaknesses.add(Ground);
		Fire.weaknesses.add(Water);
		Fire.weaknesses.add(Rock);
		Fire.resistances.add(Fire);
		Fire.resistances.add(Grass);
		Fire.resistances.add(Bug);
		Fire.resistances.add(Steel);
		Fire.resistances.add(Ice);
		
		Ground.immunities.add(Electric);
		Ground.weaknesses.add(Grass);
		Ground.weaknesses.add(Water);
		Ground.weaknesses.add(Ice);
		Ground.resistances.add(Rock);
		Ground.resistances.add(Poison);
		
		Flying.immunities.add(Ground);
		Flying.weaknesses.add(Electric);
		Flying.weaknesses.add(Rock);
		Flying.weaknesses.add(Ice);
		Flying.resistances.add(Grass);
		Flying.resistances.add(Bug);
		Flying.resistances.add(Fighting);
		
		Fighting.weaknesses.add(Psychic);
		Fighting.weaknesses.add(Flying);
		Fighting.resistances.add(Dark);
		Fighting.resistances.add(Bug);
		Fighting.resistances.add(Rock);
		
		Steel.immunities.add(Poison);
		Steel.weaknesses.add(Fire);
		Steel.weaknesses.add(Ground);
		Steel.weaknesses.add(Fighting);
		Steel.resistances.add(Dark);
		Steel.resistances.add(Ghost);
		Steel.resistances.add(Steel);
		Steel.resistances.add(Grass);
		Steel.resistances.add(Flying);
		Steel.resistances.add(Bug);
		Steel.resistances.add(Dragon);
		
		Rock.weaknesses.add(Fighting);
		Rock.weaknesses.add(Steel);
		Rock.weaknesses.add(Ground);
		Rock.weaknesses.add(Water);
		Rock.weaknesses.add(Grass);
		Rock.resistances.add(Fire);
		Rock.resistances.add(Flying);
		Rock.resistances.add(Poison);
		Rock.resistances.add(Normal);
	}
	
	/**
	 * Inner Class For Types
	 * @author Justin Miller
	 * @author Matthew Crawford
	 */
	public static class Type {
		ArrayList<Type> weaknesses;
		ArrayList<Type> resistances;
		ArrayList<Type> immunities;
		String name;
		
		/**
		 * Default Constructor
		 * @param type The Name Of The Type
		 */
		public Type(String type)
		{
			weaknesses = new ArrayList<Type>();
			resistances = new ArrayList<Type>();
			immunities = new ArrayList<Type>();
			name = type;
		}
		
		/**
		 * Gets The Base Type
		 * @param type
		 * @return
		 */
		public static Type getBaseType(String type)
		{
			return new Type(type);
		}
		@Override
		public String toString()
		{
			return name;
		}
	}
}