package VO;

import java.io.Serializable;

public class VehicleCategoryVO implements Serializable {
	private int vcid;
	private String category,categorydescription;
	public int getVcid() {
		return vcid;
	}
	public void setVcid(int vcid) {
		this.vcid = vcid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategorydescription() {
		return categorydescription;
	}
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	
}
