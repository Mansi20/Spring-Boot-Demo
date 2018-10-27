package com.lattice.assign.entities;

import java.util.Set;

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
	@Table(name="device")
	public class Device 
	{
	  
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="device_id")
	    private int id;
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
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Set<Protocol> getProtocol() {
			return protocol;
		}

		public void setProtocol(Set<Protocol> protocol) {
			this.protocol = protocol;
		}

	
		
}
