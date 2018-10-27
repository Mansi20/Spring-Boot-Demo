package com.lattice.assign.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="device_user_map")
public class Device_user_map {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="device_id")
    private int deivceId;
	@Column
    private String description;
	@Column
	private String status;
	@Column(name="operator_id")
	private String operatorId;
	
	//each device can have multiple protocols
	@OneToMany
    @JoinColumn(name="protocol_id")
	private Set<Protocol> protocol;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
    private int userId;
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
	
	@ManyToMany
	@JoinTable(name = "mapped_id", joinColumns = { @JoinColumn(name = "device_id") }, inverseJoinColumns = { @JoinColumn(name = "user_id") })
	private int mappedId;
	
}
