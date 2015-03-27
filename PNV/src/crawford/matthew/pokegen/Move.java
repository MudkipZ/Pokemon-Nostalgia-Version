package crawford.matthew.pokegen;

import java.util.LinkedList;
import java.util.Random;

public class Move
{
	private String Name;
	private int Power=0, Accuracy, BaseMaxPP, Priority, MinHits=1, MaxHits=1;
	private double CritChance=6.25;
	private boolean cantMiss, isHM, isFieldMove, isSpecial, isStatus, isPhysical, isContact, mustRecharge, twoTurns;
	private LinkedList<AddedEffect> AddedEffects=new LinkedList<AddedEffect>();
	private Types.Type Type;
	
	public Move(String name)
	{
		this.Name=name;
		switch(this.Name)
		{
			case "Pound":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=35;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			
			case "Karate Chop":
				this.Power=50;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.CritChance=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
			break;
			
			case "Double Slap":
				this.Power=15;
				this.Accuracy=85;
				this.BaseMaxPP=10;
				this.MinHits=2;
				this.MaxHits=5;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Comet Punch":
				this.Power=18;
				this.Accuracy=85;
				this.BaseMaxPP=15;
				this.MinHits=2;
				this.MaxHits=5;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Mega Punch":
				this.Power=80;
				this.Accuracy=85;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Pay Day":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Gain Money Per Use",2));
			break;
			
			case "Fire Punch":
				this.Power=75;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case "Ice Punch":
				this.Power=75;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Ice;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",10));
			break;
			
			case "Thunder Punch":
				this.Power=75;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
			break;
			
