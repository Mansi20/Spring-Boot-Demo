package com.lattice.assign.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user")
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
    private int id;
	@Column
    private String user_name;
	
	// to ignore the email id
	@Column
	@JsonIgnore
	private String email;
	//each user can have multiple devices
	@OneToMany
	@JoinColumn(name="device_id")
	private Set<Device> device;
	//each user can have only one tag i.e Admin,Manager,Operator
	@OneToOne
	@JoinColumn(name="tag_id")
	private Tag tag;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Device> getDevice() {
		return device;
	}
	public void setDevice(Set<Device> device) {
		this.device = device;
	}
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
}
