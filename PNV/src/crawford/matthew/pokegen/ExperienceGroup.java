package crawford.matthew.pokegen;
import java.util.LinkedList;

public class ExperienceGroup {
	private String ExpGroupName;
	private int[] NextLevelExp=new int[101];
	
	public ExperienceGroup(String name) {
		for(int i=1;i<this.NextLevelExp.length;i++) {
			switch(name) {
				case "Fast":
					NextLevelExp[i]=(int)(4*Math.pow(i,3)/5);
					System.out.println(i+"\t"+NextLevelExp[i]);
				break;
				
				case "Medium Fast":
					NextLevelExp[i]=(int)(Math.pow(i,3));
					System.out.println(i+"\t"+NextLevelExp[i]);
				break;
				
				case "Slow":
					NextLevelExp[i]=(int)(5*Math.pow(i,3)/4);
					System.out.println(i+"\t"+NextLevelExp[i]);
				break;
				
				case "MediumSlow":
					NextLevelExp[i]=(int)(6*Math.pow(i,3)/5)-(int)(15*Math.pow(i,2))+100*i-140;
					System.out.println(i+"\t"+NextLevelExp[i]);
				break;
				
				case "Fluctuating":
					if(i<=15) NextLevelExp[i]=(int)(Math.pow(i,3)*((Math.abs((i+1)/3)+24)/50));
					if(i>=15 && i<=36) NextLevelExp[i]=(int)(Math.pow(i,3)*((i+14)/50));
					if(i>=36) NextLevelExp[i]=(int)(Math.pow(i,3)*(Math.abs(i/2)+32)/50);
					System.out.println(i+"\t"+NextLevelExp[i]);
				break;
				
				case "Erratic":
					if(i<=50) NextLevelExp[i]=(int)(Math.pow(i,3)*(100-i)/50);
					if(i>=50 && i<=68) NextLevelExp[i]=(int)(Math.pow(i,3)*(150-i)/100);
					if(i>=68 && i<=98) NextLevelExp[i]=(int)(Math.pow(i,3)*((1911-10*i)/3)/500);
					if(i>=98 && i<=100) NextLevelExp[i]=(int)(Math.pow(i,3)*(160-i)/100);
					System.out.println(NextLevelExp[i]);
				break;
				
				default:
				break;
			}
		}
	}
	
	public static void main(String[] Args) {
		new ExperienceGroup("Erratic");
	}
}
