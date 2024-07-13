package com.central.in_books.domain;

public class Field {
	
	private Long id;
	private String name;
	
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
	
	@Override
	public String toString() {
		return "Field [id=" + id + ", name=" + name + "]";
	}
	
	public Field(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

}
