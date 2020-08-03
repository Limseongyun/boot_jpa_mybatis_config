package com.example.demo.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookVO {
	
	@Id@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_id")
	@SequenceGenerator(name = "sequence_id",allocationSize = 1,sequenceName = "id_seq")
	private Long id;
	
	
	private String name;
	
	
	private String categori;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategori() {
		return categori;
	}
	public void setCategori(String categori) {
		this.categori = categori;
	}
	
	

}
