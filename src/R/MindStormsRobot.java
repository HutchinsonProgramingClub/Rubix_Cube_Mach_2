package R;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;
import lejos.hardware.Sound;
import lejos.remote.ev3.RMIRegulatedMotor;
import lejos.remote.ev3.RemoteEV3;

public class MindStormsRobot {
	RemoteEV3 ev3;
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		RemoteEV3 ev3 = new RemoteEV3("10.0.1.1");
		ev3.isLocal();
		RMIRegulatedMotor MotorA = null;
		RMIRegulatedMotor MotorB = null;
		RMIRegulatedMotor MotorC = null;
		RMIRegulatedMotor MotorD = null;
		
		ev3.getPort("A");
		ev3.getPort("B");
		ev3.getPort("C");
		ev3.getPort("D");
		//creates motors-->
		if(MotorA==null) {ev3.createRegulatedMotor("A", 'L');}
		if(MotorB==null) {ev3.createRegulatedMotor("B", 'L');}
		if(MotorC==null) {ev3.createRegulatedMotor("C", 'L');}
		if(MotorD==null) {ev3.createRegulatedMotor("D", 'L');}
	
		MotorB.forward();
		MotorC.forward();
		try {
			Thread.sleep(5000);
		}
		catch(InternalException e){
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MotorB.stop(true);
		MotorC.stop(true);
		Sound.twoBeeps();
		MotorA.close();
		MotorB.close();
		MotorC.close();
		MotorD.close();
	}

}
