package in.cg.beans;

public class Address {
	
	private int pincode;
	private String location;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void display() {
		System.out.println("Pincode :"+pincode+" Location: "+location);
	}

}
