package com.sxit.model.pmp;

import java.util.Date;


public class BProjSum {
	private Long proj_sum_id;//序列号
	private String status;//状态  1=在售,2=已售
	private Date create_time;//统计时间
	private Integer subsc_sum;

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