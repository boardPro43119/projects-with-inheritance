public class HospitalEmployeeTester {
	public static void main(String[] args){
		Doctor johnSmith = new Doctor("John Smith", "Smithson General Hospital");
		Nurse marySue = new Nurse("Mary Sue", "Smithson General Hospital");
		Surgeon samuelJenkins = new Surgeon("Samuel Jenkins", "Smithson General Hospital");

		System.out.println(johnSmith.toString());
		System.out.println(marySue.toString());
		System.out.println(samuelJenkins.toString());

		johnSmith.scheduleAppointment("Richard Cruz", "Check-up");
		marySue.scheduleAppointment("Richard Cruz", "Check-up");

		johnSmith.schedulePrescription("Richard Cruz", "Amoxicillin");

		samuelJenkins.scheduleOperation("Bobby Mendez", "Tonsils out");

		System.out.println(johnSmith.toString());
		System.out.println(marySue.toString());
		System.out.println(samuelJenkins.toString());

		johnSmith.completeAppointment("Richard Cruz", "Check-up");
		samuelJenkins.completeOperation("Bobby Mendez", "Tonsils out");

		System.out.println(johnSmith.toString());
		System.out.println(marySue.toString());
		System.out.println(samuelJenkins.toString());

	}
}