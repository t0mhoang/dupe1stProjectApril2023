package inheritancePackage;

public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 0;
		
		cars c1 = new cars(speed);//parent class
		c1.increaseSpeed();
		
		BMW bmw1 = new BMW(speed);//subclass. subclass can call any method from their parant class by using "extend"
		bmw1.increaseSpeed();
		bmw1.headsupDisplayNavigation();
	}

}
