package com.hibernate.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	@ManyToMany
	private List<Project>project;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Emp(int eid, String name, List<Project> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.project = project;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
