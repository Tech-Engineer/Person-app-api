package com.person.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonModel {
	
	@JsonProperty
	private String first_name;
	@JsonProperty
	private String last_name;
	@JsonProperty
	private int age;
	@JsonProperty
	private String favourite_color;
	@JsonProperty
	private String hobby[];
	
	public PersonModel() {}
	
	public PersonModel(String fName, String lName, int age, String favColor, String[] hobby) {
		first_name = fName;
		last_name = lName;
		this.age = age;
		favourite_color = favColor;
		this.hobby = hobby;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavourite_color() {
		return favourite_color;
	}

	public void setFavourite_color(String favourite_color) {
		this.favourite_color = favourite_color;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String hobby[]) {
		this.hobby = hobby;
	}	
}
