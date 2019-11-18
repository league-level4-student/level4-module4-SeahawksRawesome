package _04_hospital;

public class GeneralPractitioner extends Doctor {

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	public void doMedicine() {
		Patient patient = new Patient();
		patient.checkPulse();
	}
}
