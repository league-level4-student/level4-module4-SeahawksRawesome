package _04_hospital;

public class GeneralPractitioner extends Doctor {

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

	public void doMedicine() {
		patients.get(0).checkPulse();
		patients.get(1).checkPulse();
		System.out.println(patients.get(0).feelsCaredFor);
		System.out.println(patients.get(1).feelsCaredFor);
	}
}
