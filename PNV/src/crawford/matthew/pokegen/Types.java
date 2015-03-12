package crawford.matthew.pokegen;

import java.util.ArrayList;

public class Types {
	
	public final static Type Rock = Type.getBaseType("Rock");
	public final static Type Steel = Type.getBaseType("Steel");
	public final static Type Flying = Type.getBaseType("Flying");
	public final static Type Ground = Type.getBaseType("Ground");
	//etc. etc.
	
	public static void initTypes()
	{
		Rock.weak.add(Steel);
		Rock.strong.add(Flying);
		//etc. etc.
	}
	
	public static class Type {
		ArrayList<Type> weak;
		ArrayList<Type> strong;
		ArrayList<Type> ineffective;
		String name;
		public Type(String type)
		{
			weak = new ArrayList<Type>();
			strong = new ArrayList<Type>();
			ineffective = new ArrayList<Type>();
			name = type;
		}
		
		public static Type getBaseType(String type)
		{
			return new Type(type);
		}
	}
}
