package LAB_2;

public class air implements vehicle{
	
	int IntSpeed;
	boolean state;
	
	public int speed()
	{
		return IntSpeed;
	}
	
	public boolean isRunning()
	{
		return state;
	}
	
	public void setspeed(int spd)
	{
		IntSpeed=spd;
	}
	
	public void setState(boolean st)
	{
		state=st;
	}
}
