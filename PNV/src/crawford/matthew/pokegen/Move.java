package crawford.matthew.pokegen;

import java.util.LinkedList;
import java.util.Random;

public class Move
{
	private String Name;
	private int Power = 0, Accuracy, BaseMaxPP, Priority, MinHits = 1, MaxHits = 1,id;
	private double CritChance = 6.25;
	private boolean cantMiss, isHM, isFieldMove, isSpecial, isStatus, isPhysical, isContact, mustRecharge, twoTurns;
	private LinkedList<AddedEffect> AddedEffects = new LinkedList<AddedEffect>();
	private Types.Type Type;
	public Move(int id)
	{
		this.id = id;
		switch(this.id)
		{
			case 1:
				this.Name = "Pound";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 35;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 2:
				this.Name = "Karate Chop";
				this.Power = 50;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.CritChance = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
			break;
			
			case 3:
				this.Name = "Double Slap";
				this.Power = 15;
				this.Accuracy = 85;
				this.BaseMaxPP = 10;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 4:
				this.Name = "Comet Punch";
				this.Power = 18;
				this.Accuracy = 85;
				this.BaseMaxPP = 15;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 5:
				this.Name = "Mega Punch";
				this.Power = 80;
				this.Accuracy = 85;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 6:
				this.Name = "Pay Day";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Gain Money Per Use",2));
			break;
			
			case 7:
				this.Name = "Fire Punch";
				this.Power = 75;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case 8:
				this.Name = "Ice Punch";
				this.Power = 75;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Ice;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",10));
			break;
			
			case 9:
				this.Name = "Thunder Punch";
				this.Power = 75;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
			break;
			
			case 10:
				this.Name = "Scratch";
				this.Power = 35;
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 11:
				this.Name = "Vice Grip";
				this.Power = 55;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 12:
				this.Name = "Guillotine";
				this.Accuracy = 30;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("OHKO",100));
			break;
			
			case 13:
				this.Name = "Razor Wind";
				this.Power = 80;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.twoTurns = true;
				this.Type = Types.Normal;
			break;
			
			case 14:
				this.Name = "Swords Dance";
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 2 Stages",100));
			break;
			
			case 15:
				this.Name = "Cut";
				this.Power = 50;
				this.Accuracy = 95;
				this.BaseMaxPP = 30;
				this.isPhysical = true;
				this.isContact = true;
				this.isFieldMove = true;
				this.isHM = true;
				this.Type = Types.Normal;
			break;
			
			case 16:
				this.Name = "Gust";
				this.Power = 35;
				this.Accuracy = 100;
				this.BaseMaxPP = 35;
				this.isSpecial = true;
				this.Type = Types.Flying;
				this.AddedEffects.add(new AddedEffect("Damage Bonus To An Airborne Target",2));
			break;
			
			case 17:
				this.Name = "Wing Attack";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 35;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Flying;
			break;
			
			case 18:
				this.Name = "Whirlwind";
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Flying;
				this.AddedEffects.add(new AddedEffect("Switch Target Into Random Teammate",100));
			break;
			
			case 19:
				this.Name = "Fly";
				this.Power = 70;
				this.Accuracy = 95;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				
				this.isFieldMove = true;
				this.twoTurns = true;
				this.Type = Types.Flying;
			break;
			
			case 20:
				this.Name = "Bind";
				this.Power = 15;
				this.Accuracy = 75;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case 21:
				this.Name = "Slam";
				this.Power = 80;
				this.Accuracy = 75;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 22:
				this.Name = "Vine Whip";
				this.Power = 35;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Grass;
			break;
			
			case 23:
				this.Name = "Stomp";
				this.Power = 65;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Flinch Chance Without Substitute",30));
				this.AddedEffects.add(new AddedEffect("Damage Bonus Against Minimized Targets",2));
			break;
			
			case 24:
				this.Name = "Double Kick";
				this.Power = 30;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.MinHits = 2;
				this.MaxHits = 2;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
			break;
			
			case 25:
				this.Name = "Mega Kick";
				this.Power = 120;
				this.Accuracy = 75;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 26:
				this.Name = "Jump Kick";
				this.Power = 70;
				this.Accuracy = 95;
				this.BaseMaxPP = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Recoil If Misses",.125));
			break;
			
			case 27:
				this.Name = "Rolling Kick";
				this.Power = 60;
				this.Accuracy = 85;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Flinch Chance Without Substitute",30));
			break;
			
			case 28:
				this.Name = "Sand Attack";
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.Type = Types.Ground;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case 29:
				this.Name = "Headbutt";
				this.Power = 70;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.isFieldMove = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Flinch Chance Without Substitute",30));
			break;
			
			case 30:
				this.Name = "Horn Attack";
				this.Power = 65;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 31:
				this.Name = "Fury Attack";
				this.Power = 15;
				this.Accuracy = 85;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 32:
				this.Name = "Horn Drill";
				this.Accuracy = 30;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.AddedEffects.add(new AddedEffect("OHKO",100));
			break;
			
			case 33:
				this.Name = "Tackle";
				this.Power = 35;
				this.Accuracy = 95;
				this.BaseMaxPP = 35;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 34:
				this.Name = "Body Slam";
				this.Power = 85;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
			break;
			
			case 35:
				this.Name = "Wrap";
				this.Power = 15;
				this.Accuracy = 85;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case 36:
				this.Name = "Take Down";
				this.Power = 90;
				this.Accuracy = 85;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Takes Recoil Damage",25));
			break;
			
			case 37:
				this.Name = "Thrash";
				this.Power = 90;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("In Constant Thrashing For X Turns",2+new Random().nextInt(2)));
				this.AddedEffects.add(new AddedEffect("Once Turn Count Is 0, Confusion Chance",100));
			break;
			
