package crawford.matthew.pokegen;

public class Move
{
	private boolean isHM;
	private int Power;
	private int Accuracy;
	private int BaseMaxPP;
	private String Name;
	private Types.Type Type;
	
	public Move(String name)
	{
		switch(name)
		{
			case "Scratch": 
				this.Power=40;
				this.Accuracy=100;
				this.isHM=false;
				this.BaseMaxPP=35;
				this.Type=Types.Normal;
			break;
			
			case "Pound":
				this.Power=40;
				this.Accuracy=100;
				this.isHM=false;
				this.BaseMaxPP=35;
				this.Type=Types.Normal;
			break;
			
			case "Tackle":
				this.Power=35;
				this.Accuracy=95;
				this.isHM=false;
				this.BaseMaxPP=35;
				this.Type=Types.Normal;
		}
	}
}
