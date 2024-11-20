package com.taraktech.springboot22.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "springemp")
public class Employee {
	
	@Id
	@Column(name = "ENO")
	private Long eno;
	@Column(name = "ENAME")
	private String ename;
	@Column(name = "ESAL")
	private Float esal;
	@Column(name = "EADDR")
	private String eaddr;
	public Long getEno() {
		return eno;
	}
	public void setEno(Long eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Float getEsal() {
		return esal;
	}
	public void setEsal(Float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}
	
}
