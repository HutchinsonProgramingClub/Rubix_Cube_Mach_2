import lejos.hardware.motor.Motor;
import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.remote.ev3.RemoteEV3;
import lejos.utility.Delay;

public class Robot {
	RemoteEV3 ev3;
	public static RMIRegulatedMotor MotorA;
	public static RMIRegulatedMotor MotorB;
	public static RMIRegulatedMotor MotorC;
	public static RMIRegulatedMotor MotorD;
	
	//MotorA is turns the cube
	//MotorB flips the cube
	//MotorD is the light sensor
	
	public static void Right(){
		Motor.B.rotate(170);
		Motor.A.rotate(100);
		Motor.B.rotate(-170);
		Delay.msDelay(500);
		Motor.B.rotate(170);
		Motor.B.rotate(-130);
		Motor.A.rotate(100);
		Motor.A.rotate(-10);
		Motor.B.rotate(130);
		Motor.A.rotate(180);
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
		Delay.msDelay(250);
	}
	
	public static void FrontPrime() {
		Delay.msDelay(250);
	}
	
	public static void Back() {
		Delay.msDelay(250);
	}
	
	public static void BackPrime() {
		Delay.msDelay(250);
	}
	public static void Up() {
		Delay.msDelay(250);
	}
	
	public static void UpPrime() {
		Delay.msDelay(250);
	}
	
	public static void Down() {
		Delay.msDelay(250);
	}
	public static void DownPrime() {
		Delay.msDelay(250);
	}
}
