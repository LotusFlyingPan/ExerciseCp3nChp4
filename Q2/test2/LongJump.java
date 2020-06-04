package test2;

import java.util.Arrays;

public class LongJump {
	
	private String athleteID; // ex: 1145
	private String athleteName; // ex: Jehan Miskin
	private String teamCode; // ex: JHR, MLK, PRK
	private double[] jumpDistance = new double[2];

	public LongJump() {
		this.athleteID = null;
		this.athleteName = null;
		this.teamCode = null;
	}

	/**
	 * @param athleteID
	 * @param athleteName
	 * @param teamCode
	 * @param jumpDistance
	 */
	public LongJump(String athleteID, String athleteName, String teamCode, double[] jumpDistance) {
		super();
		this.athleteID = athleteID;
		this.athleteName = athleteName;
		this.teamCode = teamCode;
		this.jumpDistance = jumpDistance;
	}

	/**
	 * @return the athleteID
	 */
	public String getAthleteID() {
		return athleteID;
	}

	/**
	 * @return the athleteName
	 */
	public String getAthleteName() {
		return athleteName;
	}

	/**
	 * @return the teamCode
	 */
	public String getTeamCode() {
		return teamCode;
	}

	/**
	 * @return the jumpDistance
	 */
	public double[] getJumpDistance() {
		return jumpDistance;
	}

	/**
	 * @param athleteID the athleteID to set
	 */
	public void setAthleteID(String athleteID) {
		this.athleteID = athleteID;
	}

	/**
	 * @param athleteName the athleteName to set
	 */
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	/**
	 * @param teamCode the teamCode to set
	 */
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	/**
	 * @param jumpDistance the jumpDistance to set
	 */
	public void setJumpDistance(double[] jumpDistance) {
		this.jumpDistance = jumpDistance;
	}
	
	public double calcAverage() {
		double[] copy = this.getJumpDistance();
		double total = 0;
		double avg;
		for(int i = 0; i < this.jumpDistance.length; i++) {
			total += copy[i];
		}
		avg = total / this.getJumpDistance().length;
		return avg;
	}
	
	public String detStatus() {
		double avg = this.calcAverage();
		String status = "";
		if(avg >= 7) {
			status = "Qualified";
		}else if(avg >= 5 && avg < 7) {
			status = "Reserve";	
		}else if(avg < 5) {
			status = "Disqualified";
		}
		return status;
	}

	public String toString() {
		return "LongJump [getAthleteID()=" + getAthleteID() + ", getAthleteName()=" + getAthleteName()
				+ ", getTeamCode()=" + getTeamCode() + ", getJumpDistance()=" + Arrays.toString(getJumpDistance())
				+ ", calcAverage()=" + calcAverage() + ", detStatus()=" + detStatus() + "]";
	}

}
