package New_Robot;

import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.remote.ev3.RemoteEV3;
import lejos.robotics.RegulatedMotor;

public class RobotMap {
	RemoteEV3 ev3;
	public static RMIRegulatedMotor MotorA;//Spins Cube
	public static RMIRegulatedMotor MotorB;//Moves flipper
	public static RMIRegulatedMotor MotorC;//Moves Color Sensor
	public static RMIRegulatedMotor MotorD;
	public static EV3TouchSensor TouchSensorBack;
	public static EV3TouchSensor TouchSensorFront;
	public static EV3ColorSensor ColorSensor;
	static Brick brick = BrickFinder.getDefault();
	
	static Port s1 = brick.getPort("S1");
	static Port s2 = brick.getPort("S2");
	static Port s3 = brick.getPort("S3");
	static Port s4 = brick.getPort("S4");
	
	EV3TouchSensor TouchSensorN = new EV3TouchSensor(s3);
	EV3TouchSensor TouchSensorP = new EV3TouchSensor(s4);
	EV3ColorSensor ColorSensor1 = new EV3ColorSensor(s2);
	/**
	 * Called when the code is first deployed to the robot. This tells the robot
	 * where it should send power when it wants to run code
	 */
	public static void init() {
		EV3TouchSensor TouchSensorN = new EV3TouchSensor(s3);
		EV3TouchSensor TouchSensorP = new EV3TouchSensor(s4);
		EV3ColorSensor ColorSensor1 = new EV3ColorSensor(s2);
		
		RegulatedMotor MotorA = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor MotorB = new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor MotorC = new EV3LargeRegulatedMotor(MotorPort.C);
		RegulatedMotor MotorD = new EV3LargeRegulatedMotor(MotorPort.D);
	}
}
