package com.sxit.model.pmp;

import java.util.Date;


public class BProjSum {
	private Long proj_sum_id;//序列号
	private String city_Code;//城市ID 
	private String status;//状态  1=在售,2=已售
	private Date create_time;//统计时间
	private Integer subsc_sum;
	private String big_name;
	private String city_name;
	
	public String getBig_code() {
		return big_code;
	}
	public void setBig_code(String big_code) {
		this.big_code = big_code;
	}
	public String getCity_Code() {
		return city_Code;
	}
	public void setCity_Code(String city_Code) {
		this.city_Code = city_Code;
	}
	public String getBig_name() {
		return big_name;
	}
	public void setBig_name(String big_name) {
		this.big_name = big_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Integer getSubsc_sum() {
		return subsc_sum;
	}
	public void setSubsc_sum(Integer subsc_sum) {
		this.subsc_sum = subsc_sum;
	}
	public Long getProj_sum_id() {
	    return this.proj_sum_id;
	}
	public void setProj_sum_id(Long proj_sum_id) {
	    this.proj_sum_id=proj_sum_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}