package R;
import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.remote.ev3.RemoteEV3;
import lejos.utility.Delay;

public class Robot {
	RemoteEV3 ev3;
	public static RMIRegulatedMotor MotorA;
	public static RMIRegulatedMotor MotorB;
	public static RMIRegulatedMotor MotorC;
	public static RMIRegulatedMotor MotorD;
	static Brick brick = BrickFinder.getDefault();
	Port s3 = brick.getPort("S3");
	Port s4 = brick.getPort("S4");
	EV3TouchSensor TouchSensorN = new EV3TouchSensor(s3);
	EV3TouchSensor TouchSensorP = new EV3TouchSensor(s4);
	EV3ColorSensor ColorSensor1 = new EV3ColorSensor(s2);
	//MotorA is turns the cube
	//MotorB flips the cube
	//MotorD is the light sensor
	
	public static void Right() {
		Delay.msDelay(250);
	}
	
	public static void RightPrime() {
		Delay.msDelay(250);
	}
	
	public static void Left() {
		Delay.msDelay(250);
	}
	
	public static void LeftPrime() {
		Delay.msDelay(250);
	}
	
	public static void Front() {
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(100);
		Motor.A.rotate(-10);
		Motor.B.rotate(-40);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
	}
	
	public static void FrontPrime() {
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(-100);
		Motor.A.rotate(10);
		Motor.B.rotate(-40);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
	}
	
	public static void Back() {
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(-100);
		Motor.A.rotate(10);
		Motor.B.rotate(-40);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
	}
	
	public static void BackPrime() {
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(100);
		Motor.A.rotate(-10);
		Motor.B.rotate(-40);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
	}
	public static void Up() {
		Motor.B.rotate(170);
		Delay.msDelay(250);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
		Motor.B.rotate(170);
		Delay.msDelay(250);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
		Motor.B.rotate(170);
		Delay.msDelay(250);
		Motor.B.rotate(-170);
		Delay.msDelay(250);
		Motor.B.rotate(170);
		Delay.msDelay(250);
		Motor.B.rotate(-130);
		Motor.A.rotate(100);
		Motor.A.rotate(-10);
		Motor.B.rotate(-40);
		Delay.msDelay(250);
	}
	
	public static void UpPrime() {
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(-100);
		Motor.A.rotate(10);
		Motor.B.rotate(-40);
		Delay.msDelay(250);
	}
	
	public static void Down() {
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(-100);
		Motor.A.rotate(10);
		Motor.B.rotate(-40);
		Delay.msDelay(250);
	}
	public static void DownPrime() {
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-170);
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(100);
		Motor.A.rotate(-10);
		Motor.B.rotate(-40);
		Delay.msDelay(250);
	}
}
