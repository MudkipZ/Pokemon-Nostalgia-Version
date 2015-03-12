package crawford.matthew.pokegen;
import java.util.Random;

public class Nature
{
	private String name;
	private int[] StatMods=new int[5];
	
	public Nature()
	{
		Random r=new Random();
		int rp=r.nextInt(5);
		int rm=r.nextInt();
		StatMods[r.nextInt(5)]+=.1;
		StatMods[r.nextInt(5)]-=.1;
		
		
	}
}
