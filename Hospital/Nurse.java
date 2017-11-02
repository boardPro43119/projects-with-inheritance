import java.util.ArrayList;

public class Nurse extends HospitalEmployee {

	private ArrayList<String> scheduledAppointments = new ArrayList<String>();

	public Nurse(String name, String hospital){
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


	public String showAppointments(){
		String result = "Appointments:\n";
		for(String appointment : scheduledAppointments){
			result+=appointment + "\n";
		}

		return result;
	}

	public String toString(){
		String result = "";

		result+=employeeName + "\n";
		result+="Nurse at " + hospitalName + "\n\n";
		result+=showAppointments();

		return result;

	}

}