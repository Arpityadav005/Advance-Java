package in.cg.Beans;

public class Address {
	
	private int pincode;
	private String city;
	

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	

}
