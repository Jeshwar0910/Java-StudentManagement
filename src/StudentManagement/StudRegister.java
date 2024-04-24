package StudentManagement;

import java.time.*;

public class StudRegister {

	private int studId;
	private String studName;
	private String studDob;
	private int age;
public static int idCounter=1;
	public StudRegister(int studId, String studName, String studDob, int age) {
		this.studId = studId;
		this.studName = studName;
		this.studDob = studDob;
		this.age = age;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getstudName() {
		return studName;
	}

	public void setstudName(String studName) {
		this.studName = studName;
	}

	public String getstudDob() {
		return studDob;
	}

	public void setstudDob(String studDob) {

		this.studDob = studDob;
	}

	public static int idCounter() {
	return	idCounter++;
	}
	
	
	
	public static int ageCalculation(String studDob) {

		LocalDate ageCalculation = LocalDate.parse(studDob);
		LocalDate currentDate = LocalDate.now();

		Period age = Period.between(ageCalculation, currentDate);

//	int dobyear=age.getYears();

		return age.getYears();

	}

	public String toString() {

		return "{" + studId + " " + studName + " " + studDob + " " + age +"}";

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
