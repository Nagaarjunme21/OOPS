package Inheritance;

public class Digital extends Analog {

	public void setAlarm(String watchType) {
		System.out.println(watchType + " 11am");
	}
	
	public void setTimer(String watchType) {
		System.out.println(watchType + " 02/11/2022");
	}
	
	public void light(String watchType) {
		System.out.println(watchType + " On");
	}

}
