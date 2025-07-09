package com.example.demo;
import jakarta.persistence.*;

@Entity
public class Patient 
{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "patient_id")  
	 private Integer patientId;

	    private String patient_name;
	    private String patient_email;
	    private String patient_password;
	    private int patient_age;
	    private String patient_bloodgroup;
	    private String patient_gender;
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(Integer patientId) {
			this.patientId = patientId;
		}
		public String getPatient_name() {
			return patient_name;
		}
		public void setPatient_name(String patient_name) {
			this.patient_name = patient_name;
		}
		public String getPatient_email() {
			return patient_email;
		}
		public void setPatient_email(String patient_email) {
			this.patient_email = patient_email;
		}
		public String getPatient_password() {
			return patient_password;
		}
		public void setPatient_password(String patient_password) {
			this.patient_password = patient_password;
		}
		public int getPatient_age() {
			return patient_age;
		}
		public void setPatient_age(int patient_age) {
			this.patient_age = patient_age;
		}
		public String getPatient_bloodgroup() {
			return patient_bloodgroup;
		}
		public void setPatient_bloodgroup(String patient_bloodgroup) {
			this.patient_bloodgroup = patient_bloodgroup;
		}
		public String getPatient_gender() {
			return patient_gender;
		}
		public void setPatient_gender(String patient_gender) {
			this.patient_gender = patient_gender;
		}
		public Patient() {
		    // Default constructor required by JPA
		}
		public Patient(Integer patientId, String patient_name, String patient_email, String patient_password,
				int patient_age, String patient_bloodgroup, String patient_gender) {
			super();
			this.patientId = patientId;
			this.patient_name = patient_name;
			this.patient_email = patient_email;
			this.patient_password = patient_password;
			this.patient_age = patient_age;
			this.patient_bloodgroup = patient_bloodgroup;
			this.patient_gender = patient_gender;
		}
		@Override
		public String toString() {
			return "patient [patientId=" + patientId + ", patient_name=" + patient_name + ", patient_email="
					+ patient_email + ", patient_password=" + patient_password + ", patient_age=" + patient_age
					+ ", patient_bloodgroup=" + patient_bloodgroup + ", patient_gender=" + patient_gender + "]";
		}
	    
	    
}
