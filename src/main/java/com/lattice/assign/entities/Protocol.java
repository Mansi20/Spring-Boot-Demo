package com.lattice.assign.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="protocol")
public class Protocol {
  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="protocol_id")
   private int id;
	@Column
   private String title;
	@Column(name="created_on")
   private Date createdOn;
	
	public Protocol(int id) {
		super();
		this.id = id;
	}
	private boolean used=false;
	
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getEffectivityDate() {
		return effectivityDate;
	}
	public void setEffectivityDate(Date effectivityDate) {
		this.effectivityDate = effectivityDate;
	}
	@Column(name="effectivity_date")
   private Date effectivityDate;
}
