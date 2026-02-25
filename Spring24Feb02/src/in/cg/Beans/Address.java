package in.cg.Beans;

public class Address {
	
	private int pincode;
	private int hno;
	private String city;
	
public Address(int pincode,int hno,String city) {
	this.city = city;
	this.pincode = pincode;
	this.hno = hno;
}

@Override
public String toString() {
	return "Address [pincode=" + pincode + ", hno=" + hno + ", city=" + city + "]";
}
	
	
	

}
