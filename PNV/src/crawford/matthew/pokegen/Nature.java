package crawford.matthew.pokegen;
import java.util.Random;

public class Nature
{
	private String name;
	private int[] StatMods=new int[5];
	
	public Nature()
	{
		Random r=new Random();
		int[] Manip=new int[2];
		Manip[0]=r.nextInt(5);
		Manip[1]=r.nextInt(5);
		StatMods[Manip[0]]+=.1;
		StatMods[Manip[1]]-=.1;
		
		if(Manip[0]==0 && Manip[1]==0) this.name="Bashful";
		else if(Manip[0]==0 && Manip[1]==1) this.name="Lonely";
		else if(Manip[0]==0 && Manip[1]==2) this.name="Adamant";
		else if(Manip[0]==0 && Manip[1]==3) this.name="Naughty";
		else if(Manip[0]==0 && Manip[1]==4) this.name="Brave";


		else if(Manip[0]==1 && Manip[1]==0) this.name="Bold";	
		else if(Manip[0]==1 && Manip[1]==1) this.name="Docile";
		else if(Manip[0]==1 && Manip[1]==2) this.name="Impish";
		else if(Manip[0]==1 && Manip[1]==3) this.name="Lax";
		else if(Manip[0]==1 && Manip[1]==4) this.name="Relaxed";
		
		else if(Manip[0]==2 && Manip[1]==0) this.name="Modest";	
		else if(Manip[0]==2 && Manip[1]==1) this.name="Rash";
		else if(Manip[0]==2 && Manip[1]==2) this.name="Mild";
		else if(Manip[0]==2 && Manip[1]==3) this.name="Rash";
		else if(Manip[0]==2 && Manip[1]==4) this.name="Quiet";

		else if(Manip[0]==3 && Manip[1]==0) this.name="Calm";	
		else if(Manip[0]==3 && Manip[1]==1) this.name="Gentle";
		else if(Manip[0]==3 && Manip[1]==2) this.name="Careful";
		else if(Manip[0]==3 && Manip[1]==3) this.name="Docile";
		else if(Manip[0]==3 && Manip[1]==4) this.name="Sassy";	

		else if(Manip[0]==4 && Manip[1]==0) this.name="Timid";	
		else if(Manip[0]==4 && Manip[1]==1) this.name="Hasty";
		else if(Manip[0]==4 && Manip[1]==2) this.name="Jolly";
		else if(Manip[0]==4 && Manip[1]==3) this.name="Naive";
		else if(Manip[0]==4 && Manip[1]==4) this.name="Hardy";
	}
	
	public String toString()
	{
		return this.name.toString();
	}
}
