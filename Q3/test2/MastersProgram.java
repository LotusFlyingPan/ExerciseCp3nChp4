package test2;

public class MastersProgram {
	
	private String modeStudy; // Coursework, Research, Mixed mode

	public MastersProgram() {
		this.modeStudy = null;
	}
	public MastersProgram(String modeStudy) {
		this.modeStudy = modeStudy;
	}
	/**
	 * @return the modeStudy
	 */
	public String getModeStudy() {
		return modeStudy;
	}
	/**
	 * @param modeStudy the modeStudy to set
	 */
	public void setModeStudy(String modeStudy) {
		this.modeStudy = modeStudy;
	}
	
	public double getTutionFeePS() {
		double fee = 0.00;
		if(this.modeStudy.equalsIgnoreCase("Coursework")) {
			fee = 2500.00;
		}else if(this.modeStudy.equalsIgnoreCase("Research")) {
			fee = 1500.00;
		}else if(this.modeStudy.equalsIgnoreCase("Mixed mode")) {
			fee = 1900.00;
		}
		return fee;
	}
	
	public int getNumOfSem() {
		int sem = 0;
		if(this.modeStudy.equalsIgnoreCase("Coursework")) {
			sem = 4;
		}else if(this.modeStudy.equalsIgnoreCase("Research")) {
			sem = 6;
		}else if(this.modeStudy.equalsIgnoreCase("Mixed mode")) {
			sem = 5;
		}
		return sem;
	}
	
	public double calculateTotalFee() {
		double libFee = 50.00; double adminFee = 25.00;
		double tutionFee = this.getTutionFeePS();
		int numSem = this.getNumOfSem();
		double total = (tutionFee * numSem) + (libFee * numSem) + (adminFee * numSem);
		return total;
	}

}
