package _04_hospital;

import java.util.ArrayList;

public class Doctor{
	ArrayList<Patient> patients = new ArrayList<Patient>();
		public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if(patients.size() >= 3) {
			throw new DoctorFullException();
		}
		else {
			patients.add(patient);
		}
		
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
	patients.get(0).checkPulse();
	patients.get(1).checkPulse();
	}


}
