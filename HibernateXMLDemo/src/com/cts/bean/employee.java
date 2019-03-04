package com.cts.bean;

import java.math.BigInteger;

public class employee {
	private int emp_id;
	private String emp_name;
	private String email;
	private BigInteger mobile;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getMobile() {
		return mobile;
	}
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

}
