package kh.gw.dto;

import java.util.Date;

public class TnA_objectionDTO {
	private int tna_obj_seq;
	private String tna_obj_reason;
	private String tna_obj_id;
	private Date tna_obj_reg_date;
	private int tna_obj_changed_code;
	private int tna_seq;
	private String tna_obj_status;
	private int tna_obj_proc_status_code;
	private int tna_obj_ori_status_code;
	private Date tna_obj_time;
	
	public TnA_objectionDTO() {}
	public TnA_objectionDTO(int tna_obj_seq, String tna_obj_reason, String tna_obj_id, Date tna_obj_reg_date,
			int tna_obj_changed_code, int tna_seq, String tna_obj_status, int tna_obj_proc_status_code,
			int tna_obj_ori_status_code, Date tna_obj_time) {
		super();
		this.tna_obj_seq = tna_obj_seq;
		this.tna_obj_reason = tna_obj_reason;
		this.tna_obj_id = tna_obj_id;
		this.tna_obj_reg_date = tna_obj_reg_date;
		this.tna_obj_changed_code = tna_obj_changed_code;
		this.tna_seq = tna_seq;
		this.tna_obj_status = tna_obj_status;
		this.tna_obj_proc_status_code = tna_obj_proc_status_code;
		this.tna_obj_ori_status_code = tna_obj_ori_status_code;
		this.tna_obj_time = tna_obj_time;
	}
	public int getTna_obj_seq() {
		return tna_obj_seq;
	}
	public void setTna_obj_seq(int tna_obj_seq) {
		this.tna_obj_seq = tna_obj_seq;
	}
	public String getTna_obj_reason() {
		return tna_obj_reason;
	}
	public void setTna_obj_reason(String tna_obj_reason) {
		this.tna_obj_reason = tna_obj_reason;
	}
	public String getTna_obj_id() {
		return tna_obj_id;
	}
	public void setTna_obj_id(String tna_obj_id) {
		this.tna_obj_id = tna_obj_id;
	}
	public Date getTna_obj_reg_date() {
		return tna_obj_reg_date;
	}
	public void setTna_obj_reg_date(Date tna_obj_reg_date) {
		this.tna_obj_reg_date = tna_obj_reg_date;
	}
	public int getTna_obj_changed_code() {
		return tna_obj_changed_code;
	}
	public void setTna_obj_changed_code(int tna_obj_changed_code) {
		this.tna_obj_changed_code = tna_obj_changed_code;
	}
	public int getTna_seq() {
		return tna_seq;
	}
	public void setTna_seq(int tna_seq) {
		this.tna_seq = tna_seq;
	}
	public String getTna_obj_status() {
		return tna_obj_status;
	}
	public void setTna_obj_status(String tna_obj_status) {
		this.tna_obj_status = tna_obj_status;
	}
	public int getTna_obj_proc_status_code() {
		return tna_obj_proc_status_code;
	}
	public void setTna_obj_proc_status_code(int tna_obj_proc_status_code) {
		this.tna_obj_proc_status_code = tna_obj_proc_status_code;
	}
	public int getTna_obj_ori_status_code() {
		return tna_obj_ori_status_code;
	}
	public void setTna_obj_ori_status_code(int tna_obj_ori_status_code) {
		this.tna_obj_ori_status_code = tna_obj_ori_status_code;
	}
	public Date getTna_obj_time() {
		return tna_obj_time;
	}
	public void setTna_obj_time(Date tna_obj_time) {
		this.tna_obj_time = tna_obj_time;
	}
	
	
	
}
