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

	public void assignPatientsToDoctors() {
//		int patience = 3;
//		System.out.println(patients.size());
//		for(int i = 0; i < doctors.size(); i++) {
//			
//			for(int j = 0; j < patients.size()-5; j++) {
//				if(patience == 0) {
//					
//				}
//				if(doctors.get(i).getPatients().size() < 3) {
//					try {
//						doctors.get(i).assignPatient(patients.get(j));
//						patience -= 1;
//					} catch (DoctorFullException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(doctors.get(i).getPatients().size());
//				}
//				else {
//					break;
//				}
//			}
//			
//		}
		int patience = patients.size() ;
		for(int i = 0; i < doctors.size(); i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println(patients.size());
				if(patience == 0) {
					break;
				}
				try {
					doctors.get(i).assignPatient(patients.get(j));
					patience -=1;
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	
}
