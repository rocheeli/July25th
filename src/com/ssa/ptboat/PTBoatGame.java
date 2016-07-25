package com.ssa.ptboat;

public class PTBoatGame 
{
	private PTBoat[] boats = new PTBoat[6];
	private int numberOfBoats = 0;
	
	public void addBoat(int location)
	{
		boats[numberOfBoats] = new PTBoat(location);
		numberOfBoats ++;
	}

public boolean guess(int location)
{
	for(int i =0; i < boats.length; i ++)
	{
		if(boats[i].location == location)
		{
			return true;
		}
	}
			return false;
}
	
public static void main(String[] args)
{
	PTBoatGame game1 = new PTBoatGame();
	game1.addBoat(4);
	game1.addBoat(5);
	game1.addBoat(6);
	game1.addBoat(1);
	game1.addBoat(2);
	game1.addBoat(3);
	
	if(game1.guess(2))
	{
		System.out.println("Hit");
	}
	else
	{
		System.out.println("Miss");
	}
		
	}
}

    


