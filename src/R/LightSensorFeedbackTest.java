package R;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class LightSensorFeedbackTest {
	EV3ColorSensor colorsensor;
	SampleProvider colorProvider;
	float[] colorsample;
	
	public static void main(String[] args) {
		new LightSensorFeedbackTest();
	}
	public LightSensorFeedbackTest(){
		Port s1 = LocalEV3.get().getPort("S1");
		colorsensor = new EV3ColorSensor(s1);
		colorsensor.getColorIDMode();
		colorsample = new float[colorProvider.sampleSize()];
	}
	int CurrectColor = colorsensor.getColorID();

}