			case 38:
				this.Name = "Double-Edge";
				this.Power = 120;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Takes Recoil Damage",33.3));
			break;
			
			case 39:
				this.Name = "Tail Whip";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 1 Stage",100));
			break;
				
			case 40:
				this.Name = "Poison Sting";
				this.Power = 15;
				this.Accuracy = 100;
				this.BaseMaxPP = 35;
				this.isPhysical = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",30));
			break;
				
			case 41:
				this.Name = "Twinneedle";
				this.Power = 25;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.MinHits = 2;
				this.MaxHits = 2;
				this.isPhysical = true;
				this.Type = Types.Bug;
				this.AddedEffects.add(new AddedEffect("Poison Chance",20));
			break;
			
			case 42:
				this.Name = "Pin Missle";
				this.Power = 14;
				this.Accuracy = 85;
				this.BaseMaxPP = 20;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.isPhysical = true;
				this.Type = Types.Bug;
			break;
			
			case 43:
				this.Name = "Leer";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 1 Stage",100));
			break;
			
			case 44:
				this.Name = "Bite";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Dark;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",10));
			break;
			
			case 45:
				this.Name = "Growl";
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Attack Drop 1 Stage",100));
			break;
			
			case 46:
				this.Name = "Roar";
				this.Accuracy = 100;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Switch Target Into Random Teammate",100));
			break;
			
			case 47:
				this.Name = "Sing";
				this.Accuracy = 55;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case 48:
				this.Name = "Supersonic";
				this.Accuracy = 55;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",100));
			break;
			
			case 49:
				this.Name = "Sonic Boom";
				this.Accuracy = 90;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Static Damage",20));
			break;
			
			case 50:
				this.Name = "Disable";
				this.Accuracy = 55;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Disables Move Last Used.",3+new Random().nextInt(5)));
			break;
			
			case 51:
				this.Name = "Acid";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isSpecial = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 1 Stage",10));
			break;
			
			case 52:
				this.Name = "Ember";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.isSpecial = true;
				this.Type = Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case 53:
				this.Name = "Flamethrower";
				this.Power = 95;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case 54:
				this.Name = "Mist";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.cantMiss = true;
				this.AddedEffects.add(new AddedEffect("Stat Reduction Protection For The Whole Team For 5 Turns",100));
			break;
			
			case 55:
				this.Name = "Water Gun";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.isSpecial = true;
				this.Type = Types.Water;
			break;
			
			case 56:
				this.Name = "Hydro Pump";
				this.Power = 120;
				this.Accuracy = 80;
				this.BaseMaxPP = 5;
				this.isSpecial = true;
				this.Type = Types.Water;
			break;
			
			case 57:
				this.Name = "Surf";
				this.Power = 95;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isFieldMove = true;
				this.isHM = true;
				this.isSpecial = true;
				this.Type = Types.Water;
			break;
			
			case 58:
				this.Name = "Ice Beam";
				this.Power = 95;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.Type = Types.Ice;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",10));
			break;
			
			case 59:
				this.Name = "Blizzard";
				this.Power = 120;
				this.Accuracy = 70;
				this.BaseMaxPP = 5;
				this.isSpecial = true;
				this.Type = Types.Ice;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",10));
			break;
			
			case 60:
				this.Name = "Psybeam";
				this.Power = 65;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",10));
			break;
			
			case 61:
				this.Name = "Bubble Beam";
				this.Power = 65;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Water;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",10));
			break;
			
