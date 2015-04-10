package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridColModelPojo implements Serializable {

    private String label;
    private String name;
    private String key;
    private String width;

    private boolean editable;

    @JsonProperty("edittype")
    private String editType; // text
    
    private boolean sortable;
    
	@JsonProperty("sorttype")
    private String sortType;
    
    private String formatter;
    
    private boolean search;
    private String stype;
    
    @JsonProperty("editoptions")
    private JqGridEditOptionPojo editOptions = new JqGridEditOptionPojo();

    @JsonProperty("searchoptions")
    private JqGridSearchOptionPojo searchOptions = new JqGridSearchOptionPojo();
    
    @JsonProperty("formatoptions")
    private JqGridFormatOptionPojo formatOptions = new JqGridFormatOptionPojo();

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

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getEditType() {
		return editType;
	}

	public void setEditType(String editType) {
		this.editType = editType;
	}

	public boolean isSortable() {
		return sortable;
	}

	public void setSortable(boolean sortable) {
		this.sortable = sortable;
	}

    public String getSortType() {
        if (sortType != null) {
            return sortType;
        }
		return "text";
	}
	
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
	
	public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }

    public String getStype() {
        if (stype != null) {
            return stype;
        }
        return "text";
    }

    public void setStype(String stype) {
        this.stype = stype;
    }
    
    public JqGridEditOptionPojo getEditOptions() {
		return editOptions;
	}
	
	public void setEditOptions(JqGridEditOptionPojo editOptions) {
		this.editOptions = editOptions;
	}

	public JqGridSearchOptionPojo getSearchOptions() {
		return searchOptions;
	}
	
	public void setSearchOptions(JqGridSearchOptionPojo searchOptions) {
		this.searchOptions = searchOptions;
	}
	
	public JqGridFormatOptionPojo getFormatOptions() {
		return formatOptions;
	}
	
	public void setFormatOptions(JqGridFormatOptionPojo formatOptions) {
		this.formatOptions = formatOptions;
	}
	
}