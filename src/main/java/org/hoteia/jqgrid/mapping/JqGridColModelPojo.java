package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JqGridColModelPojo implements Serializable {

    private String label;
    private String name;
    private String key;
    private String width;

    private String sortable;
    private String sorttype;
    private String stype;
    
    @JsonRawValue
    private String formatter;
    
    private String search;

    private JqGridSearchOptionPojo searchoptions = new JqGridSearchOptionPojo();
    private JqGridFormatOptionPojo formatoptions = new JqGridFormatOptionPojo();

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getSortable() {
		return sortable;
	}
	
	public void setSortable(String sortable) {
		this.sortable = sortable;
	}
	
	public String getSorttype() {
		return sorttype;
	}

	public void setSorttype(String sorttype) {
		this.sorttype = sorttype;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
	
	public String getSearch() {
		return search;
	}
	
	public void setSearch(String search) {
		this.search = search;
	}

	public JqGridSearchOptionPojo getSearchoptions() {
		return searchoptions;
	}
	
	public void setSearchoptions(JqGridSearchOptionPojo searchoptions) {
		this.searchoptions = searchoptions;
	}

	public JqGridFormatOptionPojo getFormatoptions() {
		return formatoptions;
	}
	
	public void setFormatoptions(JqGridFormatOptionPojo formatoptions) {
		this.formatoptions = formatoptions;
	}
	
}