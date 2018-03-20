import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class NewRobotMoveTry {
	public static void main(String[] args) {
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(5000);
		Motor.A.stop();
		Motor.B.stop();
		Delay.msDelay(5000);
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(10000);
		Motor.A.stop();
		Motor.B.stop();
		//Gliderman Ep4
		//http://www.lejos.org/ev3/docs/
	}
}
