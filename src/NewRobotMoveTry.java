import lejos.hardware.Button;
import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.utility.Delay;

public class NewRobotMoveTry {
	
	public static Robot robot;
	
	public static RMIRegulatedMotor A = Robot.MotorA;
	public static RMIRegulatedMotor B = Robot.MotorB;
	public static RMIRegulatedMotor C = Robot.MotorC;
	public static RMIRegulatedMotor D = Robot.MotorD;
	
	public static void main(String[] args) {

		while(Button.ESCAPE.isUp()) {
		Robot.Right();
		Delay.msDelay(20000);
		}
		
		
		
		//Gliderman Ep4
		//http://www.lejos.org/ev3/docs/
		
	}
}