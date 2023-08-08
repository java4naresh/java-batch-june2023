public class EncapsulationClient {

	public static void main(String[] args) {
		StudentData stData = new StudentData();
		System.out.println(stData);
		stData.setName("Srilatha");
		stData.setAge(23);
		stData.setGender('F');
		stData.setMothersName("Leelavathi");
		stData.setFathersName("Saidachary");
		stData.setPhoneNumber("91-9705410575");
		System.out.println(stData.getName());
		System.out.println(stData.getAge());
		System.out.println(stData.getGender());
		System.out.println(stData.getMothersName());
		System.out.println(stData.getFathersName());
		System.out.println(stData.getPhoneNumber());
		
		StudentData stData2 = new StudentData("Syamala", 'F', 22,  "Vennela", "Sudhakar","91-9123455654");
		System.out.println(stData2);
		stData2.setFathersName("RamiReddy");
		System.out.println(stData2);
	
	}

}