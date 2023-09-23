package com.school.manage;
public class School {
	private int id;
	private String school_name;
	private String desciption;
	private String establish_date;
	private String status ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getEstablish_date() {
		return establish_date;
	}
	public void setEstablish_date(String establish_date) {
		this.establish_date = establish_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public School(int id, String school_name, String desciption, String establish_date, String status) {
		super();
		this.id = id;
		this.school_name = school_name;
		this.desciption = desciption;
		this.establish_date = establish_date;
		this.status = status;
	}
	public School()
	{
		
	}
	@Override
	public String toString() {
		return "id=" + id + "\nschool_name=" + school_name + "\ndesciption=" + desciption + "\nestablish_date="
				+ establish_date + "\nstatus=" + status ;
	}
	

}
