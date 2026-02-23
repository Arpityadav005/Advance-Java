package in.cg.Beans;


public class Person {
	
	private int pid;
	private String pname;
	private String gender;
	
	
	public int getPin() {
		return pid;
	}
	public void setPin(int pin) {
		this.pid = pin;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [pin=" + pid + ", pname=" + pname + ", gender=" + gender + "]";
	}
	
}
