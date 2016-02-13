package VO;
import java.io.Serializable;
public class cityVO implements Serializable {

	private int cityId;
	private String cityName;
	private String cityDescription;

	StateVO stateVO;
	StateVO sv = new StateVO();
	
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityDescription() {
		return cityDescription;
	}
	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}
	public StateVO getStateVO() {
		return stateVO;
	}
	public void setStateVO(StateVO stateVO) {
		this.stateVO = stateVO;
	}
	public StateVO getSv() {
		return sv;
	}
	public void setSv(StateVO sv) {
		this.sv = sv;
	}

	
}
