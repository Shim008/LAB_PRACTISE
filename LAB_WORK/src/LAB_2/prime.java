package LAB_2;

public class prime {
		public static void main(String[] args)
		{
			car latestCar= new car();
			latestCar.setSpeed(1324);
			latestCar.setState(false);
			System.out.println("The speed of latest car is: " + latestCar.speed());
				
			doSomething(latestCar);
			System.out.println("The increased speed of latest car is: " + latestCar.IncreaseSpeedNew(5));
			
			aeroplane aero=new aeroplane();
			aero.setspeed(23234);
			
			System.out.println("The speed of latest car is: " + aero.speed());
			
			doSomething(aero);
			System.out.println("The increased speed of latest car is: " + aero.increaseSpeed());
			
		
		}
		
		private static void doSomething(vehicle... V)
		{
			for(vehicle v : V) {
				if(v instanceof car) {
					car c= (car) v;
					
					c.afunc("TATA");
				}
				
				else if(v instanceof ship)
				{
					ship s= (ship) v;
					
					s.afunk("MERINO");
				}
				
				else if(v instanceof aeroplane)
				{
					aeroplane a= (aeroplane) v;
					
					a.afunkk("FLY EMIRATES");
				}
			}
			
			
		}
}
