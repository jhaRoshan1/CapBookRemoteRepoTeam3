package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="use_gen")
	@SequenceGenerator(name="use_gen", sequenceName="use_seq",allocationSize=1,initialValue=110)
	private int userId;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	private String dob;
	private long mobileNo;
	
}
