package rkamaraj;

public class HospitalManagement {
	private boolean isInsured;
	private double coverageByInsurance;
	private double billAmount;
	private double amountPaidByInsurance;
	private double amountPaidByPatient;
	private String typeOfSurgery;
	
	public HospitalManagement() {
		isInsured = true;
		coverageByInsurance = 0.65;
		billAmount = 0.0;
		amountPaidByInsurance = 0.0;
		amountPaidByPatient = billAmount;
		typeOfSurgery = "";
	}
	
	public void determineTypeOfSurgery(String a) {
		if (a.equals("heart")) {
			typeOfSurgery = "heart";
		}
		else if (a.equals("lungs")) {
			typeOfSurgery = "lungs";
		}
		else if (a.equals("knees")) {
			typeOfSurgery = "knees";
		}
	}
	
	
	public void determineBillAmount() {
		if (typeOfSurgery.equals("heart")) {
			billAmount = 200_000;
		}
		else if (typeOfSurgery.equals("lungs")) {
			billAmount = 100_000;
		}
		else if (typeOfSurgery.equals("knees")) {
			billAmount = 50_000;
		}
	}
	
	public void determineAmountPaidByInsurance() {
		amountPaidByInsurance = coverageByInsurance * billAmount;
	}
	
	public void determineAmountPaidByPatient() {
		amountPaidByPatient = billAmount - amountPaidByInsurance;
	}
	
	public double returnBillAmount() {
		return billAmount;
	}
	
	public double returnCoverageByInsurance() {
		return coverageByInsurance;
	}
	
	public double returnAmountPaidByInsurance() {
		return amountPaidByInsurance;
	}
	
	public double returnAmountPaidByPatient() {
		return amountPaidByPatient;
	}
	
	public String returnTypeOfSurgery() {
		return typeOfSurgery;
	}
	
}
