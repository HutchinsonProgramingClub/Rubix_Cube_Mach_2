//import lejos.remote.ev3.RMIRegulatedMotor;
//import lejos.remote.ev3.RMISampleProvider;
//import lejos.remote.ev3.RemoteEV3;
//
//public class ColorSensorCal {
//
//	public static void main(String[] args) {
//	RMISampleProvider sampleProvider=null;
//	RemoteEV3 ev3=null;
//	RMIRegulatedMotor MotorA=null;
//	try {
//		ev3=new RemoteEV3("10.0.1.1");
//		sampleProvider=ev3.createSampleProvider("S1", "lejos.hardware.sensor.EV3ColorSnsor", "RGB");
//		MotorA=ev3.createRegulatedMotor("A",'L');
//		
//		float[] samples=new float[3];
//		
//		MotorA.setSpeed(150);
//		String motorMode="";
//		
//		while(System.in.available()==0) {
//		
//			samples=sampleProvider.fetchSample();
//			
//			System.out.println("RGB="+samples[0]+" / "+samples[1]+" / "+samples[2]);
//			//prints out what the color sensor is seeing
//			if (  (samples[0]>0.139f) && (samples[0]<0.139f) //Red Value
//			&& (samples[1]>0.0) && (samples[1]<0.041f) //Green Value
//			&& (samples[2]>0.023f) && (samples[2]<0.033f) //Blue Value
//			) {
//			System.out.println("Red");
//			}
//			if (  (samples[0]>0.139f) && (samples[0]<0.139f) //Red Value
//				&& (samples[1]>0.0) && (samples[1]<0.041f)
//				&& (samples[2]>0.023f) && (samples[2]<0.033f)
//				) {
//				System.out.println("Blue");
//			if (  (samples[0]>0.139f) && (samples[0]<0.139f) //Red Value
//				&& (samples[1]>0.0) && (samples[1]<0.041f)
//				&& (samples[2]>0.023f) && (samples[2]<0.033f)
//				) {
//				System.out.println("Green");
////FIGURE OUT the Blue and Green values
//			} catch (Exception e) {
//		e.printStackTrace();
//	} finally {
//		try {
//			sampleProvider.close();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	}
//
//}
