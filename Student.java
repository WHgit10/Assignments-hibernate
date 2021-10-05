package com.hibernate.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Student")
public class Student implements Serializable {
	@Id
	private int rollno;
	private String name;
	private long phno;
	private int standard;

}
