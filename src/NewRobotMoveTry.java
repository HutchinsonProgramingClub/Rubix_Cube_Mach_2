import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class NewRobotMoveTry {
	public static void main(String[] args) {
		Motor.A.rotate(180);
		Motor.B.rotate(180);
		Delay.msDelay(5000);
		Motor.A.rotate(60);
		Motor.B.rotate(60);
		//Gliderman Ep4
		//http://www.lejos.org/ev3/docs/
		
		//pilot.setTravelSpeed(3.0);
	}
}
