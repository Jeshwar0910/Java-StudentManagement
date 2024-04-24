package StudentManagement;

public class StudRegister {

	
	private int studId;
	private String studName;
	private String studDob;
	
	public StudRegister(int studId,String studName,String studDob) {
		this.studId=studId;
		this.studName=studName;
		this.studDob=studDob;
		
		
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}
	
public String getstudName() {
return studName;}


public void setstudName(String studName) {
	this.studName=studName;
}
public String getstudDob() {
	return studDob;
}

public void setstudDob(String studDob) {
	
	this.studDob=studDob;
}

public String toString() {
	
	return "{"+studId+" "+studName+" "+studDob+"}";
	
}



}