			case 62:
				this.Name = "Aurora Beam";
				this.Power = 65;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Ice;
				this.AddedEffects.add(new AddedEffect("Target Attack Drop 1 Stage",10));
			break;
			
			case 63:
				this.Name = "Hyper Beam";
				this.Power = 150;
				this.Accuracy = 90;
				this.isSpecial = true;
				this.mustRecharge = true;
				this.Type = Types.Normal;
			break;
			
			case 64:
				this.Name = "Peck";
				this.Power = 35;
				this.Accuracy = 100;
				this.BaseMaxPP = 35;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Flying;
			break;
			
			case 65:
				this.Name = "Drill Peck";
				this.Power = 80;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Flying;
			break;
			
			case 66:
				this.Name = "Submission";
				this.Power = 80;
				this.Accuracy = 80;
				this.BaseMaxPP = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Recoil Damage",25));
			break;
			
			case 67:
				this.Name = "Low Kick";
				this.Power = 50; // Weight Dependant
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
			break;
			
			case 68:
				this.Name = "Counter";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Deals Double The Damage Of A Physical Move",100));
			break;
			
			case 69:
				this.Name = "Seismic Toss";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Deals Damage Equal To User's Level",1));
			break;
			
			case 70: this.Name = "Strength";
				this.Power = 80;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.isFieldMove = true;
				this.isHM = true;
				this.Type = Types.Normal;
			break;
			
