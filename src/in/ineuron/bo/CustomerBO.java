package in.ineuron.bo;


//BO => Business Object
public class CustomerBO {
	
	private String customerName;
	private String customerAddress;
	
	private Float pamt;
	private Float rate;
	private Float time;
	
	private Float intAmount;
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public void setIntAmount(Float intAmount) {
		this.intAmount = intAmount;
	}

	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", intAmount=" + intAmount + "]";
	}
	
}
