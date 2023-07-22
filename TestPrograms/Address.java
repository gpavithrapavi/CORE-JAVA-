package TestPrograms;

public class Address {
	
	int h_no;
	String v_name;
	int pin;
	
	public Address(int h_no, String v_name, int pin) {
		super();
		this.h_no = h_no;
		this.v_name = v_name;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [h_no=" + h_no + ", v_name=" + v_name + ", pin=" + pin + "]";
	}
	public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}


