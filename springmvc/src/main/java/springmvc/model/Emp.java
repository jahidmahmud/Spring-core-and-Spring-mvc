package springmvc.model;

import java.util.Date;
import java.util.List;


public class Emp {
	private String name;
	private Long id;
	private Date dob;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private List<String> courses;
	private String gender;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", dob=" + dob + ", address=" + address + ", courses=" + courses
				+ ", gender=" + gender + "]";
	}
	
	

}
