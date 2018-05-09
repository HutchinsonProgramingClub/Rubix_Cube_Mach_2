package R;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.robotics.SampleProvider;

public class NewRobotMoveTry {
	
	public static Robot robot;
	public static RMIRegulatedMotor A = Robot.MotorA;
	public static RMIRegulatedMotor B = Robot.MotorB;
	public static RMIRegulatedMotor C = Robot.MotorC;
	public static RMIRegulatedMotor D = Robot.MotorD;
	Brick brick = BrickFinder.getDefault();
	Port s3 = brick.getPort("S3");
	Port s1 = brick.getPort("S1");
	EV3TouchSensor TouchSensorN = new EV3TouchSensor(s3);
	
	// get a port instance
	Port port = LocalEV3.get().getPort("S2");

	// Get an instance of the Ultrasonic EV3 sensor
	SensorModes sensor = new EV3UltrasonicSensor(port);

	// get an instance of this sensor in measurement mode
	SampleProvider distance= sensor.getMode("Distance");
//		Touch = new TouchSensor(TouchSensorN);
//		while(Button.ENTER.isDown()) {
//		if(Touch.pressed()) {
//			Robot.Right();
//		} else {
//			Delay.msDelay(5000);
//		}
//	    }
}
		//Gliderman Ep4
		//http://www.lejos.org/ev3/docs/