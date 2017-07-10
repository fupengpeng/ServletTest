package bean;

public class UserInfo {
	
	private String code;
	private String info;
	private String data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "UserInfo [code=" + code + ", info=" + info + ", data=" + data + ", getCode()=" + getCode()
				+ ", getInfo()=" + getInfo() + ", getData()=" + getData() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
