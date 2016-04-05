package VO;

import java.io.Serializable;

public class AmcVO implements Serializable
{
	private int amcid;
	private String amctitle,amcprice,amcdesc;
	public int getAmcid() {
		return amcid;
	}
	public void setAmcid(int amcid) {
		this.amcid = amcid;
	}
	public String getAmctitle() {
		return amctitle;
	}
	public void setAmctitle(String amctitle) {
		this.amctitle = amctitle;
	}
	public String getAmcprice() {
		return amcprice;
	}
	public void setAmcprice(String amcprice) {
		this.amcprice = amcprice;
	}
	public String getAmcdesc() {
		return amcdesc;
	}
	public void setAmcdesc(String amcdesc) {
		this.amcdesc = amcdesc;
	}
	
}
