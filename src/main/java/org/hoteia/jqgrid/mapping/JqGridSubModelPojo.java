package org.hoteia.jqgrid.mapping;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridSubModelPojo<C> {

	@JsonProperty("name")
	private List<String> names = new ArrayList<String>();

	@JsonProperty("width")
	private List<Integer> widths = new ArrayList<Integer>();

	@JsonProperty("align")
	private List<String> aligns = new ArrayList<String>();

	private boolean params = false;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<Integer> getWidths() {
		return widths;
	}

	public void setWidths(List<Integer> widths) {
		this.widths = widths;
	}

	public List<String> getAligns() {
		return aligns;
	}

	public void setAligns(List<String> aligns) {
		this.aligns = aligns;
	}

	public boolean isParams() {
		return params;
	}

	public void setParams(boolean params) {
		this.params = params;
	}

}
