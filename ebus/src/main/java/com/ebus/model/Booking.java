package com.ebus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "BOOKING")
public class Booking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5930901738615308916L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name = "SSO_ID",  nullable = false)
	private String hallName;

	

}
