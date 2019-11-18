package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void addDoctor(Doctor doctor) {
		doctor = new Doctor();
		doctors.add(doctor);
	}

	public ArrayList<Doctor> getDoctors() {
		
		return doctors;
	}
	
	
	public void addPatient(Patient patient) {
		patient = new Patient();
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		
		return patients;
	}
	
	
}
