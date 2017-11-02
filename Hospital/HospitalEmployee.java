public class HospitalEmployee {
	protected String employeeName;
	protected String hospitalName;

	public HospitalEmployee(String name, String hospital){
		employeeName = name;
		hospitalName = hospital;
	}

	public String toString(){
		String result = "";

		result+=employeeName + "\n";
		result+=hospitalName;

		return result;
	}
}