package com.CRUD.CRUD.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tbl_student")
public class Student {
		@Column
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		@Column
		private String name;
		@Column
		private String gender;
		@Column
		private String clas;
		@Column
		private long fees;
		@Column
		private Date dob;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getClas() {
			return clas;
		}
		public void setClas(String clas) {
			this.clas = clas;
		}
		public long getFees() {
			return fees;
		}
		public void setFees(long fees) {
			this.fees = fees;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", clas=" + clas + ", fees=" + fees
					+ ", dob=" + dob + "]";
		}
		
		
	
		
		
}
