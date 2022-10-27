package com.example.demo.model;

import java.io.Serializable;

public class Subject implements Serializable{
	 private int SubId;
	 private String Name;
	 private String Credit;
	public int getSubId() {
		return SubId;
	}
	public void setSubId(int subId) {
		SubId = subId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	public Subject(int subId, String name, String credit) {
		super();
		SubId = subId;
		Name = name;
		Credit = credit;
	}
	public Subject() {
		super();
	}
	 
	 
}
