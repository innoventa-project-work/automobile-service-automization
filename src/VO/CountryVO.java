package VO;

import java.io.Serializable;

public class CountryVO implements Serializable {
	private int cid;
	private String countryname;
	private String countrydesc;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrydesc() {
		return countrydesc;
	}
	public void setCountrydesc(String countrydesc) {
		this.countrydesc = countrydesc;
	}
	
	
}
