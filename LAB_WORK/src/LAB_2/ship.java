package LAB_2;

public class ship extends water {
	public void changestate()
	{
		if(state==true)
			state=false;
		
		else
			state=true;
	}
	
	public void afunk(String ShipName)
	{
		
		System.out.println(ShipName);
		
	}
}
