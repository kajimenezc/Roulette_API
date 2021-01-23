package com.spring.entitys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="id")
	private Long   id;
	@Column(name="id_roulette")
	private Long   idRoulette;
	@Column(name="number")
	private long  number;
	@Column(name="colour")
	private String colour;
	@Column(name="value")
	private float   value;
	public Long getId() {	
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdRoulette() {	
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {
		this.idRoulette = idRoulette;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getColour() {
		return colour;
	}
	public void setColor(String colour) {
		this.colour = colour;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
}