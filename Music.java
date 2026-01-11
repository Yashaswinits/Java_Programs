class Car{
	private int music;
	private int speed;
	
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		if(music<=50)
		{
			this.music = music;
		}
		else {
			System.out.println("assign the lesser value of music volume");
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<=50) {
			this.speed = speed;
		}
		else {
			System.out.println("assign the lesser value of speed");
		}
	}	
}

public class Music {

	public static void main(String[] args) {
	 Car c= new Car();
	 c.setMusic(60);
	 c.setSpeed(80);
	 System.out.println("Music is "+c.getMusic());
	 System.out.println("Speed is "+c.getSpeed());	 
	}
}
