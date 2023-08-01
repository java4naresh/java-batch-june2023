package abstraction_examples;

public class StudentEnquiry {

	public static void main(String[] args) {
		KrishnaveniDegreeCollege kdc = new KrishnaveniDegreeCollege();
		VasaviDegreeCollege vdc = new VasaviDegreeCollege();
		kdc.collegeFee();
		vdc.collegeFee();
		kdc.examinationFee();
		vdc.examinationFee();

	}

}
