package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridSearchOptionPojo implements Serializable {

	private String test;
	
	public String getTest() {
		return test;
	}
	
	public void setTest(String test) {
		this.test = test;
	}
}