import java.util.ArrayList;

public class Surgeon extends HospitalEmployee {
	private ArrayList<String> scheduledOperations = new ArrayList<String>();

	public Surgeon(String name, String hospital){
		super(name, hospital);
	}

	public String name(){
		return employeeName;
	}

	public void scheduleOperation(String patient, String details){
		scheduledOperations.add(patient + ": " + details);
	}

	public void completeOperation(String patient, String details){
		scheduledOperations.remove(patient + ": " + details);
	}

	public String showOperations(){
		String result = "Operations:\n";
		for(String operation : scheduledOperations){
			result+=operation + "\n";
		}

		return result;
	}


	public String toString(){
		String result = "";

		result+=employeeName + "\n";
		result+="Surgeon at " + hospitalName + "\n\n";
		result+=showOperations();

		return result;

	}

}