import java.util.ArrayList;

import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;

public class LightSensorTry {
	
	EV3ColorSensor colorSensor;
	public static void main(String[] args) {
	new LightSensorTry();
	}
	
	public LightSensorTry() {
		/* Steps to initialize a sensor */
	    Brick brick = BrickFinder.getDefault();
	    Port s4 = brick.getPort("S4");
	    EV3ColorSensor sensor = new EV3ColorSensor(s4);

	    /* The sensor support various modes, display these modes */
	    System.out.println("Supported modes");
	    ArrayList<String> allModes = sensor.getAvailableModes();
	    for (String mode : allModes) {
	    System.out.println(mode);
	    Delay.msDelay(5000);
	    System.out.println(sensor.getColorID());
	    
	    Delay.msDelay(10000);
	    
	    int SampleProvider = sensor.getColorID();
	    //Next thing is probably not needed
	    int ColorIDMode = sensor.getCurrentMode();
	    if(SampleProvider == 6) {
	    	Robot.Right();
	    }
	    else {
	    }
	    
//	    int sampleSize = reflectedLight.sampleSize();
//	    float[] sample = new float[sampleSize];
//	    reflectedLight.fetchSample(sample, 0);
	    }}
}



//import lejos.hardware.Button;
//import lejos.hardware.ev3.LocalEV3;
//import lejos.hardware.port.Port;
//import lejos.hardware.sensor.EV3ColorSensor;
//import lejos.robotics.Color;
//import lejos.robotics.SampleProvider;
//import lejos.utility.Delay;
//
//public class LightSensorTry {
//	
//	EV3ColorSensor colorSensor;
//	SampleProvider colorProvider;
//	float[] colorSample;
//	
//	public static void main(String[] args) {
//	new LightSensorTry();
//	}
//	
//	public LightSensorTry() {
//		Port s3 = LocalEV3.get().getPort("S3");
//		colorSensor = new EV3ColorSensor(s3);
//		colorSample = new float[colorProvider.sampleSize()];
//		
//		while(Button.ESCAPE.isUp()) {
//			int currentDetectedColor = colorSensor.getColorID();
//			switch (currentDetectedColor)	{
//			case Color.RED:
//				colorSensor.setFloodlight(Color.RED);
//				break;
//			case Color.BLUE:
//				colorSensor.setFloodlight(Color.BLUE);
//				break;
//			}
//			Delay.msDelay(250);
//		}
//		colorSensor.close();
//	}
//}