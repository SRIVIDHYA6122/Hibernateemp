package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //create table Student
public class Employee {
	@Id   //primary key
private int eid;
private String ename;
private float esalary;
//generate setter and getter method 
//generate toString
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getEsalary() {
	return esalary;
}
public void setEsalary(float esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ",esalary="+ esalary+"]";
}
}