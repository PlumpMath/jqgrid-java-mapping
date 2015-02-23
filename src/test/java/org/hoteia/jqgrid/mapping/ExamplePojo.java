package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ExamplePojo implements Serializable {

	private String example;
	
	public String getExample() {
		return example;
	}
	
	public void setExample(String example) {
		this.example = example;
	}
}
