package com.spring.entitys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="roulettes")
public class Roulette {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long   id;
	@Column(name="status", nullable=false, length=30)
	private String status;
	public Long getId() {
		
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}