			case 71: this.Name = "Absorb";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			case 72: this.Name = "Mega Drain";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			case 73: this.Name = "Leech Seed";
				this.Accuracy = 90;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("Passive Damage",12.5));
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			case 74: this.Name = "Growth";
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Boost Special Attack 1 Stage",100));
			break;
			
			case 75: this.Name = "Razor Leaf";
				this.Power = 55;
				this.Accuracy = 95;
				this.BaseMaxPP = 25;
				this.CritChance = 25;
				this.isPhysical = true;
				this.Type = Types.Grass;
			break;
			
			case 76: this.Name = "Solar Beam";
				this.Power = 120;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.twoTurns = true;
			break;
			
			case 77: this.Name = "Poison Powder";
				this.Accuracy = 75;
				this.BaseMaxPP = 35;
				this.isStatus = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",100));
			break;
			
			case 78: this.Name = "Stun Spore";
				this.Accuracy = 75;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",100));
			break;
			
			case 79: this.Name = "Sleep Powder";
				this.Accuracy = 75;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case 80: this.Name = "Petal Dance";
				this.Power = 70;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("In Constant Thrashing For X Turns",2+new Random().nextInt(2)));
				this.AddedEffects.add(new AddedEffect("Once Turn Count Is 0, Confusion Chance",100));
			break;
			
			case 81: this.Name = "String Shot";
				this.Accuracy = 95;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.Type = Types.Bug;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",100));
			break;
			
			case 82: this.Name = "Dragon Rage";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.Type = Types.Dragon;
				this.AddedEffects.add(new AddedEffect("Static Damage",40));
			break;
			
			case 83: this.Name = "Fire Spin";
				this.Power = 35;
				this.Accuracy = 85;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Fire;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case 84: this.Name = "Thunder Shock";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isSpecial = true;
				this.Type = Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
			break;
			
			case 85: this.Name = "Thunderbolt";
				this.Power = 95;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
			break;
			
			case 86: this.Name = "Thunder Wave";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.Type = Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",100));
			break;
			
			case 87: this.Name = "Thunder";
				this.Power = 120;
				this.Accuracy = 70;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.Type = Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
			break;
			
			case 88: this.Name = "Rock Throw";
				this.Power = 50;
				this.Accuracy = 90;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.Type = Types.Rock;
			break;
			
			case 89: this.Name = "Earthquake";
				this.Power = 100;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.Type = Types.Ground;
			break;
			
			case 90: this.Name = "Fissure";
				this.Accuracy = 30;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.Type = Types.Ground;
				this.AddedEffects.add(new AddedEffect("OHKO",100));
			break;
			
			case 91: this.Name = "Dig";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.isContact = true;
				this.twoTurns = true;
				this.Type = Types.Ground;
			break;
			
			case 92: this.Name = "Toxic";
				this.Accuracy = 85;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Bad Poison Chance",100));
			break;
			
			case 93: this.Name = "Confusion";
				this.Power = 50;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.isSpecial = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",10));
			break;
			
			case 94: this.Name = "Psychic";
				this.Power = 90;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Target Special Defense Drop 1 Stage",10));
			break;
			
			case 95: this.Name = "Hypnosis";
				this.Accuracy = 55;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case 96: this.Name = "Meditate";
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
			break;
			
			case 97: this.Name = "Agility";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Speed Boost 2 Stages",100));
			break;
			
			case 98: this.Name = "Quick Attack";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.Priority = 1;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 99: this.Name = "Rage";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Rage Bonus When Hit With Attack",100));
			break;
			
			case 100: this.Name = "Teleport";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Evade Battle Or Switch Into Teammate",100));
			break;
			
			case 101: this.Name = "Night Shade";
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Ghost;
				this.AddedEffects.add(new AddedEffect("Static Damage Equal To User's Level",100));
			break;
			
			case 102: this.Name = "Mimic";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Replaces This Move With Last Move Used",100));
			break;
			
			case 103: this.Name = "Screech";
				this.Accuracy = 85;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Defense Drop 2 Stages",100));
			break;
			
			case 104: this.Name = "Double Team";
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Evasion Boost 1 Stage",100));
			break;
			
			case 105: this.Name = "Recover";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("HP Recovery",50));
			break;
			
			case 106: this.Name = "Harden";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case 107: this.Name = "Minimize";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Evasion Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("Stomp Damage Increased",2));
			break;
			
			case 108: this.Name = "Smokescreen";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case 109: this.Name = "Confuse Ray";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.Type = Types.Ghost;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",100));
			break;
			
			case 110: this.Name = "Withdraw";
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Water;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case 111: this.Name = "Defense Curl";
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case 112: this.Name = "Barrier";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 2 Stages",100));
			break;
			
			case 113: this.Name = "Light Screen";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Halves Special Damage Against Whole Party For 5 Turns",100));
			break;
			
			case 114: this.Name = "Haze";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Ice;
				this.AddedEffects.add(new AddedEffect("All Stat Changes Are Eliminated",100));
			break;
			
			case 115: this.Name = "Reflect";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Halves Physical Damage Against Whole Party For 5 Turns",100));
			break;
			
			case 116: this.Name = "Focus Energy";
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Crit Chance Boost",100));
			break;
			
			case 117: this.Name = "Bide";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Deals Damage Equal To Damage Dealt During 2 Turns",2));
			break;
			
			case 118: this.Name = "Metronome";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Random Move Is Chosen, Most Probable Move Is Explosion",100));
			break;
			
			case 119: this.Name = "Mirror Move";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Flying;
				this.AddedEffects.add(new AddedEffect("Uses Last Move Used",100));
			break;
			
			case 120: this.Name = "Self-Destruct";
				this.Power = 200;
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Self-Destruct Chance",100));
			break;
			
			case 121: this.Name = "Egg Bomb";
				this.Power = 100;
				this.Accuracy = 75;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.Type = Types.Normal;
			break;
			
			case 122: this.Name = "Lick";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Ghost;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
			break;
			
			case 123: this.Name = "Smog";
				this.Power = 20;
				this.Accuracy = 70;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",40));
			break;
			
			case 124: this.Name = "Sludge";
				this.Power = 65;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("",30));
			break;
			
			case 125: this.Name = "Bone Club";
				this.Power = 65;
				this.Accuracy = 85;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.Type = Types.Ground;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",10));
			break;
			
			case 126: this.Name = "Fire Blast";
				this.Power = 120;
				this.Accuracy = 85;
				this.BaseMaxPP = 5;
				this.isSpecial = true;
				this.Type = Types.Fire;
				this.AddedEffects.add(new AddedEffect("Burn Chance",10));
			break;
			
			case 127: this.Name = "Waterfall";
				this.Power = 80;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",10));
			break;
			
			case 128: this.Name = "Clamp";
				this.Power = 35;
				this.Accuracy = 75;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Water;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Out",2+new Random().nextInt(4)));
				this.AddedEffects.add(new AddedEffect("Passive Damage Per Turn",.0625));
			break;
			
			case 129: this.Name = "Swift";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
			break;
			
			case 130: this.Name = "Skull Bash";
				this.Power = 120;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.twoTurns = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case 131: this.Name = "Spike Cannon";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.isPhysical = true;
				this.Type = Types.Normal;
			break;
			
			case 132: this.Name = "Constrict";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 35;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",10));
			break;
			
			case 133: this.Name = "Amnesia";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Special Defense Boost 2 Stages",100));
			break;
			
			case 134: this.Name = "Kinesis";
				this.Accuracy = 80;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case 135: this.Name = "Soft-Boiled";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("HP Recovery",50));
			break;
			
			case 136: this.Name = "High Jump Kick";
				this.Power = 85;
				this.Accuracy = 90;
				this.BaseMaxPP = 20;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Crash Damage",50));
			break;
			
			case 137: this.Name = "Glare";
				this.Accuracy = 75;
				this.BaseMaxPP = 30;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",100));
			break;
			
			case 138: this.Name = "Dream Eater";
				this.Power = 100;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
				this.AddedEffects.add(new AddedEffect("Opponent Must Be Asleep",100));
			break;
			
			case 139: this.Name = "Poison Gas";
				this.Accuracy = 55;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",100));
			break;
			
			case 140: this.Name = "Barrage";
				this.Power = 15;
				this.Accuracy = 85;
				this.BaseMaxPP = 20;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.isPhysical = true;
				this.Type = Types.Normal;
			break;
			
			case 141: this.Name = "Leech Life";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Bug;
				this.AddedEffects.add(new AddedEffect("HP Absorbtion",50));
			break;
			
			
			case 142: this.Name = "Lovely Kiss";
				this.Accuracy = 75;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case 143: this.Name = "Sky Attack";
				this.Power = 140;
				this.Accuracy = 90;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.twoTurns = true;
				this.Type = Types.Flying;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",30));
			break;
			
			case 144: this.Name = "Transform";
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Transform Into Target",100));
			break;
			
			case 145: this.Name = "Bubble";
				this.Power = 20;
				this.Accuracy = 100;
				this.BaseMaxPP = 30;
				this.isSpecial = true;
				this.Type = Types.Water;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",10));
			break;
			
			case 146: this.Name = "Dizzy Punch";
				this.Power = 70;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",20));
			break;
			
			case 147: this.Name = "Spore";
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.Type = Types.Grass;
				this.AddedEffects.add(new AddedEffect("Sleep Chance",100));
			break;
			
			case 148: this.Name = "Flash";
				this.Accuracy = 70;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.isFieldMove = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Accuracy Drop 1 Stage",100));
			break;
			
			case 149: this.Name = "Psywave";
				this.Accuracy = 80;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("Static Damage Ranging From 1 To 1.5 Times The User's Level",100));
			break;
			
			case 150: this.Name = "Splash";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 151: this.Name = "Acid Armor";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 152: this.Name = "Crabhammer";
				this.Power = 90;
				this.Accuracy = 85;
				this.BaseMaxPP = 10;
				this.CritChance = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Water;
			break;
			
			case 153: this.Name = "Explosion";
				this.Power = 250;
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Self-Destruct Chance",100));
			break;
			
			case 154: this.Name = "Fury Swipes";
				this.Power = 18;
				this.Accuracy = 80;
				this.BaseMaxPP = 15;
				this.MinHits = 2;
				this.MaxHits = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 155: this.Name = "Bonemerang";
				this.Power = 50;
				this.Accuracy = 90;
				this.BaseMaxPP = 10;
				this.MinHits = 2;
				this.MaxHits = 2;
				this.isPhysical = true;
				this.Type = Types.Ground;
			break;
			
			case 156: this.Name = "Rest";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 157: this.Name = "Rock Slide";
				this.Power = 75;
				this.Accuracy = 90;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.Type = Types.Rock;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",30));
			break;
			
			case 158: this.Name = "Hyper Fang";
				this.Power = 80;
				this.Accuracy = 90;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Flinch Chance",10));
			break;
			
			case 159: this.Name = "Sharpen";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 160: this.Name = "Conversion";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 161: this.Name = "Tri Attack";
				this.Power = 80;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isSpecial = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Freeze Chance",6.67));
				this.AddedEffects.add(new AddedEffect("Burn Chance",6.67));
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",6.67));
			break;
			
			case 162: this.Name = "Super Fang";
				this.Accuracy = 90;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Damage Equal To Half The Target's Current HP",100));
			break;
			
			case 163: this.Name = "Slash";
				this.Power = 70;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.CritChance = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
			break;
			
			case 164: this.Name = "Substitute";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 165: this.Name = "Struggle";
				this.Power = 50;
				this.Accuracy = 100;
				this.BaseMaxPP = 1;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = null;
				this.AddedEffects.add(new AddedEffect("Recoil Damage",25));
			break;
			
			case 166: this.Name = "Sketch";
				this.Accuracy = 100;
				this.BaseMaxPP = 1;
				this.cantMiss = true;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Permanently Learns The Last Move Used By Another Mon",100));
			break;
			
			case 167: this.Name = "Triple Kick";
				this.Power = 10;
				this.Accuracy = 90;
				this.BaseMaxPP = 10;
				this.MinHits = 1;
				this.MaxHits = 3;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("Increase Power Of Move After Each Hit",10));
				this.AddedEffects.add(new AddedEffect("Each Hit Has Individal Accuracy Of ",90));
			break;
			
			case 168: this.Name = "Thief";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 10;
				this.isPhysical = true;
				this.Type = Types.Dark;
				this.AddedEffects.add(new AddedEffect("Steals Target's Item If User Is Not Holding Item",100));
			break;
			
			case 169: this.Name = "Spider Web";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 170: this.Name = "Mind Reader";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 171: this.Name = "Nightmare";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 172: this.Name = "Flame Wheel";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.isPhysical = true;
				this.isContact = true;
				
			break;
			
			case 173: this.Name = "Snore";
			break;
			
			case 174: this.Name = "Curse";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 175: this.Name = "Flail";
			break;
			
			case 176: this.Name = "Conversion 2";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 177: this.Name = "Aeroblast";
			break;
			
			case 178: this.Name = "Cotton Spore";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 179: this.Name = "Reversal";
			break;
			
			case 180: this.Name = "Spite";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 181: this.Name = "Powder Snow";
			break;
			
			case 182: this.Name = "Protect";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 183: this.Name = "Mach Punch";
				this.Power  =  40;
				this.Accuracy  =  100;
				this.BaseMaxPP  =  30;
				this.Priority  =  1;
			break;
			
			case 184: this.Name = "Scary Face";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 185: this.Name = "Feint Attack";
			break;
			
			case 186: this.Name = "Sweet Kiss";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 187: this.Name = "Belly Drum";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 188: this.Name = "Sludge Bomb";
			break;
			
			case 189: this.Name = "Mud-Slap";
			break;
			
			case 190: this.Name = "Octazooka";
			break;
			
			case 191: this.Name = "Spikes";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 192: this.Name = "Zap Cannon";
			break;
			
			case 193: this.Name = "Foresight";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 194: this.Name = "Destiny Bond";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 195: this.Name = "Perish Song";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 196: this.Name = "Icy Wind";
			break;
			
			case 197: this.Name = "Detect";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 198: this.Name = "Bone Rush";
			break;
			
			case 199: this.Name = "Lock-On";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 200: this.Name = "Outrage";
			break;
			
			case 201: this.Name = "Sandstorm";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 202: this.Name = "Giga Drain";
			break;
			
			case 203: this.Name = "Endure";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 204: this.Name = "Charm";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 205: this.Name = "Rollout";
			break;
			
			case 206: this.Name = "False Swipe";
			break;
			
			case 207: this.Name = "Swagger";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 208: this.Name = "Milk Drink";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 209: this.Name = "Spark";
			break;
			
			case 210: this.Name = "Fury Cutter";
			break;
			
			case 211: this.Name = "Steel Wing";
			break;
			
			case 212: this.Name = "Mean Look";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 213: this.Name = "Attract";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 214: this.Name = "Sleep Talk";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 215: this.Name = "Heal Bell";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 216: this.Name = "Return";
			break;
			
			case 217: this.Name = "Present";
			break;
			
			case 218: this.Name = "Frustration";
			break;
			
			case 219: this.Name = "Safeguard";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 220: this.Name = "Pain Split";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 221: this.Name = "Sacred Fire";
			break;
			
			case 222: this.Name = "Magnitude";
			break;
			
			case 223: this.Name = "Dynamic Punch";
			break;
			
			case 224: this.Name = "Megahorn";
			break;
			
			case 225: this.Name = "Dragon Breath";
			break;
			
			case 226: this.Name = "Baton Pass";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 227: this.Name = "Encore";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 228: this.Name = "Pursuit";
			break;
			
			case 229: this.Name = "Rapid Spin";
			break;
			
			case 230: this.Name = "Sweet Scent";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 231: this.Name = "Iron Tail";
			break;
			
			case 232: this.Name = "Metal Claw";
			break;
			
			case 233: this.Name = "Vital Throw";
			break;
			
			case 234: this.Name = "Morning Sun";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 235: this.Name = "Synthesis";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 236: this.Name = "Moonlight";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 237: this.Name = "Hidden Power";
			break;
			
			case 238: this.Name = "Cross Chop";
			break;
			
			case 239: this.Name = "Twister";
			break;
			
			case 240: this.Name = "Rain Dance";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 241: this.Name = "Sunny Day";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 242: this.Name = "Crunch";
			break;
			
			case 243: this.Name = "Mirror Coat";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 244: this.Name = "Psych Up";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 245: this.Name = "Extreme Speed";
			break;
			
			case 246: this.Name = "Ancient Power";
			break;
			
			case 247: this.Name = "Shadow Ball";
			break;
			
			case 248: this.Name = "Future Sight";
			break;
			
			case 249: this.Name = "Rock Smash";
			break;
			
			case 250: this.Name = "Whirlpool";
			break;
			
			case 251: this.Name = "Beat Up";
			break;
			
			case 252: this.Name = "Fake Out";
			break;
			
			case 253: this.Name = "Uproar";
			break;
			
			case 254: this.Name = "Stockpile";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 255: this.Name = "Spit Up";
			break;
			
			case 256: this.Name = "Swallow";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 257: this.Name = "Heat Wave";
			break;
			
			case 258: this.Name = "Hail";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 259: this.Name = "Torment";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 260: this.Name = "Flatter";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 261: this.Name = "Will-O-Wisp";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 262: this.Name = "Memento";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 263: this.Name = "Facade";
			break;
			
			case 264: this.Name = "Focus Punch";
			break;
			
			case 265: this.Name = "Smelling Salts";
			break;
			
			case 266: this.Name = "Follow Me";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 267: this.Name = "Nature Power";
			break;
			
			case 268: this.Name = "Charge";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 269: this.Name = "Taunt";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 270: this.Name = "Helping Hand";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 271: this.Name = "Trick";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 272: this.Name = "Role Play";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 273: this.Name = "Wish";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 274: this.Name = "Assist";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 275: this.Name = "Ingrain";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 276: this.Name = "Superpower";
			break;
			
			case 277: this.Name = "Magic Coat";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 278: this.Name = "Recycle";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 279: this.Name = "Revenge";
			break;
			
			case 280: this.Name = "Brick Break";
			break;
			
			case 281: this.Name = "Yawn";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 282: this.Name = "Knock Off";
			break;
			
			case 283: this.Name = "Endeavor";
			break;
			
			case 284: this.Name = "Eruption";
			break;
			
			case 285: this.Name = "Skill Swap";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 286: this.Name = "Imprison";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 287: this.Name = "Refresh";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 288: this.Name = "Grudge";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 289: this.Name = "Snatch";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 290: this.Name = "Secret Power";
			break;
			
			case 291: this.Name = "Dive";
			break;
			
			case 292: this.Name = "Arm Thrust";
			break;
			
			case 293: this.Name = "Camouflage";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 294: this.Name = "Tail Glow";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 295: this.Name = "Luster Purge";
			break;
			
			case 296: this.Name = "Mist Ball";
			break;
			
			case 297: this.Name = "Feather Dance";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 298: this.Name = "Teeter Dance";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 299: this.Name = "Blaze Kick";
			break;
			
			case 300: this.Name = "Mud Sport";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 301: this.Name = "Ice Ball";
			break;
			
			case 302: this.Name = "Needle Arm";
			break;
			
			case 303: this.Name = "Slack Off";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 304: this.Name = "Hyper Voice";
			break;
			
			case 305: this.Name = "Poison Fang";
			break;
			
			case 306: this.Name = "Crush Claw";
			break;
			
			case 307: this.Name = "Blast Burn";
			break;
			
			case 308: this.Name = "Hydro Cannon";
			break;
			
			case 309: this.Name = "Meteor Mash";
			break;
			
			case 310: this.Name = "Astonish";
			break;
			
			case 311: this.Name = "Weather Ball";
			break;
			
			case 312: this.Name = "Aromatherapy";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 313: this.Name = "Fake Tears";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 314: this.Name = "Air Cutter";
			break;
			
			case 315: this.Name = "Overheat";
				this.Power = 140;
				this.Accuracy = 90;
				this.BaseMaxPP = 5;
				this.isSpecial = true;
				this.Type = Types.Fire;
				this.AddedEffects.add(new AddedEffect("User Special Attack Drop 2 Stages",100));
			break;
			
			case 316: this.Name = "Odor Sleuth";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 317: this.Name = "Rock Tomb";
			break;
			
			case 318: this.Name = "Silver Wind";
			break;
			
			case 319: this.Name = "Metal Sound";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 320: this.Name = "Grass Whistle";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 321: this.Name = "Tickle";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 322: this.Name = "Cosmic Power";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 323: this.Name = "Water Spout";
			break;
			
			case 324: this.Name = "Signal Beam";
			break;
			
			case 325: this.Name = "Shadow Punch";
			break;
			
			case 326: this.Name = "Extrasensory";
			break;
			
			case 327: this.Name = "Sky Uppercut";
			break;
			
			case 328: this.Name = "Sand Tomb";
			break;
			
			case 329: this.Name = "Sheer Cold";
			break;
			
			case 330: this.Name = "Muddy Water";
			break;
			
			case 331: this.Name = "Bullet Seed";
			break;
			
			case 332: this.Name = "Aerial Ace";
			break;
			
			case 333: this.Name = "Icicle Spear";
			break;
			
			case 334: this.Name = "Iron Defense";
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Steel;
				this.AddedEffects.add(new AddedEffect("User Defense Boost 2 Stages",100));
			break;
			
			case 335: this.Name = "Block";
				this.Accuracy = 100;
				this.BaseMaxPP = 5;
				this.isStatus = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Target Can't Switch Conventionally",100));
			break;
			
			case 336: this.Name = "Howl";
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
			break;
			
			case 337: this.Name = "Dragon Claw";
				this.Power = 80;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Dragon;
			break;
			
			case 338: this.Name = "Frenzy Plant";
				this.Power = 150;
				this.Accuracy = 90;
				this.BaseMaxPP = 5;
				this.isSpecial = true;
				this.mustRecharge = true;
				this.Type = Types.Grass;
			break;
			
			case 339: this.Name = "Bulk Up";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Fighting;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("User Defense Boost 1 Stage",100));
			break;
			
			case 340: this.Name = "Bounce";
				this.Power = 85;
				this.Accuracy = 85;
				this.BaseMaxPP = 5;
				this.isPhysical = true;
				this.isContact = true;
				this.twoTurns = true;
				this.Type = Types.Flying;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",30));
				this.AddedEffects.add(new AddedEffect("Damage Boost Against Airborne Target",2));
			break;
			
			case 341: this.Name = "Mud Shot";
				this.Power = 55;
				this.Accuracy = 95;
				this.BaseMaxPP = 15;
				this.isSpecial = true;
				this.Type = Types.Ground;
				this.AddedEffects.add(new AddedEffect("Target Speed Drop 1 Stage",100));
			break;
			
			case 342: this.Name = "Poison Tail";
				this.Power = 50;
				this.Accuracy = 100;
				this.BaseMaxPP = 25;
				this.CritChance = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Poison;
				this.AddedEffects.add(new AddedEffect("Poison Chance",10));
			break;
			
			case 343: this.Name = "Covet";
				this.Power = 40;
				this.Accuracy = 100;
				this.BaseMaxPP = 40;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Normal;
				this.AddedEffects.add(new AddedEffect("Steals Target's Item If User Has No Item",100));
			break;
			
			case 344: this.Name = "Volt Tackle";
				this.Power = 120;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Electric;
				this.AddedEffects.add(new AddedEffect("Paralyze Chance",10));
				this.AddedEffects.add(new AddedEffect("Recoil Damage",(1.0/3.0)));
			break;
			
			case 345: this.Name = "Magical Leaf";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.cantMiss = true;
				this.isSpecial = true;
				this.Type = Types.Grass;
			break;
			
			case 346: this.Name = "Water Sport";
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Water;
				this.AddedEffects.add(new AddedEffect("Fire Damage Reduced By X% While User Is In Battle",100));
			break;
			
			case 347: this.Name = "Calm Mind";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Special Attack Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("User Special Defense Boost 1 Stage",100));
			break;
			
			case 348: this.Name = "Leaf Blade";
				this.Power = 70;
				this.Accuracy = 100;
				this.BaseMaxPP = 15;
				this.CritChance = 25;
				this.isPhysical = true;
				this.isContact = true;
				this.Type = Types.Grass;
			break;
			
			case 349: this.Name = "Dragon Dance";
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isStatus = true;
				this.cantMiss = true;
				this.Type = Types.Dragon;
				this.AddedEffects.add(new AddedEffect("User Attack Boost 1 Stage",100));
				this.AddedEffects.add(new AddedEffect("User Speed Boost 1 Stage",100));
			break;
			
			case 350: this.Name = "Rock Blast";
			break;
			
			case 351: this.Name = "Shock Wave";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.cantMiss = true;
				this.Type = Types.Electric;
			break;
			
			case 352: this.Name = "Water Pulse";
				this.Power = 60;
				this.Accuracy = 100;
				this.BaseMaxPP = 20;
				this.isSpecial = true;
				this.Type = Types.Water;
				this.AddedEffects.add(new AddedEffect("Confusion Chance",20));
			break;
			
				case 353: this.Name = "Doom Desire";
			break;
			
			case 354: this.Name = "Psycho Boost";
				this.Power = 140;
				this.Accuracy = 90;
				this.BaseMaxPP = 5;
				this.isSpecial = true;
				this.Type = Types.Psychic;
				this.AddedEffects.add(new AddedEffect("User Special Attack Drop 2 Stages",100));
			break;
		}
	}
	
	public static void main(String[] Mudkipz)
	{
		int i = 1;
		while(i<355)
		{
			System.out.println(new Move(i).Name + " "+ i);
			i++;
		}
	}
}
