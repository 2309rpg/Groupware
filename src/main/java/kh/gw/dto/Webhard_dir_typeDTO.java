package kh.gw.dto;

public class Webhard_dir_typeDTO {
	private String wh_dir_type_code;
	private String wh_dir_type_name;
	public Webhard_dir_typeDTO(String wh_dir_type_code, String wh_dir_type_name) {
		super();
		this.wh_dir_type_code = wh_dir_type_code;
		this.wh_dir_type_name = wh_dir_type_name;
	}
	public Webhard_dir_typeDTO() {
		super();
	}
	public String getWh_dir_type_code() {
		return wh_dir_type_code;
	}
	public void setWh_dir_type_code(String wh_dir_type_code) {
		this.wh_dir_type_code = wh_dir_type_code;
	}
	public String getWh_dir_type_name() {
		return wh_dir_type_name;
	}
	public void setWh_dir_type_name(String wh_dir_type_name) {
		this.wh_dir_type_name = wh_dir_type_name;
	}
	
}
