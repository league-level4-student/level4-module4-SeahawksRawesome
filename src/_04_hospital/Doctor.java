package _04_hospital;

import java.util.ArrayList;

public class Doctor{
	ArrayList<Patient> patients = new ArrayList<Patient>();
		public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
		Patient patient = new Patient();
		patient.checkPulse();
	}


}
