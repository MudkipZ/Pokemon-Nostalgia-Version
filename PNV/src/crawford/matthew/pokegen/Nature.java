package crawford.matthew.pokegen;
import java.util.Random;

public class Nature
{
	private String name;
	private int[] StatMods=new int[5];
	
	public Nature(boolean UnR,int i,int j)
	{
		if(UnR==false)
		{
			Random r=new Random();
			i=r.nextInt(5);
			j=r.nextInt(5);
			StatMods[i]+=.1;
			StatMods[j]-=.1;
		}
		else
		{
			StatMods[i]+=.1;
			StatMods[j]-=.1;
		}
		
		if(i==0 && j==0) this.name="Bashful";
		else if(i==0 && j==1) this.name="Lonely";
		else if(i==0 && j==2) this.name="Adamant";
		else if(i==0 && j==3) this.name="Naughty";
		else if(i==0 && j==4) this.name="Brave";


		else if(i==1 && j==0) this.name="Bold";	
		else if(i==1 && j==1) this.name="Docile";
		else if(i==1 && j==2) this.name="Impish";
		else if(i==1 && j==3) this.name="Lax";
		else if(i==1 && j==4) this.name="Relaxed";
		
		else if(i==2 && j==0) this.name="Modest";	
		else if(i==2 && j==1) this.name="Rash";
		else if(i==2 && j==2) this.name="Mild";
		else if(i==2 && j==3) this.name="Rash";
		else if(i==2 && j==4) this.name="Quiet";

		else if(i==3 && j==0) this.name="Calm";	
		else if(i==3 && j==1) this.name="Gentle";
		else if(i==3 && j==2) this.name="Careful";
		else if(i==3 && j==3) this.name="Docile";
		else if(i==3 && j==4) this.name="Sassy";	

		else if(i==4 && j==0) this.name="Timid";	
		else if(i==4 && j==1) this.name="Hasty";
		else if(i==4 && j==2) this.name="Jolly";
		else if(i==4 && j==3) this.name="Naive";
		else if(i==4 && j==4) this.name="Hardy";
	}
	
	public static Nature[] AllOfEm()
	{
		Nature[] Natures=new Nature[25];
		for(int i=0;i<Natures.length/5;i++)
		{
			for(int j=0;j<Natures.length/5;j++)
			{
				Natures[i+j]=new Nature(true,i,j);
				System.out.println(Natures[i+j].toString());
			}
		}
		return Natures;
	}
	
	public String toString()
	{
		return this.name.toString();
	}
}
