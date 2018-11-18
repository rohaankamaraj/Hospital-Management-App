package rkamaraj;

public class HospitalManagementTest {
	public static void main(String[] args) {
		HospitalManagement saku = new HospitalManagement();
		
		saku.determineTypeOfSurgery("heart");
		saku.determineBillAmount();
		saku.determineAmountPaidByInsurance();
		saku.determineAmountPaidByPatient();
		
		System.out.println("Saku just had " + saku.returnTypeOfSurgery() + " surgery.");
		System.out.println("Saku's initial total bill was $" + saku.returnBillAmount());
		System.out.println("Saku's insurance covers " + (saku.returnCoverageByInsurance() * 100)+ "% of the bill");
		System.out.println("Saku's insurance paid off $" + saku.returnAmountPaidByInsurance());
		System.out.println("Saku has to pay the remaining $" + saku.returnAmountPaidByPatient());
	}
}
