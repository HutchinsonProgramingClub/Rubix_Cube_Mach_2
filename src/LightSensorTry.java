import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class LightSensorTry {
	
	EV3ColorSensor colorsensor;
	SampleProvider colorprovider;
	float[] colorsample;
	
	public static void main(String[] args) {
	new LightSensorTry();
	}
	public LightSensorTry() {
		Port s3 = LocalEV3.get().getPort("S3");
		colorsensor = new EV3ColorSensor(s3);
		colorprovider = colorsensor.getRedMode();
		colorsample = new float[colorprovider.sampleSize()];
		colorprovider.fetchSample(colorsample, 0);
		while(Button.ESCAPE.isUp()) {
			System.out.println("R" + colorsample[0]);
			System.out.println("G" + colorsample[1]);
			System.out.println("B" + colorsample[2]);
			Delay.msDelay(250);
		}
		if(colorsample[1] < 0.5) {
		Motor.A.rotate(500);
		}
		colorsensor.close();
	}

}
