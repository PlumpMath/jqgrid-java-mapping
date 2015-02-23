package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridEditOptionPojo implements Serializable {

	private String value;
	
	@JsonProperty("custom_value")
	private String customValue;

	@JsonProperty("custom_element")
	private String customElement;

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public String getCustomValue() {
		return customValue;
	}

	public void setCustomValue(String customValue) {
		this.customValue = customValue;
	}

	public String getCustomElement() {
		return customElement;
	}

	public void setCustomElement(String customElement) {
		this.customElement = customElement;
	}
	
}