package LAB_2;

public class car extends land {
	public int IncreaseSpeedNew(int st)
	{
		IntSpeed=IntSpeed+st*5;
		
		return IntSpeed;
	}
	
	public void afunc(String carName)
	{
		System.out.println(carName);
	}
	
}