			case "Scratch":
				this.Power=35;
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Vice Grip":
				this.Power=55;
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Guillotine":
				this.Accuracy=30;
				this.BaseMaxPP=5;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("OHKO",100));
			break;
			
			case "Razor Wind":
				this.Power=80;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isSpecial=true;
				this.twoTurns=true;
				this.Type=Types.Normal;
			break;
			
			case "Swords Dance":
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 2 Stages",100));
			break;
			
			case "Cut":
				this.Power=50;
				this.Accuracy=95;
				this.BaseMaxPP=30;
				this.isPhysical=true;
				this.isContact=true;
				this.isFieldMove=true;
				this.isHM=true;
				this.Type=Types.Normal;
			break;
			
			case "Gust":
				this.Power=35;
				this.Accuracy=100;
				this.BaseMaxPP=35;
				this.isSpecial=true;
				this.Type=Types.Flying;
				this.AddedEffects.add(new AddedEffect("Damage Bonus To An Airborne Target",2));
			break;
			
			case "Wing Attack":
				this.Power=60;
				this.Accuracy=100;
				this.BaseMaxPP=35;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Flying;
			break;
			
			case "Whirlwind":
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Flying;
				this.AddedEffects.add(new AddedEffect("Switch Target Into Random Teammate",100));
			break;
			
			case "Fly":
				this.Power=70;
				this.Accuracy=95;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				
				this.isFieldMove=true;
				this.twoTurns=true;
				this.Type=Types.Flying;
			break;
			
			case "Bind":
				this.Power=15;
				this.Accuracy=75;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case "Slam":
				this.Power=80;
				this.Accuracy=75;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Stomp":
				this.Power=65;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Flinch Chance Without Substitute",30));
				this.AddedEffects.add(new AddedEffect("Damage Bonus Against Minimized Targets",2));
			break;
			
			case "Vine Whip":
				this.Power=35;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Grass;
			break;
			
			case "Double Kick":
				this.Power=30;
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.MinHits=2;
				this.MaxHits=2;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
			break;
			
			case "Mega Kick":
				this.Power=120;
				this.Accuracy=75;
				this.BaseMaxPP=5;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Jump Kick":
				this.Power=70;
				this.Accuracy=95;
				this.BaseMaxPP=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Recoil If Misses",.125));
			break;
			
			case "Rolling Kick":
				this.Power=60;
				this.Accuracy=85;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Flinch Chance Without Substitute",30));
			break;
			
			case "Sand Attack":
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.Type=Types.Ground;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case "Headbutt":
				this.Power=70;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.isFieldMove=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Flinch Chance Without Substitute",30));
			break;
			
			case "Horn Attack":
				this.Power=65;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Horn Drill":
				this.Accuracy=30;
				this.BaseMaxPP=5;
				this.isPhysical=true;
				this.isContact=true;
				this.AddedEffects.add(new AddedEffect("OHKO",100));
			break;
			
			case "Tackle":
				this.Power=35;
				this.Accuracy=95;
				this.BaseMaxPP=35;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Body Slam":
				this.Power=85;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
			break;
			
			case "Wrap":
				this.Power=15;
				this.Accuracy=85;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case "Take Down":
				this.Power=90;
				this.Accuracy=85;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Takes Recoil Damage",25));
			break;
			
			case "Thrash":
				this.Power=90;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("In Constant Thrashing For X Turns",2+new Random().nextInt(2)));
				this.AddedEffects.add(new AddedEffect("Once Turn Count Is 0, Confusion Chance",100));
			break;
			
			case "Double-Edge":
				this.Power=120;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Takes Recoil Damage",33.3));
			break;
			
			case "Tail Whip":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 1 Stage",100));
			break;
				
			case "Poison Sting":
				this.Power=15;
				this.Accuracy=100;
				this.BaseMaxPP=35;
				this.isPhysical=true;
				this.Type=Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",30));
			break;
				
			case "Twinneedle":
				this.Power=25;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.MinHits=2;
				this.MaxHits=2;
				this.isPhysical=true;
				this.Type=Types.Bug;
				this.AddedEffects.add(new AddedEffect("Poison Chance",20));
			break;
			
			case "Pin Missle":
				this.Power=14;
				this.Accuracy=85;
				this.BaseMaxPP=20;
				this.MinHits=2;
				this.MaxHits=5;
				this.isPhysical=true;
				this.Type=Types.Bug;
			break;
			
			case "Leer":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 1 Stage",100));
			break;
			
			case "Bite":
				this.Power=60;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Dark;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",10));
			break;
			
			case "Growl":
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Attack Drop 1 Stage",100));
			break;
			
			case "Roar":
				this.Accuracy=100;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Switch Target Into Random Teammate",100));
			break;
			
			case "Sing":
				this.Accuracy=55;
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case "Supersonic":
				this.Accuracy=55;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",100));
			break;
			
			case "Sonic Boom":
				this.Accuracy=90;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Static Damage",20));
			break;
			
			case "Disable":
				this.Accuracy=55;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Disables Move Last Used.",3+new Random().nextInt(5)));
			break;
			
			case "Acid":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isSpecial=true;
				this.Type=Types.Poison;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 1 Stage",10));
			break;
			
			case "Ember":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.isSpecial=true;
				this.Type=Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case "Flamethrower":
				this.Power=95;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isSpecial=true;
				this.Type=Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case "Mist":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.cantMiss=true;
				this.AddedEffects.add(new AddedEffect("Stat Reduction Protection For The Whole Team For 5 Turns",100));
			break;
			
			case "Water Gun":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.isSpecial=true;
				this.Type=Types.Water;
			break;
			
			case "Hydro Pump":
				this.Power=120;
				this.Accuracy=80;
				this.BaseMaxPP=5;
				this.isSpecial=true;
				this.Type=Types.Water;
			break;
			
			case "Surf":
				this.Power=95;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isFieldMove=true;
				this.isHM=true;
				this.isSpecial=true;
				this.Type=Types.Water;
			break;
			
			case "Ice Beam":
				this.Power=95;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isSpecial=true;
				this.Type=Types.Ice;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",10));
			break;
			
			case "Blizzard":
				this.Power=120;
				this.Accuracy=70;
				this.BaseMaxPP=5;
				this.isSpecial=true;
				this.Type=Types.Ice;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",10));
			break;
			
			case "Psybeam":
				this.Power=65;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",10));
			break;
			
			case "Bubble Beam":
				this.Power=65;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Water;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",10));
			break;
			
			case "Aurora Beam":
				this.Power=65;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Ice;
				this.AddedEffects.add(new AddedEffect("Target Attack Drop 1 Stage",10));
			break;
			
			case "Hyper Beam":
				this.Power=150;
				this.Accuracy=90;
				this.isSpecial=true;
				this.mustRecharge=true;
				this.Type=Types.Normal;
			break;
			
			case "Peck":
				this.Power=35;
				this.Accuracy=100;
				this.BaseMaxPP=35;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Flying;
			break;
			
			case "Drill Peck":
				this.Power=80;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Flying;
			break;
			
			case "Submission":
				this.Power=80;
				this.Accuracy=80;
				this.BaseMaxPP=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Recoil Damage",25));
			break;
			
			case "Low Kick":
				this.Power=50; // Weight Dependant
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
			break;
			
			case "Counter":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Deals Double The Damage Of A Physical Move",100));
			break;
			
			case "Seismic Toss":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Deals Damage Equal To User's Level",1));
			break;
			
			case "Strength":
				this.Power=80;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.isFieldMove=true;
				this.isHM=true;
				this.Type=Types.Normal;
			break;
			
			case "Absorb":
				this.Power=20;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			case "Mega Drain":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isSpecial=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			case "Leech Seed":
				this.Accuracy=90;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("Passive Damage",12.5));
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			case "Growth":
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Boost Special Attack 1 Stage",100));
			break;
			
			case "Razor Leaf":
				this.Power=55;
				this.Accuracy=95;
				this.BaseMaxPP=25;
				this.CritChance=25;
				this.isPhysical=true;
				this.Type=Types.Grass;
			break;
			
			case "Solar Beam":
				this.Power=120;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isSpecial=true;
				this.twoTurns=true;
			break;
			
			case "Poison Powder":
				this.Accuracy=75;
				this.BaseMaxPP=35;
				this.isStatus=true;
				this.Type=Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",100));
			break;
			
			case "Stun Spore":
				this.Accuracy=75;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",100));
			break;
			
			case "Sleep Powder":
				this.Accuracy=75;
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case "Petal Dance":
				this.Power=70;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("In Constant Thrashing For X Turns",2+new Random().nextInt(2)));
				this.AddedEffects.add(new AddedEffect("Once Turn Count Is 0, Confusion Chance",100));
			break;
			
			case "String Shot":
				this.Accuracy=95;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.Type=Types.Bug;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",100));
			break;
			
			case "Dragon Rage":
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isSpecial=true;
				this.Type=Types.Dragon;
				this.AddedEffects.add(new AddedEffect("Static Damage",40));
			break;
			
			case "Fire Spin":
				this.Power=35;
				this.Accuracy=85;
				this.BaseMaxPP=15;
				this.isSpecial=true;
				this.Type=Types.Fire;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case "Thunder Shock":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isSpecial=true;
				this.Type=Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
			break;
			
			case "Thunderbolt":
				this.Power=95;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isSpecial=true;
				this.Type=Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
			break;
			
			case "Thunder Wave":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.Type=Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",100));
			break;
			
			case "Thunder":
				this.Power=120;
				this.Accuracy=70;
				this.BaseMaxPP=10;
				this.isSpecial=true;
				this.Type=Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
			break;
			
			case "Rock Throw":
				this.Power=50;
				this.Accuracy=90;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.Type=Types.Rock;
			break;
			
			case "Earthquake":
				this.Power=100;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isPhysical=true;
				this.Type=Types.Ground;
			break;
			
			case "Fissure":
				this.Accuracy=30;
				this.BaseMaxPP=5;
				this.isPhysical=true;
				this.Type=Types.Ground;
				this.AddedEffects.add(new AddedEffect("OHKO",100));
			break;
			
			case "Dig":
				this.Power=60;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isPhysical=true;
				this.isContact=true;
				this.twoTurns=true;
				this.Type=Types.Ground;
			break;
			
			case "Toxic":
				this.Accuracy=85;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.Type=Types.Poison;
				this.AddedEffects.add(new AddedEffect("Bad Poison Chance",100));
			break;
			
			case "Confusion":
				this.Power=50;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.isSpecial=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",10));
			break;
			
			case "Psychic":
				this.Power=90;
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Target Special Defense Drop 1 Stage",10));
			break;
			
			case "Hypnosis":
				this.Accuracy=55;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case "Meditate":
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
			break;
			
			case "Agility":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Speed Boost 2 Stages",100));
			break;
			
			case "Quick Attack":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.Priority=1;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
			break;
			
			case "Rage":
				this.Power=20;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Rage Bonus When Hit With Attack",100));
			break;
			
			case "Teleport":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Evade Battle Or Switch Into Teammate",100));
			break;
			
			case "Night Shade":
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isSpecial=true;
				this.Type=Types.Ghost;
				this.AddedEffects.add(new AddedEffect("Static Damage Equal To User's Level",100));
			break;
			
			case "Mimic":
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Replaces This Move With Last Move Used",100));
			break;
			
			case "Screech":
				this.Accuracy=85;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 2 Stages",100));
			break;
			
			case "Double Team":
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Evasion Boost 1 Stage",100));
			break;
			
			case "Recover":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("HP Recovery",50));
			break;
			
			case "Harden":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case "Minimize":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.cantMiss=true;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Evasion Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("Stomp Damage Increased",2));
			break;
			
			case "Smokescreen":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case "Confuse Ray":
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.Type=Types.Ghost;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",100));
			break;
			
			case "Withdraw":
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Water;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case "Defense Curl":
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case "Barrier":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 2 Stages",100));
			break;
			
			case "Light Screen":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Halves Special Damage Against Whole Party For 5 Turns",100));
			break;
			
			case "Haze":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Ice;
				this.AddedEffects.add(new AddedEffect("All Stat Changes Are Eliminated",100));
			break;
			
			case "Reflect":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Halves Physical Damage Against Whole Party For 5 Turns",100));
			break;
			
			case "Focus Energy":
				this.Accuracy=100;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Crit Chance Boost",100));
			break;
			
			case "Bide":
			break;
			
			case "Metronome":
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Random Move Is Chosen, Most Probable Move Is Explosion",100));
			break;
			
			case "Mirror Move":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Flying;
				this.AddedEffects.add(new AddedEffect("Uses Last Move Used",100));
			break;
			
			case "Self-Destruct":
			break;
			
			case "Egg Bomb":
			break;
			
			case "Lick":
			break;
			
			case "Smog":
			break;
			
			case "Sludge":
			break;
			
			case "Bone Club":
			break;
			
			case "Fire Blast":
			break;
			
			case "Waterfall":
			break;
			
			case "Clamp":
			break;
			
			case "Swift":
			break;
			
			case "Skull Bash":
			break;
			
			case "Spike Cannon":
			break;
			
			case "Constrict":
			break;
			
			case "Amnesia":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Special Defense Boost 2 Stages",100));
			break;
			
			case "Kinesis":
				this.Accuracy=80;
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case "Soft-Boiled":
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("HP Recovery",50));
			break;
			
			case "High Jump Kick":
			break;
			
			case "Glare":
				this.Accuracy=75;
				this.BaseMaxPP=30;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",100));
			break;
			
			case "Dream Eater":
			break;
			
			case "Poison Gas":
				this.Accuracy=55;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.Type=Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",100));
			break;
			
			case "Barrage":
			break;
			
			case "Leech Life":
			break;
			
			
			case "Lovely Kiss":
				this.Accuracy=75;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case "Sky Attack":
			break;
			
			case "Transform":
				this.Accuracy=100;
				this.BaseMaxPP=10;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Transform Into Target",100));
			break;
			
			case "Bubble":
			break;
			
			case "Dizzy Punch":
			break;
			
			case "Spore":
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.Type=Types.Grass;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case "Flash":
				this.Accuracy=70;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.isFieldMove=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case "Psywave":
			break;
			
			case "Splash":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Acid Armor":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Crabhammer":
			break;
			
			case "Explosion":
			break;
			
			case "Fury Swipes":
			break;
			
			case "Bonemerang":
			break;
			
			case "Rest":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Rock Slide":
			break;
			
			case "Hyper Fang":
			break;
			
			case "Sharpen":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Conversion":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Tri Attack":
			break;
			
			case "Super Fang":
			break;
			
			case "Slash":
			break;
			
			case "Substitute":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Struggle":
			break;
			
			case "Sketch":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Triple Kick":
			break;
			
			case "Thief":
			break;
			
			case "Spider Web":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Mind Reader":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Nightmare":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Flame Wheel":
			break;
			
			case "Snore":
			break;
			
			case "Curse":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Flail":
			break;
			
			case "Conversion 2":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Aeroblast":
			break;
			
			case "Cotton Spore":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Reversal":
			break;
			
			case "Spite":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Powder Snow":
			break;
			
			case "Protect":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Mach Punch":
			break;
			
			case "Scary Face":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Feint Attack":
			break;
			
			case "Sweet Kiss":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Belly Drum":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Sludge Bomb":
			break;
			
			case "Mud-Slap":
			break;
			
			case "Octazooka":
			break;
			
			case "Spikes":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Zap Cannon":
			break;
			
			case "Foresight":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Destiny Bond":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Perish Song":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Icy Wind":
			break;
			
			case "Detect":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Bone Rush":
			break;
			
			case "Lock-On":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Outrage":
			break;
			
			case "Sandstorm":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Giga Drain":
			break;
			
			case "Endure":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Charm":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Rollout":
			break;
			
			case "False Swipe":
			break;
			
			case "Swagger":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Milk Drink":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Spark":
			break;
			
			case "Fury Cutter":
			break;
			
			case "Steel Wing":
			break;
			
			case "Mean Look":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Attract":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Sleep Talk":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Heal Bell":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Return":
			break;
			
			case "Present":
			break;
			
			case "Frustration":
			break;
			
			case "Safeguard":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Pain Split":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Sacred Fire":
			break;
			
			case "Magnitude":
			break;
			
			case "Dynamic Punch":
			break;
			
			case "Megahorn":
			break;
			
			case "Dragon Breath":
			break;
			
			case "Baton Pass":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Encore":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Pursuit":
			break;
			
			case "Rapid Spin":
			break;
			
			case "Sweet Scent":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Iron Tail":
			break;
			
			case "Metal Claw":
			break;
			
			case "Vital Throw":
			break;
			
			case "Morning Sun":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Synthesis":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Moonlight":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Hidden Power":
			break;
			
			case "Cross Chop":
			break;
			
			case "Twister":
			break;
			
			case "Rain Dance":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Sunny Day":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Crunch":
			break;
			
			case "Mirror Coat":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Psych Up":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Extreme Speed":
			break;
			
			case "Ancient Power":
			break;
			
			case "Shadow Ball":
			break;
			
			case "Future Sight":
			break;
			
			case "Rock Smash":
			break;
			
			case "Whirlpool":
			break;
			
			case "Beat Up":
			break;
			
			case "Fake Out":
			break;
			
			case "Uproar":
			break;
			
			case "Stockpile":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Spit Up":
			break;
			
			case "Swallow":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Heat Wave":
			break;
			
			case "Hail":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Torment":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Flatter":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Will-O-Wisp":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Memento":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Facade":
			break;
			
			case "Focus Punch":
			break;
			
			case "Smelling Salts":
			break;
			
			case "Follow Me":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Nature Power":
			break;
			
			case "Charge":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Taunt":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Helping Hand":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Trick":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Role Play":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Wish":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Assist":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Ingrain":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Superpower":
			break;
			
			case "Magic Coat":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Recycle":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Revenge":
			break;
			
			case "Brick Break":
			break;
			
			case "Yawn":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Knock Off":
			break;
			
			case "Endeavor":
			break;
			
			case "Eruption":
			break;
			
			case "Skill Swap":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Imprison":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Refresh":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Grudge":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Snatch":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Secret Power":
			break;
			
			case "Dive":
			break;
			
			case "Arm Thrust":
			break;
			
			case "Camouflage":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Tail Glow":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Luster Purge":
			break;
			
			case "Mist Ball":
			break;
			
			case "Feather Dance":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Teeter Dance":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Blaze Kick":
			break;
			
			case "Mud Sport":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Ice Ball":
			break;
			
			case "Needle Arm":
			break;
			
			case "Slack Off":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Hyper Voice":
			break;
			
			case "Poison Fang":
			break;
			
			case "Crush Claw":
			break;
			
			case "Blast Burn":
			break;
			
			case "Hydro Cannon":
			break;
			
			case "Meteor Mash":
			break;
			
			case "Astonish":
			break;
			
			case "Weather Ball":
			break;
			
			case "Aromatherapy":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Fake Tears":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Air Cutter":
			break;
			
			case "Overheat":
			break;
			
			case "Odor Sleuth":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Rock Tomb":
			break;
			
			case "Silver Wind":
			break;
			
			case "Metal Sound":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Grass Whistle":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Tickle":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Cosmic Power":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Water Spout":
			break;
			
			case "Signal Beam":
			break;
			
			case "Shadow Punch":
			break;
			
			case "Extrasensory":
			break;
			
			case "Sky Uppercut":
			break;
			
			case "Sand Tomb":
			break;
			
			case "Sheer Cold":
			break;
			
			case "Muddy Water":
			break;
			
			case "Bullet Seed":
			break;
			
			case "Aerial Ace":
			break;
			
			case "Icicle Spear":
			break;
			
			case "Iron Defense":
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Steel;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 2 Stages",100));
			break;
			
			case "Block":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Howl":
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
			break;
			
			case "Dragon Claw":
				this.Power=80;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Dragon;
			break;
			
			case "Frenzy Plant":
				this.Power=150;
				this.Accuracy=90;
				this.BaseMaxPP=5;
				this.isSpecial=true;
				this.mustRecharge=true;
				this.Type=Types.Grass;
			break;
			
			case "Bulk Up":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Fighting;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case "Bounce":
				this.Power=85;
				this.Accuracy=85;
				this.BaseMaxPP=5;
				this.isPhysical=true;
				this.isContact=true;
				this.twoTurns=true;
				this.Type=Types.Flying;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
				this.AddedEffects.add(new AddedEffect("Damage Boost Against Airborne Target",2));
			break;
			
			case "Mud Shot":
				this.Power=55;
				this.Accuracy=95;
				this.BaseMaxPP=15;
				this.isSpecial=true;
				this.Type=Types.Ground;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",100));
			break;
			
			case "Poison Tail":
				this.Power=50;
				this.Accuracy=100;
				this.BaseMaxPP=25;
				this.CritChance=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",10));
			break;
			
			case "Covet":
				this.Power=40;
				this.Accuracy=100;
				this.BaseMaxPP=40;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Steals Target's Item If User Has No Item",100));
			break;
			
			case "Volt Tackle":
				this.Power=120;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
				this.AddedEffects.add(new AddedEffect("Recoil Damage",(1.0/3.0)));
			break;
			
			case "Magical Leaf":
				this.Power=60;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.cantMiss=true;
				this.isSpecial=true;
				this.Type=Types.Grass;
			break;
			
			case "Water Sport":
				this.Accuracy=100;
				this.BaseMaxPP=5;
				this.isStatus=true;
				this.Type=Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case "Calm Mind":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Special Attack Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("User Special Defense Boost 1 Stage",100));
			break;
			
			case "Leaf Blade":
				this.Power=70;
				this.Accuracy=100;
				this.BaseMaxPP=15;
				this.CritChance=25;
				this.isPhysical=true;
				this.isContact=true;
				this.Type=Types.Grass;
			break;
			
			case "Dragon Dance":
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isStatus=true;
				this.cantMiss=true;
				this.Type=Types.Dragon;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("User Speed Boost 1 Stage",100));
			break;
			
			case "Rock Blast":
			break;
			
			case "Shock Wave":
				this.Power=60;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.cantMiss=true;
				this.Type=Types.Electric;
			break;
			
			case "Water Pulse":
				this.Power=60;
				this.Accuracy=100;
				this.BaseMaxPP=20;
				this.isSpecial=true;
				this.Type=Types.Water;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",20));
			break;
			
			case "Doom Desire":
			break;
			
			case "Psycho Boost":
				this.Power=140;
				this.Accuracy=90;
				this.BaseMaxPP=5;
				this.isSpecial=true;
				this.Type=Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Special Attack Drop 2 Stages",100));
			break;
		}
	}
	
	public static void main(String[] Mudkipz)
	{
		
	}
}
