package inheritancePackage;

public class BMW extends cars {
	public BMW(int startSpeed) {
		super(startSpeed);
	}

	public void increaseSpeed() {//this method overrides original increase speed from cars class
		System.out.println("increasing speed of BMW");
	}
	
	public void headsupDisplayNavigation() {
		System.out.println("BMW specific functionality");
	}
	
}
