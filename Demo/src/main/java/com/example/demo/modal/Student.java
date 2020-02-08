package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Student {

	@Id
	@ApiModelProperty(notes = "Add Student id")
	Integer st_id;
	@ApiModelProperty(notes = "Add Student Name")
	String st_name;
	@ApiModelProperty(notes = "Add Student total Marks")
	Double st_marks;
	@ApiModelProperty(notes = "Add Student Contact Number")
	Long st_mobno;

	@Override
	public String toString() {
		return "Student [st_id=" + st_id + ", st_name=" + st_name + ", st_marks=" + st_marks + ", st_mobno=" + st_mobno
				+ "]";
	}

	public Integer getSt_id() {
		return st_id;
	}

	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public Double getSt_marks() {
		return st_marks;
	}

	public void setSt_marks(Double st_marks) {
		this.st_marks = st_marks;
	}

	public Long getSt_mobno() {
		return st_mobno;
	}

	public void setSt_mobno(Long st_mobno) {
		this.st_mobno = st_mobno;
	}
}
