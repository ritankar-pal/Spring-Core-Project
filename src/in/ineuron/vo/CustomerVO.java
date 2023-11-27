package in.ineuron.vo;

//VO => Value Object
public class CustomerVO {
	
	private String customerName;
	private String customerAddress;
	private String pamt;
	private String rate;
	private String time;
	
	static {
		System.out.println("CustomerVO .class file loading...");
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setPamt(String pamt) {
		this.pamt = pamt;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CustomerVO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + "]";
	}
}
