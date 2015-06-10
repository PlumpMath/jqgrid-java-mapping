package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridFormatOptionsPojo implements Serializable {

    private boolean keys = false;

    @JsonProperty("srcformat")
    private String srcFormat;
    
    @JsonProperty("newformat")
    private String newFormat;
    
    @JsonProperty("defaultValue")
    private String defaultValue;

	private JqGridOptionPojo editOptions;
	
	private JqGridOptionPojo addOptions;
	
	private JqGridOptionPojo delOptions;

	public boolean isKeys() {
		return keys;
	}

	public void setKeys(boolean keys) {
		this.keys = keys;
	}

	public String getSrcFormat() {
        return srcFormat;
    }
	
	public void setSrcFormat(String srcFormat) {
        this.srcFormat = srcFormat;
    }

    public String getNewFormat() {
        return newFormat;
    }
    
    public void setNewFormat(String newFormat) {
        this.newFormat = newFormat;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public JqGridOptionPojo getEditOptions() {
		return editOptions;
	}

	public void setEditOptions(JqGridOptionPojo editOptions) {
		this.editOptions = editOptions;
	}

	public JqGridOptionPojo getAddOptions() {
		return addOptions;
	}

	public void setAddOptions(JqGridOptionPojo addOptions) {
		this.addOptions = addOptions;
	}

	public JqGridOptionPojo getDelOptions() {
		return delOptions;
	}

	public void setDelOptions(JqGridOptionPojo delOptions) {
		this.delOptions = delOptions;
	}
	
}