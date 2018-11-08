package com.lattice.assign.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="device_user_map")
public class Device_user_map {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
    private int id;
	
	/*@OneToMany
	@Column(name="device_id")
	private List<Device> device;
	*/
/*	public List<Device> getDevice() {
		return device;
	}

	public void setDevice(List<Device> device) {
		this.device = device;
	}*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	@Column(name="user_id")
    private int userId;
		@Column
    private String user_name;
	
	// to ignore the email id
	@Column
	
	private String email;

	@Column
	private boolean isActive;
	
	@Column
	private Date created_on;
	
	/*@OneToMany
	@JoinColumn(name="device_id")
	private List<Device> device;
*/
	
	

}
