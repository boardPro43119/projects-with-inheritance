import java.util.ArrayList;

public class Patient {
	private String patientName;
	private String hospitalName;
	private ArrayList appointmentsDue = new ArrayList();
	private ArrayList prescriptionsDue = new ArrayList();
	private ArrayList operationsDue = new ArrayList();

	public Patient(String name, String hospital){
		patientName = name;
		hospitalName = hospital;
	}

	public void scheduleAppointment(String doctor, String details){
		appointmentsDue.add(doctor + ": " + details);
	}

	public void completeAppointment(String doctor, String details){
		appointmentsDue.remove(doctor + ": " + details);
	}

	public void schedulePrescription(String doctor, String details){
		prescriptionsDue.add(doctor + ": " + details);
	}

	public void removePrescription(String doctor, String details){
		prescriptionsDue.remove(doctor + ": " + details);
	}

	public void scheduleOperation(String surgeon, String details){
		operationsDue.add(surgeon + ": " + details);
	}

	public void completeOperation(String surgeon, String details){
		operationsDue.remove(surgeon + ": " + details);
	}

	public String showAppointments(){
		String result = "Appointments:\n";
		for(String appointment : appointmentsDue){
			result+=appointment + "\n";
		}

		return result;
	}

	public String showPrescriptions(){
		String result = "Prescriptions:\n";
		String result = "";
		for(String prescription : prescriptionsDue){
			result+=prescription + "\n";
		}

		return result;
	}

	public String showOperations(){
		String result = "Operations:\n";
		String result = "";
		for(String operations : operationsDue){
			result+=operations + "\n";
		}

		return result;
	}

	public String toString(){
		String result = "";

		result+=patientName + "\n";
		result+=hospitalName + "\n\n";
		result+=showAppointments();
		result+=showPrescriptions();
		result+=showOperations();

		return result;

	}
}