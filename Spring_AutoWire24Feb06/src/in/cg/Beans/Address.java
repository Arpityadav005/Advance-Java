package in.cg.Beans;

public class Address {
	private int hno;
	private int pincode;
	private String city;
	
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", pincode=" + pincode + ", city=" + city + "]";
	}
	

}
