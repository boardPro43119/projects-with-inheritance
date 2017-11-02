import java.util.ArrayList;

public class Doctor extends HospitalEmployee {
	private ArrayList<String> scheduledAppointments = new ArrayList<String>();
	private ArrayList<String> patientPrescriptionsDue = new ArrayList<String>();

	public Doctor(String name, String hospital){
		super(name, hospital);
	}

	public String name(){
		return employeeName;
	}

	public void scheduleAppointment(String patient, String details){
		scheduledAppointments.add(patient + ": " + details);
	}

	public void completeAppointment(String patient, String details){
		scheduledAppointments.remove(patient + ": " + details);
	}

	public void schedulePrescription(String patient, String details){
		patientPrescriptionsDue.add(patient + ": " + details);
	}

	public void removePrescription(String patient, String details){
		patientPrescriptionsDue.remove(patient + ": " + details);
	}

	public String showAppointments(){
		String result = "Appointments:\n";
		for(String appointment : scheduledAppointments){
			result+=appointment + "\n";
		}

		return result;
	}

	public String showPrescriptions(){
		String result = "Prescriptions:\n";
		for(String prescription : patientPrescriptionsDue){
			result+=prescription + "\n";
		}

		return result;
	}

	public String toString(){
		String result = "";

		result+=employeeName + "\n";
		result+="Doctor at " + hospitalName + "\n\n";
		result+=showAppointments();
		result+=showPrescriptions();

		return result;

	}

}